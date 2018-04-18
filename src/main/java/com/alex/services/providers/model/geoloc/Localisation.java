package com.alex.services.providers.model.geoloc;

import java.io.Serializable;

public class Localisation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Float value;

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("");
		buffer.append(" value : ").append(value).append("\n");
		return buffer.toString();

	}

}
