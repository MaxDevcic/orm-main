package com.seccion7.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion7.orm.model.Paciente;
import com.seccion7.orm.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Paciente findByid(int id){
        return pacienteRepository.findById(id);
    }
}
