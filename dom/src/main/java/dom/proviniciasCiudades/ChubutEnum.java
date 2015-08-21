package dom.proviniciasCiudades;

public enum ChubutEnum {

	Rawson("Rawson"), Esquel("Esquel");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private ChubutEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}