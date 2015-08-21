package dom.proviniciasCiudades;

public enum CorrientesEnum {

	Corrientes("Corrientes");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private CorrientesEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}