package dom.proviniciasCiudades;

public enum LaRiojaEnum {

	CiudadDeLaRioja("Ciudad de la Rioja");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private LaRiojaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}