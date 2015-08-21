package dom.proviniciasCiudades;

public enum SanLuisEnum {

	SanLuis("San Luis");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private SanLuisEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}