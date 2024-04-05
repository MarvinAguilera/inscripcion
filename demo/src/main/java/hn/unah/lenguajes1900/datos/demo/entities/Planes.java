package hn.unah.lenguajes1900.datos.demo.entities;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="planes")
public class Planes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplan")
    private long idPlan;

    private String descripcion;
    private double precio;

    @JsonBackReference/*entidad fuerte "JsonManageReference" */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idstreaming", referencedColumnName = "idstreaming" )
    private TipoStreaming tipoStreaming;
    
}
