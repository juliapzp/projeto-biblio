
package com.senai.biblioadmin.controller;

import com.senai.biblioadmin.entity.Livro;
import com.senai.biblioadmin.service.LivroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
    
    @Autowired
    private LivroService livroService;
    
    
    @GetMapping("/livro")
    public ResponseEntity<List<Livro>> listarLivros(){
        List<Livro> listCli = livroService.listarLivro();
        if(! listCli.isEmpty()){
            return new ResponseEntity<>(listCli ,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }// http://localhost:8010/biblio/

    
    @PutMapping("/livro")
    public ResponseEntity<Boolean> alterarLivro(@RequestBody Livro livro){
       if(livroService.alterarLivro(livro)){
           return new ResponseEntity<>(true, HttpStatus.OK);
       }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }// http://localhost:8010/biblio/
    
    
    @PostMapping("/livro")
    public ResponseEntity<Long> incluirNovoCliente(@RequestBody Livro livro){
        Long idLiv = livroService.incluirLivro(livro);
        if(idLiv != null){
            return new ResponseEntity<>(idLiv, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }// http://localhost:8010/biblio/
    
    
    @DeleteMapping("/livro/{IdLivro}")
    public ResponseEntity<Long> exluirLivro(@PathVariable ("IdLivro")Long IdLivro){
        if(livroService.excluirLivro(IdLivro)){
            return new ResponseEntity<>(HttpStatus.OK);
        }       
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }// http://localhost:8010/biblio/
    
    
     @GetMapping("/livro/titulo/{titulo}")
    public ResponseEntity<Livro> consultaEstudantePorMatricula(
                                   @PathVariable("titulo") String titulo){
        Livro livro = livroService.consultaLivroPorTitulo(titulo);
        if(livro != null){
            return new ResponseEntity<>(livro,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }// http://localhost:8010/biblio/
}
