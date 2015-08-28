package dom.proviniciasCiudades;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.services.i18n.TranslatableString;

import dom.doctor.DoctorServicio;

@javax.jdo.annotations.Queries({

		@javax.jdo.annotations.Query(name = "buscarNombre", language = "JDOQL", value = "SELECT "
				+ "FROM dom.provinciasCiudades.Ciudad "
				+ "WHERE nombre.indexOf(:parametro) == 0 "
				+ " && nombre.indexOf(:parametro) >= 0"),
		@javax.jdo.annotations.Query(name = "traerPorProvincia", language = "JDOQL", value = "SELECT "
				+ "FROM dom.provinciasCiudades.Ciudad where provincia == :provincia"), })
@DomainObject(autoCompleteRepository = CiudadServicio.class, autoCompleteAction = "buscarCiudad")
@PersistenceCapable
public class Ciudad {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre",
				"Ciudad: " + this.getNombre());
	}

	// {{ Nombre (property)
	private String nombre;

	@MemberOrder(sequence = "1")
	@Column(allowsNull = "false")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	// }}

	public String validateNombre(String nom) {

		if (nom.matches("[a-z,A-Z,0-9,ñ,Ñ, ]+") == false) {
			return "Datos erroneos, vuelva a intentarlo";
		} else {
			return null;
		}
	}

	// {{ Provincia (property)
	private ProvinciaEnum provincia;

	@MemberOrder(sequence = "2")
	@Column(allowsNull = "false")
	public ProvinciaEnum getProvincia() {
		return provincia;
	}

	public void setProvincia(final ProvinciaEnum provincia) {
		this.provincia = provincia;
	}
	// }}

}