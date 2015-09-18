package dom.ciudadProvincia;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.services.i18n.TranslatableString;

import dom.doctor.DoctorServicio;

@javax.jdo.annotations.Queries({ @javax.jdo.annotations.Query(name = "traerCiudad", language = "JDOQL", value = "SELECT "
		+ "FROM dom.ciudadProvincia.Ciudad "
		+ "WHERE nombre.indexOf(:parametro) == 0 "
		+ " && nombre.indexOf(:parametro) >= 0 ") })
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

	public void setNombre(final String ciudad) {
		this.nombre = ciudad;
	}

	// }}

	// {{ Provincia (property)
	private Provincia provincia;

	@MemberOrder(sequence = "2")
	@Column(allowsNull = "false")
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(final Provincia provincia) {
		this.provincia = provincia;
	}
	// }}

}