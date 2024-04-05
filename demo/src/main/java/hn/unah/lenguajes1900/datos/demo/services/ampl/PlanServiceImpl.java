package hn.unah.lenguajes1900.datos.demo.services.ampl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.datos.demo.entities.Planes;
import hn.unah.lenguajes1900.datos.demo.repositories.PlanRepository;
import hn.unah.lenguajes1900.datos.demo.services.PlanService;

@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Planes crearPlan(Planes plan) {
        return this.planRepository.save(plan);
    }
    
}
