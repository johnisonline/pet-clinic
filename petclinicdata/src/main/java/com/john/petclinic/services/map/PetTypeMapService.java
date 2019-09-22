package com.john.petclinic.services.map;

import com.john.petclinic.model.PetType;
import com.john.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jmarias on 9/22/19.
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
