package com.ksush.petclinic.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
