package hn.unah.lenguajes1900.datos.demo.services.ampl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.datos.demo.entities.Planes;
import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;
import hn.unah.lenguajes1900.datos.demo.repositories.PlanRepository;
import hn.unah.lenguajes1900.datos.demo.repositories.TipoStreamingRepository;
import hn.unah.lenguajes1900.datos.demo.services.TipoStreamingService;

@Service
public class TipoStreamingServiceImpl implements TipoStreamingService {

    @Autowired
    private TipoStreamingRepository tipoStreamingRepository;

    @Autowired
    private PlanRepository planRepository;
 
    @Override
    public TipoStreaming crearStreaming(TipoStreaming tipoStreaming) {
        TipoStreaming tipoStreaming2 = this.tipoStreamingRepository.save(tipoStreaming);
        if(null!= tipoStreaming.getPlanes()){
            for (Planes plan : tipoStreaming.getPlanes()) {
                plan.setTipoStreaming(tipoStreaming2);
                this.planRepository.save(plan);
            }
        }
        return tipoStreaming2;
    }

    @Override
    public List<TipoStreaming> obtenerStreaming() {
        return (List<TipoStreaming>) this.tipoStreamingRepository.findAll();
    }

    @Override
    public Optional<TipoStreaming> buscarPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public TipoStreaming actualizarStreaming(long id, TipoStreaming tipoStreaming) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarStreaming'");
    }

    @Override
    public String eliminarPorId(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPorId'");
    }
    
}
