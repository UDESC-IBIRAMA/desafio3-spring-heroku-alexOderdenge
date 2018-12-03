
package trabalho2.veiculos;

import Model.Veiculo;
import Model.VeiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Odedenge
 */

@RestController
@RequestMapping("/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoRepositorio veiculo;

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo alter){
        return veiculo.save(alter);
    }

    @PutMapping
    public Veiculo editar(@RequestBody Veiculo alter){
        return veiculo.save(alter);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        veiculo.deleteById(id);
    }
}