package dom.proviniciasCiudades;

import java.util.Collections;
import java.util.List;

import com.google.common.base.Predicate;

public enum CiudadEnum {

	// RioNegro
	Cipolletti, Allen, FernandezOro,
	// Neuquen
	Neuquen, Plottier, Centenario;

	public static List<CiudadEnum> listFor(final ProvinciaEnum provincia) {
		return provincia != null ? provincia.listaCiudades() : Collections
				.<CiudadEnum> emptyList();
	}

	public static String validate(final ProvinciaEnum provincia,
			final CiudadEnum ciudad) {
		if (provincia == null) {
			return "Ingrese primero una provincia.";
		}
		return !provincia.listaCiudades().contains(ciudad) ? "Ciudad inválida para la provincia '"
				+ provincia + "'"
				: null;
	}

	public static Predicate<CiudadEnum> thoseFor(final ProvinciaEnum provincia) {
		return new Predicate<CiudadEnum>() {

			@Override
			public boolean apply(final CiudadEnum ciudad) {
				return provincia.listaCiudades().contains(ciudad);
			}
		};
	}

}