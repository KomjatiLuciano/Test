package dom.proviniciasCiudades;

public enum BuenosAiresEnum {

	CapitalFederal("Capital Federal"), VeinticincoDeMayo("25 de Mayo");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private BuenosAiresEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}
