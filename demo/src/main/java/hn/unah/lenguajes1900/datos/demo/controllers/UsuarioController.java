package hn.unah.lenguajes1900.datos.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.datos.demo.entities.Usuarios;
import hn.unah.lenguajes1900.datos.demo.services.ampl.UsuarioServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/usuario/guardar")    
    public Usuarios crearUsuario(@RequestBody Usuarios usuarios){/*poner requestbody */
       return this.usuarioServiceImpl.crearUsuario(usuarios);
    }

    @GetMapping("/usuario/obtener")
    public List<Usuarios> obtenerUsuarios(){
        return this.usuarioServiceImpl.obtenerUsuarios();
    }

    @PutMapping("/usuario/actualizar/{id}")
    public Usuarios actualizarUsuarios(@PathVariable long id,
                                       @RequestBody Usuarios usuarios){
    return this.usuarioServiceImpl.actualizarUsuarios(id, usuarios);
}

    @GetMapping("/usuario/buscar")
    public Optional<Usuarios> getmethodName(@RequestParam long id){
        return this.usuarioServiceImpl.buscarPorId(id);
    }

    @DeleteMapping("/usuario/eliminar")
    public String eliminarUsuarios(@RequestParam long id){
        return this.usuarioServiceImpl.eliminarPorId(id);
    }
}
