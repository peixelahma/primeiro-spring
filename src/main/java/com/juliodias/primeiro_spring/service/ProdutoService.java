package com.juliodias.primeiro_spring.service;

import com.juliodias.primeiro_spring.dto.ProdutoRequest;
import com.juliodias.primeiro_spring.dto.ProdutoResponse;
import com.juliodias.primeiro_spring.entity.Produto;
import com.juliodias.primeiro_spring.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoResponse findById(Long id){

        Optional<Produto> optional = produtoRepository.findById(id);

        Produto produto = optional.orElseThrow();

        return new ProdutoResponse(produto.getId(), produto.getNome(), produto.getPreco());

    }

    public List<ProdutoResponse>  list() {

        List<Produto> produtos = produtoRepository.findAll();

        List<ProdutoResponse> produtosResponse = new ArrayList<>();
        for (Produto produto : produtos) {
            produtosResponse.add(new ProdutoResponse(produto.getId(), produto.getNome(), produto.getPreco()));
        }

        return produtosResponse;
    }

    public ProdutoResponse cadastro (ProdutoRequest request) {

        Produto produto = new Produto (request.nome(), request.preco());

        Produto produtoSalvo = produtoRepository.save(produto);

        return new ProdutoResponse(produtoSalvo.getId(),
                produtoSalvo.getNome(),
                produtoSalvo.getPreco());
    }
}
