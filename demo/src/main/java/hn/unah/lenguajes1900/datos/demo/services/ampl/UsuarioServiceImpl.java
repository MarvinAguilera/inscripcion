package hn.unah.lenguajes1900.datos.demo.services.ampl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.datos.demo.entities.Usuarios;
import hn.unah.lenguajes1900.datos.demo.repositories.UsuarioRepository;
import hn.unah.lenguajes1900.datos.demo.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    /*en la implementacion crear un objeto del repository porque se usan los metodos que nos da */

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuarios crearUsuario(Usuarios usuarios) {
    return this.usuarioRepository.save(usuarios);
    }

    @Override
    public List<Usuarios> obtenerUsuarios() {
      return (List<Usuarios>) this.usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuarios> buscarPorId(long id) {
        return this.usuarioRepository.findById(id);/*se le pone .get, con opcianal se quita */
    }

     /* si solo se quiere actualizar un campo se pone el campo
     * si no se pone el objeto y actualiza todo
     */
    @Override
    public Usuarios actualizarUsuarios(long id, Usuarios usuarios) {
        Usuarios usuarioActualizar = this.usuarioRepository.findById(id).get();

        if (null != usuarioActualizar){
            usuarioActualizar.setNombre(usuarios.getNombre());
            usuarioActualizar.setApellido(usuarios.getApellido());
            usuarioActualizar.setCorreo(usuarios.getCorreo());
            usuarioActualizar.setTelefono(usuarios.getTelefono());
            usuarioActualizar.setDireccionFacturacion(usuarios.getDireccionFacturacion());
            this.usuarioRepository.save(usuarioActualizar);
        }
       return usuarioActualizar;
    }

    @Override
    public String eliminarPorId(long id) {
        //Optional<Usuarios> usuarioEliminar = this.usuarioRepository.findById(id);

        if(this.usuarioRepository.findById(id).isPresent()){
            this.usuarioRepository.deleteById(id);
            return "Usuario Eliminiado";
        }
        return "Usuario No Encontrado";
        
    }

    
    
}
