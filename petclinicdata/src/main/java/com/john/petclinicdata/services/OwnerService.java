package com.john.petclinicdata.services;


import com.john.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findbyId(Long Id);
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
