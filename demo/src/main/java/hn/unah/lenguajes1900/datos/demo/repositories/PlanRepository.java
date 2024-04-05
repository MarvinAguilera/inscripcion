package hn.unah.lenguajes1900.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.datos.demo.entities.Planes;

public interface PlanRepository extends CrudRepository<Planes, Long> {
    
}
