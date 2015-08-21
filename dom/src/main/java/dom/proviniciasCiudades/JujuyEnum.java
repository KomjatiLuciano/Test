package dom.proviniciasCiudades;

public enum JujuyEnum {

	SanSalvadorDeJujuy("San Salvador de Jujuy");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private JujuyEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}