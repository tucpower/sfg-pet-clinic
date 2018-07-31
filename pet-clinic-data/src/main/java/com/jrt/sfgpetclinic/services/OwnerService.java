package com.jrt.sfgpetclinic.services;

import com.jrt.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
