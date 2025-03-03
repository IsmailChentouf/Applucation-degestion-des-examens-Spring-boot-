package com.ensah.projectIT.repositories;

import com.ensah.projectIT.models.Departement;
import com.ensah.projectIT.models.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
	 List<Niveau> findByFiliereIdFiliere(Long filiereId);


}
