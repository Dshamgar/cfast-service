package cfast;

import lombok.Data;

@Data
public class Hex {
	private RaphaelHex raphaelHex;
	private String color;

	/*
	 * public Hex(RaphaelHex raphaelHex, String color) { this.raphaelHex =
	 * raphaelHex; this.color = color; }
	 */

	public RaphaelHex getRaphaelHex() {
		return this.raphaelHex;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		if (null != raphaelHex) {
			return getClass().getSimpleName() + "[color=" + this.color + "][raphaelHex = " + raphaelHex.toString()
					+ " ]";
		} else {
			return "NULL";
		}
	}
}
