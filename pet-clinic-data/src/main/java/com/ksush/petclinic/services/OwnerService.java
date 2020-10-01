package com.ksush.petclinic.services;

import com.ksush.petclinic.model.Owner;


public interface OwnerService extends CrudServices<Owner, Long>{
	Owner findByLastName(String lastName);

}
