package com.john.petclinic.services.map;

import com.john.petclinic.model.Speciality;
import com.john.petclinic.model.Vet;
import com.john.petclinic.services.SpecialityService;
import com.john.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality saveSpeciality = specialityService.save(speciality);
                    speciality.setId(saveSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
