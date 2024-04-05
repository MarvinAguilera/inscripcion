package hn.unah.lenguajes1900.datos.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tipostreaming")
public class TipoStreaming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstreaming")
    private long idStreaming;

    private String descripcion;


    @JsonManagedReference/*la entidad debil lo lleva */
    @OneToMany(mappedBy = "tipoStreaming")
    private List<Planes> planes;

}
