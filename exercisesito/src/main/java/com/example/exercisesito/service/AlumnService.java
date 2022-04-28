package com.example.exercisesito.service;


import com.example.exercisesito.entity.Alumn;
import com.example.exercisesito.repository.AlumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlumnService {

    @Autowired
    private AlumnRepository alumnRepository;

    @Transactional
    public void create(Alumn alumnDto){
        Alumn alumn = new Alumn();

        alumn.setNombre(alumnDto.getNombre());
        alumn.setApellido(alumnDto.getApellido());
        alumn.setNacimiento(alumnDto.getNacimiento());
        alumn.setKyu(alumnDto.getKyu());

        alumnRepository.save(alumn);
    }

    @Transactional
    public void update(Alumn alumnDto) {
        Alumn alumn = alumnRepository.findById(alumnDto.getId()).get();

        alumn.setNombre(alumnDto.getNombre());
        alumn.setApellido(alumnDto.getApellido());
        alumn.setNacimiento(alumnDto.getNacimiento());
        alumn.setKyu(alumnDto.getKyu());

        alumnRepository.save(alumn);
    }


    @Transactional
    public List<Alumn> getAll(){
        return alumnRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Alumn getById(Integer id) {
        return alumnRepository.findById(id).get();
    }

    @Transactional
    public void deleteById(Integer id) {
        alumnRepository.deleteById(id);
    }
}
