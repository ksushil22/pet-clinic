package com.ksush.petclinic.services.map;

import com.ksush.petclinic.model.Pet;
import com.ksush.petclinic.model.Vet;
import com.ksush.petclinic.services.CrudServices;
import com.ksush.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public Vet save(Vet obejct) {
		return super.save(obejct);
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
}
