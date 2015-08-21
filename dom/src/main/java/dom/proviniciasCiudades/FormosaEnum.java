package dom.proviniciasCiudades;

public enum FormosaEnum {

	Formosa("Formosa");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private FormosaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}