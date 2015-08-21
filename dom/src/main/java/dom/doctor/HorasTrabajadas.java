package dom.doctor;

import java.util.Date;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.MemberOrder;
@PersistenceCapable
public class HorasTrabajadas 
{
	// {{ Ingreso (property)
	private String ingresoEgreso;

	@MemberOrder(sequence = "1")
	@Column(allowsNull = "false")
	public String getIngreso() {
		return ingresoEgreso;
	}

	public void setIngreso(final String ingresoEgreso) {
		this.ingresoEgreso = ingresoEgreso;
	}
	// }}
	

}
