package org.desafio_pwc.service;

import org.desafio_pwc.model.Seccion;
import org.desafio_pwc.repositories.SeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeccionService {

    private final SeccionRepository seccionRepository;

    @Autowired
    SeccionService(SeccionRepository seccionRepository) {
        this.seccionRepository = seccionRepository;
    }

    public Seccion registrarSeccion(Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    public Seccion buscarSeccionPorId(Long idSeccion) {
        return seccionRepository.findById(idSeccion).orElse(null);
    }

    public Seccion modificarSeccion(Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    public void eliminarSeccion(Long idSeccion) {
        seccionRepository.deleteById(idSeccion);
    }
}