package dom.proviniciasCiudades;

public enum SantiagoDelEsteroEnum {

	SantiagoDelEstero("Santiago del Estero");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private SantiagoDelEsteroEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}