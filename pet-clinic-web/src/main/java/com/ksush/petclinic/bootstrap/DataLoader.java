package com.ksush.petclinic.bootstrap;

import com.ksush.petclinic.model.Owner;
import com.ksush.petclinic.model.Vet;
import com.ksush.petclinic.services.OwnerService;
import com.ksush.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setFirstName("Sushil");
		owner1.setLastName("Kainth");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Aman");
		owner2.setLastName("Kainth");

		ownerService.save(owner2);
		System.out.println("Owners Loaded....");

		Vet vet1 = new Vet();
		vet1.setFirstName("Avtar");
		vet1.setLastName("Chand");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Kulwinder");
		vet2.setLastName("Kaur");

		vetService.save(vet2);
		System.out.println("Vets Loaded....");

	}
}
