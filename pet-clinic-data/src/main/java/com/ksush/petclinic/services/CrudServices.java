package com.ksush.petclinic.services;

import java.util.Set;

public interface CrudServices<T, ID> {
	Set<T> findAll();
	T findById(ID id);
	T save(T obejct);
	void delete(T object);
	void deleteById(ID id);
}
