package hn.unah.lenguajes1900.datos.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.datos.demo.entities.Planes;
import hn.unah.lenguajes1900.datos.demo.services.ampl.PlanServiceImpl;

@RestController
@RequestMapping("/api")
public class PlanController {

    @Autowired
    private PlanServiceImpl planServiceImpl;
    
    @PostMapping("/plan/crear")
    public Planes crearPlan(@RequestBody Planes plan) {
        return this.planServiceImpl.crearPlan(plan);
    }
    
}
