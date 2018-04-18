package com.alex.services.providers.model.geoloc;

import java.io.Serializable;

public class Position implements Serializable {
	private static final long serialVersionUID = 1L;

	private Localisation positionX;
	private Localisation positionY;

	public Localisation getPositionX() {
		return positionX;
	}

	public void setPositionX(Localisation positionX) {
		this.positionX = positionX;
	}

	public Localisation getPositionY() {
		return positionY;
	}

	public void setPositionY(Localisation positionY) {
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" Localisation X: ").append(positionX.toString()).append("\n");
		buffer.append(" Localisation Y: ").append(positionY.toString()).append("\n");
		return buffer.toString();
	}

}
