/*
 Copyright 2015 Adamantium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package dom.turno;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.inject.Named;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.annotation.Where;
import org.apache.isis.applib.query.QueryDefault;
import org.apache.isis.applib.services.i18n.TranslatableString;

import dom.doctor.Doctor;
import dom.especialidad.EspecialidadEnum;
import dom.paciente.Paciente;

@DomainService(repositoryFor = Turno.class)
@DomainServiceLayout(named = "Doctor", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "50")
@Named("Turno")
public class TurnoServicio extends AbstractFactoryAndRepository {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre", "Turno: ");
	}

	public String iconName() {
		return "turnos";
	}

	@MemberOrder(name = "Doctor", sequence = "75")
	public String nuevoTurnoPaciente(final EspecialidadEnum especialidad,
			Doctor doctor, Date fecha1, Date fecha2, Turno turno) {

		return "ok";

	}

	public EspecialidadEnum default0NuevoTurnoPaciente() {

		return EspecialidadEnum.Clinica_General;

	}

	public List<Doctor> choices1NuevoTurnoPaciente(
			final EspecialidadEnum especialidad) {

		return container.allMatches(QueryDefault.create(Doctor.class,
				"traerPorEspecialidad", "especialidad", especialidad));

	}

	public List<Turno> choices2NuevoTurnoPaciente(
			final EspecialidadEnum especialidad, Doctor doctor) {
		return container.allMatches(QueryDefault.create(Turno.class,
				"traerTurnos"));
	}

	@SuppressWarnings("deprecation")
	@MemberOrder(name = "Doctor", sequence = "50")
	public String crearTurnos(
			@ParameterLayout(named = "Doctor") final Doctor doctor
	// ,@ParameterLayout(named = "Paciente") final Paciente paciente
	) {

		Date fecha = new Date();
		fecha.setHours(07);
		fecha.setMinutes(00);
		fecha.setSeconds(00);

		// Date fecha=new Date();
		// //System.out.println("Hoy es: "+fecha);
		//
		// SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
		// String date=format.format(SumarFecha(fecha, 7));

		for (int x = 0; x < 30; x++) {
			fecha = SumarFecha(fecha, 1);

			fecha.setHours(07);
			fecha.setMinutes(00);
			fecha.setSeconds(00);

			for (int i = 0; i < 27; i++) {

				final Turno turno = newTransientInstance(Turno.class);
				Calendar c1 = GregorianCalendar.getInstance();

				// SimpleDateFormat fechaformato = new SimpleDateFormat(
				// "dd/MMMMM/yyyy HH:mm:ss");

				// SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

				turno.setDia(fecha);
				turno.setDoctor(doctor);
				// turno.setPaciente(paciente);
				// paciente.getListaTurnos().add(turno);
				doctor.getListaTurnos().add(turno);
				c1 = agregarMinutos(fecha, 30);
				fecha = c1.getTime();
				persistIfNotAlready(turno);
				container.flush();
			}
			// return "Turnos agregados correctamente";
		}
		return "Turnos agregados correctamente";
	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public Calendar agregarMinutos(Date date, int minutes) {
		Calendar calendarDate = Calendar.getInstance();
		calendarDate.setTime(date);
		calendarDate.add(Calendar.MINUTE, minutes);
		return calendarDate;
	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public Date SumarFecha(Date fecha, int dias) {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fecha); // Configuramos la fecha que se recibe

		calendar.add(Calendar.DAY_OF_YEAR, dias); // numero de días a añadir, o
													// restar en caso de días<0

		return calendar.getTime();

	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public List<Turno> buscarTurno(String Turno) {
		return allMatches(QueryDefault.create(Turno.class, "traerTodos", Turno));
	}

	@MemberOrder(name = "Doctor", sequence = "50")
	public List<Turno> listarTurnos() {
		return container.allInstances(Turno.class);
	}

	@javax.inject.Inject
	DomainObjectContainer container;
}