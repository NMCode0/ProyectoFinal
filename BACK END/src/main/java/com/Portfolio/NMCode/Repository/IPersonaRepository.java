package com.Portfolio.NMCode.Repository;

import com.Portfolio.NMCode.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
    
}
