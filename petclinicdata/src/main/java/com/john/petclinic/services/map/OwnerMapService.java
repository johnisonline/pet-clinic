package com.john.petclinic.services.map;

import com.john.petclinic.model.Owner;
import com.john.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{

    @Override
    public Owner save(Owner object) {
        return super.saveUsingId(object.getId(), object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
