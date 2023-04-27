package org.pwc_desafio.service;

import org.pwc_desafio.model.PersonalDeServicio;
import org.pwc_desafio.model.Seccion;
import org.pwc_desafio.repositories.PersonalDeServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDeServicioService {

    private final PersonalDeServicioRepository personalDeServicioRepository;

    @Autowired
    PersonalDeServicioService(PersonalDeServicioRepository personalDeServicioRepository) {
        this.personalDeServicioRepository = personalDeServicioRepository;
    }

    // --------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío
    /* Cambiamos la sección de uno de los miembros del personal de servicio */
    public PersonalDeServicio cambiarSeccion(Long id, Long idSeccion) {
        PersonalDeServicio personalDeServicio = personalDeServicioRepository.findById(id).orElse(null);
        Seccion seccion = new Seccion();
        seccion.setId(idSeccion);
        assert personalDeServicio != null;
        personalDeServicio.setSeccionAsignada(seccion);
        personalDeServicioRepository.save(personalDeServicio);
        return personalDeServicio;
    }
    // --------------------------------------------------------------------------------------------------
    //Adicional
    public PersonalDeServicio crearPersonalDeServicio(PersonalDeServicio personalDeServicio) {
        personalDeServicioRepository.save(personalDeServicio);
        return personalDeServicio;
    }

    public PersonalDeServicio buscarPersonalDeServicioPorId(Long id) {
        return personalDeServicioRepository.findById(id).orElse(null);
    }

    public void eliminarPersonalDeServicio(Long id) { personalDeServicioRepository.deleteById(id); }

    public PersonalDeServicio asignarSeccion(Long id, Long idSeccion) {
        PersonalDeServicio personalDeServicio = personalDeServicioRepository.findById(id).orElse(null);
        Seccion seccion = new Seccion();
        seccion.setId(idSeccion);
        assert personalDeServicio != null;
        personalDeServicio.setSeccionAsignada(seccion);
        personalDeServicioRepository.save(personalDeServicio);
        return personalDeServicio;
    }
}