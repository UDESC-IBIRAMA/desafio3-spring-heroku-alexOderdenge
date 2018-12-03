
package trabalho2.veiculos;

import Model.Modelo;
import Model.ModeloRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Oderdenge
 */

@RestController
@RequestMapping("/modelos")
public class ModeloResource {

    @Autowired
    private ModeloRepositorio modelos;

    @GetMapping
    public List<Modelo> listar(){
        return modelos.findAll();
    }

    @PostMapping
    public Modelo salvar(@RequestBody Modelo alter){
        return modelos.save(alter);
    }

    @PutMapping
    public Modelo editar(@RequestBody Modelo alter){
        return modelos.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        modelos.deleteById(id);
    }
}