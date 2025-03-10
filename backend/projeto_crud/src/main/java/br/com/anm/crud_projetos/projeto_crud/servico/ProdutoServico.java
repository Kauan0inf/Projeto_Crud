package br.com.anm.crud_projetos.projeto_crud.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anm.crud_projetos.projeto_crud.modelo.ProdutoModelo;
import br.com.anm.crud_projetos.projeto_crud.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
    
    @Autowired
    private ProdutoRepositorio pr;

    public Iterable <ProdutoModelo> listar(){
        return pr.findAll();

    }
    
}
