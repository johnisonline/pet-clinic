package com.john.petclinic.services;

import com.john.petclinic.model.Vet;


public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
