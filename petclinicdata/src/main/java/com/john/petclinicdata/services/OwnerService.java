package com.john.petclinicdata.services;


import com.john.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
