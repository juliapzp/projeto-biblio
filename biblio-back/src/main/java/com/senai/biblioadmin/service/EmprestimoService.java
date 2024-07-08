package com.senai.biblioadmin.service;

import com.senai.biblioadmin.entity.Emprestimo;
import com.senai.biblioadmin.entity.Estudante;
import com.senai.biblioadmin.entity.Livro;
import com.senai.biblioadmin.repository.EmprestimoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmprestimoService {
    
   @Autowired
   private EmprestimoRepository emprestimoRepository;
   
    public Long incluirEmprestimo(Emprestimo emprestimo){
        if(emprestimo.getLivro() == null ){
            return null;
        }
       
      
        if(emprestimo.getDevolucao() == null || emprestimo.getDevolucao() == ""){
            return null;
        }
        return emprestimoRepository.save(emprestimo).getIdEmprestimo();      
    }
    
    public boolean excluirEmprestimo(Long IdEmprestimo){
        if(emprestimoRepository.findById(IdEmprestimo).isPresent()){
            emprestimoRepository.deleteById(IdEmprestimo);
            return true;
        }
        return false;
    }
    
    public Emprestimo consultaEmprestimoPorId(Long IdEmprestimo){
        return emprestimoRepository.findById(IdEmprestimo).get();
    }
    
    public Emprestimo consultaEmprestimoPorEstudante(Estudante estudante){
        return emprestimoRepository.findByEstudante(estudante);
    }
    public Emprestimo consultaEmprestimoPorLivro(Livro livro){
        return emprestimoRepository.findByLivro(livro);
    }
    
    public List<Emprestimo> listarEmprestimos(){
        
        return emprestimoRepository.findAll();
    }
    
    public boolean alterarEmprestimo(Emprestimo emprestimo){

        if(emprestimo.getLivro() == null ){
            return false;
        }
     
        if(emprestimo.getIdEmprestimo() == null ){
            return false;
        }
        if(emprestimo.getEstudante() == null ){
            return false;
        }
        if(emprestimo.getDevolucao() == null || emprestimo.getDevolucao() == ""){
            return false;
        }
        
        Emprestimo empBD = emprestimoRepository.getReferenceById(emprestimo.getIdEmprestimo());
        if( empBD != null){
            if(empBD.getIdEmprestimo() != emprestimo.getIdEmprestimo() &&
                emprestimoRepository.findById(emprestimo.getIdEmprestimo()) != null){
                return false;
            }
            empBD.setLivro(emprestimo.getLivro());
            empBD.setIdEmprestimo(emprestimo.getIdEmprestimo());
            empBD.setEstudante(emprestimo.getEstudante());
            empBD.setDevolucao(emprestimo.getDevolucao());
            emprestimoRepository.save(empBD);
            return true;           
            }
            return false;
        }
       
}