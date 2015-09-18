package dom.ciudadProvincia;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.services.i18n.TranslatableString;

@javax.jdo.annotations.Queries({

@javax.jdo.annotations.Query(name = "traerProvincia", language = "JDOQL", value = "SELECT "
		+ "FROM dom.ciudadProvincia.Provincia "
		+ "WHERE nombre.indexOf(:parametro) == 0 "
		+ " && nombre.indexOf(:parametro) >= 0 ") })
@DomainObject(autoCompleteRepository = ProvinciaServicio.class, autoCompleteAction = "buscarProvincia")
@PersistenceCapable
public class Provincia {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre",
				"Provincia: " + this.getNombre());
	}

	// {{ Nombre (property)
	private String nombre;

	@MemberOrder(sequence = "1")
	@Column(allowsNull = "false")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}