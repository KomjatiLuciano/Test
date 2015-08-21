package dom.proviniciasCiudades;

public enum SanJuanEnum {

	SanJuan("San Juan");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private SanJuanEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}