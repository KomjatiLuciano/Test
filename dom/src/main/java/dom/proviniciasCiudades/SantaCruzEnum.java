package dom.proviniciasCiudades;

public enum SantaCruzEnum {

	RioGallegos("Rio Gallegos");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private SantaCruzEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}