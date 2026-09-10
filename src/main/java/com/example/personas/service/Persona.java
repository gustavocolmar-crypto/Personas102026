package com.example.personas.service;

import com.example.personas.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Persona {

    @Autowired
    private PersonasRepository personasRepository;

    public void  save(Persona persona) {
        personasRepository.save(persona);
    }

}
