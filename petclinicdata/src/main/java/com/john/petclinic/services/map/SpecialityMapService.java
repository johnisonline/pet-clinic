package com.john.petclinic.services.map;


import com.john.petclinic.model.Speciality;
import com.john.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;


@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

}
