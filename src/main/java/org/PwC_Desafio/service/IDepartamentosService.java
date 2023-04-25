package org.PwC_Desafio.service;

import org.PwC_Desafio.model.Departamentos;

public interface IDepartamentosService {

    /* Registramos, modificamos y eliminamos un departamento de la facultad */
    Departamentos registrarDepartamento(Departamentos departamento);
    Departamentos modificarDepartamento(Departamentos departamento);
    void eliminarDepartamento(Long idDepartamento);
}
