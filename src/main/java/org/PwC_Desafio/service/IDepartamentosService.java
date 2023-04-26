package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Departamentos;

public interface IDepartamentosService {

    /* Registramos un Departamento */
    Departamentos registrarDepartamento(Departamentos departamento);

    /* Buscamos un Departamento por su id */
    Departamentos buscarDepartamentoPorId(Long idDepartamento);

    /*Modificamos un Departamento */
    Departamentos modificarDepartamento(Departamentos departamento);

    /* Eliminamos un Departamento por su id */
    void eliminarDepartamento(Long idDepartamento);
}
