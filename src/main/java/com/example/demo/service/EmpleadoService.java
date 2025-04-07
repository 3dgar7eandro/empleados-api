package com.example.demo.service;

import com.example.demo.model.Empleado;
import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.specification.EmpleadoSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleado crear(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public List<Empleado> listarPorDepartamento(Long departamentoId) {
        Specification<Empleado> spec = EmpleadoSpecifications.perteneceADepartamento(departamentoId);
        return empleadoRepository.findAll(spec);
    }

    public Optional<Empleado> obtenerUno(Long id) {
        return empleadoRepository.findById(id);
    }

    public void borrar(Long id) {
        empleadoRepository.deleteById(id);
    }

    public Empleado actualizar(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
