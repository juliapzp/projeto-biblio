
package com.senai.biblioadmin.service;

import com.senai.biblioadmin.entity.Livro;
import com.senai.biblioadmin.repository.LivroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;
    
    public Long incluirLivro(Livro livro){
        
        if(livro.getTitulo() == null || livro.getTitulo() == ""){
            return null;
        }
         if(livro.getAutor() == null || livro.getAutor() == ""){
            return null;
        }
          if(livro.getEditora() == null || livro.getEditora() == ""){
            return null;
        }
           if(livro.getAno() == null || livro.getAno() == ""){
            return null;
        }
        return livroRepository.save(livro).getIdLivro();
    }
    
    
    public boolean excluirLivro(Long IdLivro){
      if(livroRepository.findById(IdLivro).isPresent()){
          livroRepository.deleteById(IdLivro);
          return true;
      }
        return false;
    }
    
    
    public List<Livro> listarLivro(){
        return livroRepository.findAll();
    }
     
     
    public boolean alterarLivro(Livro livro){
        
         if(livro.getTitulo() == null || livro.getTitulo() == ""){
            return false;
        }
         if(livro.getAutor() == null || livro.getAutor() == ""){
            return false;
        }
          if(livro.getEditora() == null || livro.getEditora() == ""){
            return false;
        }
           if(livro.getAno() == null || livro.getAno() == ""){
            return false;
        }
         
         Livro cliBD = livroRepository.getReferenceById(livro.getIdLivro());
       
        if( cliBD != null){
       
        
        cliBD.setTitulo(livro.getTitulo());
        cliBD.setAutor(livro.getAutor());
        cliBD.setEditora(livro.getEditora());
        cliBD.setAno(livro.getAno());
        
        livroRepository.save(cliBD);
        return true;
        }
        return false;
    }
    
    public Livro consultaLivroPorTitulo(String titulo){
        return livroRepository.findByTitulo(titulo);
    }
}
