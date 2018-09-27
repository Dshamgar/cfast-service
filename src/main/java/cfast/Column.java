package cfast;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Column {
	private ArrayList<Hex> hexes;

	/*
	 * @JsonCreator public Column(@JsonProperty("hexes") ArrayList<Hex> hexes) {
	 * this.hexes = hexes;
	 * System.out.println("!!!!!!BOARD CONSTRUCTOR!!!!!! columns: " + hexes); }
	 */

	public ArrayList<Hex> getHexes() {
		return this.hexes;
	}

	@Override
	public String toString() {
		if (null != hexes) {
			return getClass().getSimpleName() + "[hexes=" + this.hexes.toString() + "]";
		} else {
			return "NULL";
		}
	}

}
