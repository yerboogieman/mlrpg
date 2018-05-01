package com.dollarquest.model;

import com.custsoft.model.JpaModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by eric on 11/7/16.
 */
@Entity
@Table(name = "mlrpg")
public class Friend extends JpaModel<Long> {

	@Column
	private String name;

	@Column
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String description) {
		this.city = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
