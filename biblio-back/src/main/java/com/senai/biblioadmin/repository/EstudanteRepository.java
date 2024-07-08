
package com.senai.biblioadmin.repository;
import com.senai.biblioadmin.entity.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante,Long> {
    
    Estudante findByEmail(String email);
    Estudante findByMatricula(Long matricula);
    
}

