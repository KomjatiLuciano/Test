package dom.proviniciasCiudades;

public enum MendozaEnum {

	CiudadDeMendoza("Ciudad de Mendoza");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private MendozaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}