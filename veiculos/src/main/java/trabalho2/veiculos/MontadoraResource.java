
package trabalho2.veiculos;

import Model.Montadora;
import Model.MontadoraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/montadoras")
public class MontadoraResource {

    @Autowired
    private MontadoraRepositorio montadoras;

    @PostMapping
    public Montadora salvar(@RequestBody Montadora alter){
        return montadoras.save(alter);
    }

    @PutMapping
    public Montadora editar(@RequestBody Montadora alter){
        return montadoras.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        montadoras.deleteById(id);
    }
}