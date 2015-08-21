package dom.proviniciasCiudades;

public enum NeuquenEnum {

	Neuquen("Neuquen");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private NeuquenEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}