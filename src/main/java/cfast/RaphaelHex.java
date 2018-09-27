package cfast;

import lombok.Data;

@Data
public class RaphaelHex {
	private Attrs attrs;

	/*
	 * public RaphaelHex(Attrs attrs) { this.attrs = attrs; }
	 */

	public Attrs getAttrs() {
		return this.attrs;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[attrs=" + attrs.toString() + "]";
	}
}
