package dom.proviniciasCiudades;

public enum MisionesEnum {

	Posada("Posadas");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private MisionesEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}