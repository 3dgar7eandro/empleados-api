package com.example.demo.specification;

import com.example.demo.model.Empleado;
import org.springframework.data.jpa.domain.Specification;

public class EmpleadoSpecifications {

    public static Specification<Empleado> perteneceADepartamento(Long departamentoId) {
        return (root, query, cb) -> cb.equal(root.get("departamento").get("id"), departamentoId);
    }
}
