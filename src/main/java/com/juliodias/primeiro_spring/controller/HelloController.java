package com.juliodias.primeiro_spring.controller;

import com.juliodias.primeiro_spring.dto.ProdutoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    //Aula Dia 24 - Retorno de objetos e JSON
    @GetMapping("/produtos/{id}")
    public ProdutoResponse  produtos(@PathVariable Long id) {
        return new ProdutoResponse(id,"Notebook Lenovo", 4500.00);
    }

    @GetMapping("/produtos")
    public List<ProdutoResponse>  listaProdutos() {
        return List.of(
                new ProdutoResponse(1L, "Notebook Lenovo", 4500.00),
                new ProdutoResponse(2L, "Monitor Dell", 1200.00),
                new ProdutoResponse(3L, "Teclado Logitech", 350.00)
        );
    }
}
