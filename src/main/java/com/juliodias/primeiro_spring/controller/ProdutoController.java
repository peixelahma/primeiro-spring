package com.juliodias.primeiro_spring.controller;

import com.juliodias.primeiro_spring.dto.ProdutoResponse;
import com.juliodias.primeiro_spring.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {
    
    private final ProdutoService produtoService;
    
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    
    @GetMapping("/produtos/{id}")
    public ProdutoResponse listaProdutosPorId(@PathVariable Long id) {
        return produtoService.findById(id);
    }
    
    @GetMapping("/produtos")
    public List<ProdutoResponse> listaProdutos() {
        return produtoService.list();
    }
}
