package br.com.anm.crud_projetos.projeto_crud.controle;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProdutoControle {

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!";
    }
} 