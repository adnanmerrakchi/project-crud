package com.senso.management.repository;

import com.senso.management.model.Individuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividuelRepository extends JpaRepository<Individuel, Long> {


}
