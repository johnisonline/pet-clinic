package com.john.petclinic.services.map;

import com.john.petclinic.model.Vet;
import com.john.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService{

    @Override
    public Vet save(Vet object) {
        return super.saveUsingId(object.getId(), object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
