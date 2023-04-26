package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.Seccion;
import org.PwC_Desafio.repositories.SeccionRepository;
import org.PwC_Desafio.service.ISeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeccionService implements ISeccionService {

    @Autowired
    SeccionRepository seccionRepository;

    @Override
    public Seccion registrarSeccion(Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    @Override
    public Seccion buscarSeccionPorId(Long idSeccion) {
        return seccionRepository.findById(idSeccion).get();
    }

    @Override
    public Seccion modificarSeccion(Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    @Override
    public void eliminarSeccion(Long idSeccion) {
        seccionRepository.deleteById(idSeccion);
    }


}
