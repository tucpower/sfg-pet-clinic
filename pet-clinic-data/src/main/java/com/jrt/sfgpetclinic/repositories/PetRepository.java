package com.jrt.sfgpetclinic.repositories;

import com.jrt.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
