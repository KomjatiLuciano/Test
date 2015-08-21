package dom.proviniciasCiudades;

public enum SaltaEnum {

	CiudadDeSalta("Ciudad de Salta");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private SaltaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}