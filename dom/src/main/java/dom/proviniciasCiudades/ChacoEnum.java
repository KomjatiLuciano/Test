package dom.proviniciasCiudades;

public enum ChacoEnum {
	AguaBuena("Agua Buena"), Alelov("Alelov");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private ChacoEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}