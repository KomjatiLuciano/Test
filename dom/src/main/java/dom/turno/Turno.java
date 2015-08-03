package dom.turno;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.CheckReturnValue;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.Extension;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.CollectionLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.PropertyLayout;
import org.apache.isis.applib.annotation.Where;
import org.apache.isis.applib.services.i18n.TranslatableString;

import dom.doctor.Doctor;
import dom.paciente.Paciente;

@javax.jdo.annotations.Queries({
		@javax.jdo.annotations.Query(name = "traerTodos", language = "JDOQL", value = "SELECT "
				+ "FROM dom.turno.Turno"),
		@javax.jdo.annotations.Query(name = "buscarNombre,Nombre", language = "JDOQL", value = "SELECT "
				+ "FROM dom.turno.Turno"
				+ "nombre.indexOf(:parametro) == 0"
				+ " && nombre.indexOf(:parametro) >= 0") })
@PersistenceCapable
public class Turno {

	public TranslatableString title() {
		final SimpleDateFormat formatoFecha = new SimpleDateFormat(
				"dd MMMM YYYY");
		return TranslatableString.tr("{nombre}", "nombre", "Turno.",
				formatoFecha.format(this.dia));
	}

	public String iconName() {
		return "turnos";
	}

	public Turno() {
		this.turnoDisponible = new TurnoDisponible(this);
		this.turnoSolicitado = new TurnoSolicitado(this);
		this.turnoAceptado = new TurnoAceptado(this);
		this.turnoAtendido = new TurnoAtendido(this);
		this.turnoCancelado = new TurnoCancelado(this);

		this.setIEstadoTurno(this.getTurnoDisponible());
	}

	public String getSituacionDeTurno() {
		return this.iEstadoTurno.nombreEstado();
	}

	// {{ Dia (property)
	private Date dia;

	@MemberOrder(sequence = "1")
	@Column(allowsNull = "false")
	public Date getDia() {
		return dia;
	}

	public void setDia(final Date dia) {
		this.dia = dia;
	}

	// }}

	// {{ Doctor (property)
	private Doctor doctor;

	@MemberOrder(sequence = "2")
	@Persistent(mappedBy = "listaTurnos")
	@Column(allowsNull = "false")
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(final Doctor doctor) {
		this.doctor = doctor;
	}

	// }}

	public Turno solicitarTurno() {
		this.iEstadoTurno.solicitarTurno();
		return this;
	}

	public boolean hideSolicitarTurno() {
		return true;
		// return this.getIEstadoTurno().ocultarSolicitarTurno();
	}

	// {{ Paciente (property)
	// private Paciente paciente;
	//
	// @MemberOrder(sequence = "3")
	// @Column(allowsNull = "true")
	// public Paciente getPaciente() {
	// return paciente;
	// }
	//
	// public void setPaciente(final Paciente paciente) {
	// this.paciente = paciente;
	// }

	// }}

	// {{ Disponible (property)
	private Boolean disponible;

	@MemberOrder(sequence = "4")
	@Column(allowsNull = "false")
	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(final Boolean disponible) {
		this.disponible = disponible;
	}

	// }}

	// {{ IEstadoTurno (property)
	private IEstadoTurno iEstadoTurno;

	// @ActionLayout(hidden=Where.EVERYWHERE)
	@PropertyLayout(hidden = Where.EVERYWHERE)
	@MemberOrder(sequence = "5")
	@Column(allowsNull = "false")
	@Persistent(extensions = {
			@Extension(vendorName = "datanucleous", key = "mapping-strategy", value = "per-implementation"),
			@Extension(vendorName = "datanucleus", key = "implementation-clases", value = "dom.turno.TurnoDisponible"
					+ ",dom.turno.TurnoSolicitado"
					+ ",dom.turno.TurnoAceptado"
					+ ",dom.turno.TurnoAtendido" + ",dom.turno.TurnoCancelado") }, columns = {
			@Column(name = "idTurnoDisponible"),
			@Column(name = "idTurnoSolicitado"),
			@Column(name = "idTurnoAceptado"),
			@Column(name = "idTurnoAtendido"),
			@Column(name = "idTurnoCancelado") })
	public IEstadoTurno getIEstadoTurno() {
		return iEstadoTurno;
	}

	public void setIEstadoTurno(final IEstadoTurno iEstadoTurno) {
		this.iEstadoTurno = iEstadoTurno;
	}

	// }}

	// {{ TurnoDisponible (property)
	private TurnoDisponible turnoDisponible;

	@PropertyLayout(hidden = Where.EVERYWHERE)
	@MemberOrder(sequence = "6")
	@Column(allowsNull = "false")
	public TurnoDisponible getTurnoDisponible() {
		return turnoDisponible;
	}

	public void setTurnoDisponible(final TurnoDisponible turnoDisponible) {
		this.turnoDisponible = turnoDisponible;
	}

	// }}

	// {{ TurnoSolicitado (property)
	private TurnoSolicitado turnoSolicitado;

	@PropertyLayout(hidden = Where.EVERYWHERE)
	@MemberOrder(sequence = "7")
	@Column(allowsNull = "false")
	public TurnoSolicitado getTurnoSolicitado() {
		return turnoSolicitado;
	}

	public void setTurnoSolicitado(final TurnoSolicitado turnoSolicitado) {
		this.turnoSolicitado = turnoSolicitado;
	}

	// }}

	// {{ TurnoAceptado (property)
	private TurnoAceptado turnoAceptado;

	@PropertyLayout(hidden = Where.EVERYWHERE)
	@MemberOrder(sequence = "8")
	@Column(allowsNull = "false")
	public TurnoAceptado getTurnoAceptado() {
		return turnoAceptado;
	}

	public void setTurnoAceptado(final TurnoAceptado turnoAceptado) {
		this.turnoAceptado = turnoAceptado;
	}

	// }}

	// {{ TurnoAtendido (property)
	private TurnoAtendido turnoAtendido;

	@PropertyLayout(hidden = Where.EVERYWHERE)
	@MemberOrder(sequence = "9")
	@Column(allowsNull = "false")
	public TurnoAtendido getTurnoAtendido() {
		return turnoAtendido;
	}

	public void setTurnoAtendido(final TurnoAtendido turnoAtendido) {
		this.turnoAtendido = turnoAtendido;
	}

	// }}

	// {{ TurnoCancelado (property)
	private TurnoCancelado turnoCancelado;

	@PropertyLayout(hidden = Where.EVERYWHERE)
	@MemberOrder(sequence = "10")
	@Column(allowsNull = "false")
	public TurnoCancelado getTurnoCancelado() {
		return turnoCancelado;
	}

	public void setTurnoCancelado(final TurnoCancelado turnoCancelado) {
		this.turnoCancelado = turnoCancelado;
	}

	// }}

}