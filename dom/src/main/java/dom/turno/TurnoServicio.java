package dom.turno;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.annotation.Where;
import org.apache.isis.applib.services.i18n.TranslatableString;

import dom.doctor.Doctor;

@DomainService(repositoryFor = Turno.class)
@DomainServiceLayout(named = "Doctor", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "2")
public class TurnoServicio extends AbstractFactoryAndRepository {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre", "Turno: ");
	}

	public String iconName() {
		return "turnos";
	}

	@MemberOrder(name = "Doctor", sequence = "5.6")
	public String crearTurno(
			@ParameterLayout(named = "Doctor") final Doctor doctor) {

		Date fecha = new Date();
		fecha.setHours(07);
		fecha.setMinutes(00);
		fecha.setSeconds(00);

		for (int i = 0; i < 27; i++) {
			final Turno turno = newTransientInstance(Turno.class);
			Calendar c1 = GregorianCalendar.getInstance();
			// SimpleDateFormat fechaformato = new SimpleDateFormat(
			// "dd/MMMMM/yyyy HH:mm:ss");

			turno.setDia(fecha);
			turno.setDoctor(doctor);
			c1 = agregarMinutos(fecha, 30);
			fecha = c1.getTime();
			persistIfNotAlready(turno);
			container.flush();
		}
		return "Turnos agregados correctamente";

		// return "Turnos generados correctamente";
	}

	// public Date generarTurnos(Doctor doctor, Date fecha) {
	// Calendar c1 = GregorianCalendar.getInstance();
	//
	// for (int i = 0; i < 27; i++) {
	// c1 = agregarMinutos(fecha, 30);
	// fecha = c1.getTime();
	//
	// return fecha;
	// }
	//
	// }

	@ActionLayout(hidden = Where.EVERYWHERE)
	public Calendar agregarMinutos(Date date, int minutes) {
		Calendar calendarDate = Calendar.getInstance();
		calendarDate.setTime(date);
		calendarDate.add(Calendar.MINUTE, minutes);
		return calendarDate;
	}

	@javax.inject.Inject
	DomainObjectContainer container;
}