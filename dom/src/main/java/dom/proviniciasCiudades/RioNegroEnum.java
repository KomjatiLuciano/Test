package dom.proviniciasCiudades;

public enum RioNegroEnum {

	Cipolletti("Cipolletti"), Allen("Allen"), FernandezOro("Fernandez Oro");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private RioNegroEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}