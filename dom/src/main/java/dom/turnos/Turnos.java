package dom.turnos;

import java.sql.Time;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.services.i18n.TranslatableString;
import org.isisaddons.wicket.fullcalendar2.cpt.applib.CalendarEvent;
import org.isisaddons.wicket.fullcalendar2.cpt.applib.CalendarEventable;
import org.joda.time.DateTime;

import dom.doctor.Doctor;
import dom.paciente.Paciente;

@PersistenceCapable
public class Turnos implements CalendarEventable {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre", "Turnos");
	}

	public String iconName() {
		return "turnos";
	}

	// {{ Doctores (property)
	private Doctor doctores;

	@MemberOrder(sequence = "1")
	@Column(allowsNull = "false")
	public Doctor getDoctores() {
		return doctores;
	}

	public void setDoctores(final Doctor doctores) {
		this.doctores = doctores;
	}

	// }}

	// {{ DescripcionTurno (property)
	private String descripcionTurno;

	@MemberOrder(sequence = "2")
	@Column(allowsNull = "false")
	public String getDescripcionTurno() {
		return descripcionTurno;
	}

	public void setDescripcionTurno(final String descripcionTurno) {
		this.descripcionTurno = descripcionTurno;
	}

	// }}

	// // {{ CantidadDeTurnosSemanales (property)
	// private int cantidadDeTurnosSemanales;
	//
	// @MemberOrder(sequence = "2")
	// @Column(allowsNull = "false")
	// public int getCantidadDeTurnosSemanales() {
	// return cantidadDeTurnosSemanales;
	// }
	//
	// public void setCantidadDeTurnosSemanales(final int cantidad) {
	// this.cantidadDeTurnosSemanales = cantidad;
	// }
	//
	// // }}
	//
	// // {{ DiasDeTurno (property)
	// private DayOfWeek diasDeTurno;
	//
	// @MemberOrder(sequence = "2")
	// @Column(allowsNull = "false")
	// public DayOfWeek getDiasDeTurno() {
	// return diasDeTurno;
	// }
	//
	// public void setDiasDeTurno(final DayOfWeek dias) {
	// this.diasDeTurno = dias;
	// }
	//
	// // }}

	// {{ FechaTurno (property)
	private DateTime fechaTurno;

	@MemberOrder(sequence = "3")
	@Column(allowsNull = "false")
	public DateTime getFechaTurno() {
		return fechaTurno;
	}

	public void setFechaTurno(final DateTime fechaTurno) {
		this.fechaTurno = fechaTurno;
	}

	// }}

	// {{ HoraTurno (property)
	private Time horaTurno;

	@MemberOrder(sequence = "4")
	@Column(allowsNull = "false")
	public Time getHoraTurno() {
		return horaTurno;
	}

	public void setHoraTurno(final Time horaTurno) {
		this.horaTurno = horaTurno;
	}

	// }}

	// {{ Pacientes (property)
	private Paciente pacientes;

	@MemberOrder(sequence = "4")
	@Column(allowsNull = "false")
	public Paciente getPacientes() {
		return pacientes;
	}

	public void setPacientes(final Paciente pacientes) {
		this.pacientes = pacientes;
	}

	// }}

	@Override
	public String getCalendarName() {
		return descripcionTurno;
	}

	@Override
	public CalendarEvent toCalendarEvent() {
		return new CalendarEvent(fechaTurno, descripcionTurno, "Turnos",
				"nombre");
	}
}