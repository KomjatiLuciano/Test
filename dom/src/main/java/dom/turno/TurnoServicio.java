package dom.turno;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.joda.time.DateTime;

import dom.doctor.Doctor;

@DomainService(repositoryFor = Turno.class)
@DomainServiceLayout(named = "Turno", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "9")
public class TurnoServicio extends AbstractFactoryAndRepository {

	@MemberOrder(name = "Turno", sequence = "9.1")
	public Turno crearTurno(@ParameterLayout(named = "Dia") final DateTime dia,
			@ParameterLayout(named = "Doctor") final Doctor doctor) {

		final Turno turno = newTransientInstance(Turno.class);

		turno.setDia(dia);
		turno.setDoctor(doctor);
		persist(turno);
		container.flush();
		return (turno);
	}

	// public void generarTurnos(Doctor doctor) {
	//
	// }

	@javax.inject.Inject
	DomainObjectContainer container;
}