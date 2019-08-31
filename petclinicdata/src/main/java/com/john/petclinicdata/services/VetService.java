package com.john.petclinicdata.services;

import com.john.petclinicdata.model.Vet;

import java.util.Set;

/**
 * Created by jmarias on 8/31/19.
 */
public interface VetService {
    Vet findbyId(Long Id);
    Vet findByLastName(String lastName);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
