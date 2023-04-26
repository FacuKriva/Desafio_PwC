package org.PwC_Desafio.service.impl;

import org.PwC_Desafio.model.PersonalDeServicio;
import org.PwC_Desafio.model.Seccion;
import org.PwC_Desafio.repositories.PersonalDeServicioRepository;
import org.PwC_Desafio.service.IPersonalDeServicioService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonalDeServicioService implements IPersonalDeServicioService {

    @Autowired
    PersonalDeServicioRepository personalDeServicioRepository;

    // --------------------------------------------------------------------------------------------------
    // TODO: Parte del requerimiento del desafío
    @Override
    public PersonalDeServicio cambiarSeccion(Long id, Seccion seccionAsignada) {
        PersonalDeServicio personalDeServicio = personalDeServicioRepository.findById(id).get();
        personalDeServicio.setSeccionAsignada(seccionAsignada);
        personalDeServicioRepository.save(personalDeServicio);
        return personalDeServicio;
    }
    // --------------------------------------------------------------------------------------------------
    //Adicional

    @Override
    public PersonalDeServicio crearPersonalDeServicio(PersonalDeServicio personalDeServicio) {
        personalDeServicioRepository.save(personalDeServicio);
        return personalDeServicio;
    }

    @Override
    public PersonalDeServicio buscarPersonalDeServicioPorId(Long id) {
        return personalDeServicioRepository.findById(id).get();
    }

    @Override
    public void eliminarPersonalDeServicio(Long id) {
        personalDeServicioRepository.deleteById(id);
    }

}
