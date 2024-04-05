package hn.unah.lenguajes1900.datos.demo.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.datos.demo.entities.Usuarios;

public interface UsuarioService {
    public Usuarios crearUsuario(Usuarios usuarios);
    
    public List<Usuarios> obtenerUsuarios();

    /*el tipo de dato es minuscula "Long=long" */
    public Optional<Usuarios> buscarPorId(long id);

    public Usuarios actualizarUsuarios(long id, Usuarios usuarios);

    public String eliminarPorId(long id);
}
