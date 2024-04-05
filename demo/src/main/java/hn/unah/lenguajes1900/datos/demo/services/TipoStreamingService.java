package hn.unah.lenguajes1900.datos.demo.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;

public interface TipoStreamingService {
    public TipoStreaming crearStreaming(TipoStreaming tipoStreaming);
    
    public List<TipoStreaming> obtenerStreaming();

    /*el tipo de dato es minuscula "Long=long" */
    public Optional<TipoStreaming>buscarPorId(long id);

    public TipoStreaming actualizarStreaming(long id, TipoStreaming tipoStreaming);

    public String eliminarPorId(long id);
}
