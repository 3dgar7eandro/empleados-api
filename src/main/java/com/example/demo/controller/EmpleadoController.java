package com.example.demo.controller;

import com.example.demo.model.Empleado;
import com.example.demo.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.crear(empleado);
    }

    @GetMapping("/departamento/{id}")
    public List<Empleado> listarPorDepartamento(@PathVariable Long id) {
        return empleadoService.listarPorDepartamento(id);
    }

    @GetMapping("/{id}")
    public Empleado obtenerUno(@PathVariable Long id) {
        return empleadoService.obtenerUno(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Empleado actualizar(@PathVariable Long id, @RequestBody Empleado empleado) {
        empleado.setId(id);
        return empleadoService.actualizar(empleado);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        empleadoService.borrar(id);
    }
}
