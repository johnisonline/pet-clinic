package com.john.petclinicdata.services;

import com.john.petclinicdata.model.Pet;

import java.util.Set;

/**
 * Created by jmarias on 8/31/19.
 */
public interface PetService {

    Pet findbyId(Long Id);
    Pet save(Pet owner);
    Set<Pet> findAll();

}