package hn.unah.lenguajes1900.datos.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;

public interface TipoStreamingRepository extends CrudRepository<TipoStreaming, Long>  {
    
}
