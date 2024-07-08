
package com.senai.biblioadmin.controller;

import com.senai.biblioadmin.entity.Emprestimo;
import com.senai.biblioadmin.service.EmprestimoService;

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
public class EmprestimoController {
    
    @Autowired
    private EmprestimoService emprestimoService;
    
    
        @GetMapping("/emprestimo")
    public ResponseEntity<List<Emprestimo>> listarEmprestimos(){
        List<Emprestimo> listEmp = emprestimoService.listarEmprestimos();
        if(! listEmp.isEmpty()){
            return new ResponseEntity<>(listEmp ,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping("/emprestimo/id/{IdEmprestimo}")
    public ResponseEntity<Emprestimo> consultaEmprestimoPorId(@PathVariable("IdEmprestimo") Long IdEmprestimo){
        Emprestimo emprestimo = emprestimoService.consultaEmprestimoPorId(IdEmprestimo);
        if(emprestimo != null){
            return new ResponseEntity<>(emprestimo ,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    
    @PutMapping("/emprestimo")
    public ResponseEntity<Boolean> alterarEmprestimo(@RequestBody Emprestimo emprestimo){
       if(emprestimoService.alterarEmprestimo(emprestimo)){
           return new ResponseEntity<>(true, HttpStatus.OK);
       }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }
    
    
    @PostMapping("/emprestimo")
    public ResponseEntity<Long> incluirEmprestimo(@RequestBody Emprestimo emprestimo){
        Long idEmp = emprestimoService.incluirEmprestimo(emprestimo);
        if(idEmp != null){
            return new ResponseEntity<>(idEmp, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @DeleteMapping("/emprestimo/{IdEmprestimo}")
    public ResponseEntity<Long> exluirEmprestimo(@PathVariable ("IdEmprestimo")Long IdEmprestimo){
        if(emprestimoService.excluirEmprestimo(IdEmprestimo)){
            return new ResponseEntity<>(HttpStatus.OK);
        }       
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
}
