package dom.turnos;

import java.sql.Time;
import java.util.List;

import javax.inject.Inject;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.joda.time.DateTime;

import dom.doctor.Doctor;
import dom.paciente.Paciente;

@DomainService(repositoryFor = Turnos.class)
@DomainServiceLayout(named = "Turnos", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "5")
public class TurnosServicio extends AbstractFactoryAndRepository {

	public String iconName() {
		return "turnos";
	}

	@MemberOrder(name = "Turnos", sequence = "5.1")
	public Turnos crearTurnos(
			@ParameterLayout(named = "Doctores") final Doctor doctores,
			@ParameterLayout(named = "Descripcion de turno") final String descripcionDeTurno,
			@ParameterLayout(named = "Fecha Turno") final DateTime fechaTurno,
			@ParameterLayout(named = "Hora Turno") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaHora.HORA) final Time hora,
			@ParameterLayout(named = "Pacientes") final Paciente pacientes) {

		final Turnos turnos = newTransientInstance(Turnos.class);
		turnos.setDoctores(doctores);
		turnos.setDescripcionTurno(descripcionDeTurno);
		turnos.setFechaTurno(fechaTurno);
		turnos.setHoraTurno(hora);
		turnos.setPacientes(pacientes);
		persist(turnos);
		return turnos;
	}

	@MemberOrder(name = "Turnos", sequence = "5.2")
	public List<Turnos> listarTurnos() {
		return container.allInstances(Turnos.class);
	}

	@Inject
	DomainObjectContainer container;
}