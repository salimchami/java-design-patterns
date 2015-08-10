package com.iluwatar.layers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cake {

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne
	private CakeTopping topping;
	
	@OneToMany
	private List<CakeLayer> layers;
	
	public Cake() {		
		setLayers(new ArrayList<>());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CakeTopping getTopping() {
		return topping;
	}

	public void setTopping(CakeTopping topping) {
		this.topping = topping;
	}

	public List<CakeLayer> getLayers() {
		return layers;
	}

	public void setLayers(List<CakeLayer> layers) {
		this.layers = layers;
	}
}