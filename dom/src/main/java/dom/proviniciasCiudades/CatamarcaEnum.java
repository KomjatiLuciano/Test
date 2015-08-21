package dom.proviniciasCiudades;

public enum CatamarcaEnum {
	Achalco("Achalco"), Aconquija("Aconquija");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private CatamarcaEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}