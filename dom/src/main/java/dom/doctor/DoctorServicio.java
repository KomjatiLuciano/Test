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
package dom.doctor;

import java.util.List;

import javax.inject.Named;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Parameter;
import org.apache.isis.applib.annotation.ParameterLayout;
import org.apache.isis.applib.annotation.Where;
import org.apache.isis.applib.query.QueryDefault;
import org.joda.time.LocalDate;

import com.google.common.base.Predicate;

import dom.ciudadProvincia.Ciudad;
import dom.ciudadProvincia.Provincia;
import dom.especialidad.EspecialidadEnum;
import dom.estado.EstadoEnum;
import dom.tipoDeSexo.TipoDeSexoEnum;
import dom.tipoDocumento.TipoDocumentoEnum;

/**
 * Contiene la funcionalidad para Cargar/Listar un nuevo Doctor
 * 
 * @author Adamantiums
 * @since 01/06/2015
 * @version 1.0.0
 */
@DomainService(repositoryFor = Doctor.class)
@DomainServiceLayout(named = "Doctor", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "2")
@Named("Doctor")
public class DoctorServicio extends AbstractFactoryAndRepository {
	/**
	 * Retorna el nombre del icono para el Doctor
	 * 
	 * @return String
	 */
	public String iconName() {
		return "doctor";
	}

	/**
	 * Obtiene los datos validados del Cliente
	 * 
	 * @param apellido
	 *            String
	 * @param nombre
	 *            String
	 * @param documento
	 *            long
	 * @param direccion
	 *            String
	 * @param correo
	 *            String
	 * @param telefono
	 *            String
	 * @param matricula
	 *            String
	 * @param especialidad
	 *            EspecialidadEnum
	 * 
	 * @return doctor
	 */
	@MemberOrder(name = "Doctor", sequence = "2.1")
	public Doctor crearDoctor(
			@ParameterLayout(named = "Apellido") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaNombres.REFERENCIA) final String apellido,
			@ParameterLayout(named = "Nombre") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaNombres.REFERENCIA) final String nombre,
			@ParameterLayout(named = "Tipo De Sexo") final TipoDeSexoEnum tipoSexo,
			@ParameterLayout(named = "Fecha de Nacimiento") final LocalDate fechaNacimiento,
			@ParameterLayout(named = "Tipo De Documento") final TipoDocumentoEnum tipoDocumento,
			@ParameterLayout(named = "Documento") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaDoc.DOCUMENTO) final String documento,
			@ParameterLayout(named = "Provincia") final Provincia provincia,
			@ParameterLayout(named = "Ciudad") final Ciudad ciudad,
			@ParameterLayout(named = "Direccion") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaNombres.REFERENCIA) final String direccion,
			@ParameterLayout(named = "Correo") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaMail.EMAIL) final String correo,
			@ParameterLayout(named = "Telefono") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaTel.NUMEROTEL) final String telefono,
			@ParameterLayout(named = "Matricula") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaMatricula.MATRICULA) final String matricula,
			@ParameterLayout(named = "Especialidad") final EspecialidadEnum especialidad) {

		final Doctor doctor = newTransientInstance(Doctor.class);
		doctor.setApellido(apellido.substring(0, 1).toUpperCase()
				+ apellido.substring(1));
		doctor.setNombre(nombre.substring(0, 1).toUpperCase()
				+ nombre.substring(1));
		doctor.setTipoDeSexoEnum(tipoSexo);
		doctor.setFechaNacimiento(fechaNacimiento);
		doctor.setTipoDocumento(tipoDocumento);
		doctor.setDocumento(documento);
		doctor.setProvincia(provincia);
		doctor.setCiudad(ciudad);
		doctor.setDireccion(direccion.substring(0, 1).toUpperCase()
				+ direccion.substring(1));
		doctor.setCorreo(correo);
		doctor.setTelefono(telefono);
		doctor.setMatricula(matricula);
		doctor.setEspecialidad(especialidad);
		doctor.setEstado(EstadoEnum.Activo);
		persist(doctor);
		container.flush();
		return doctor;
	}

	/**
	 * Obtiene una lista de Doctores
	 * 
	 * @return listaDeDoctores List<Doctores>
	 */

	@ActionLayout(hidden = Where.EVERYWHERE)
	public List<Doctor> buscarDoctor(String doctor) {
		return allMatches(QueryDefault.create(Doctor.class,
				"buscarNombre,Apellido,Id", "parametro", doctor));
	}

	/**
	 * Obtiene una lista de todos los doctores
	 * 
	 * @return listaDeDoctores List<Doctores>
	 */
	@MemberOrder(name = "Doctor", sequence = "2.3")
	public List<Doctor> listarDoctores() {
		return container.allInstances(Doctor.class);
	}

	/**
	 * Obtiene una lista de Doctores Activos
	 * 
	 * @return List<Doctor>
	 */
	@MemberOrder(name = "Doctor", sequence = "2.4")
	public List<Doctor> listarDoctoresActivos() {
		return allMatches(Doctor.class, new Predicate<Doctor>() {

			@Override
			public boolean apply(Doctor input) {
				// TODO Auto-generated method stub
				return input.getEstado() == EstadoEnum.Activo ? true : false;
			}
		});
	}

	/**
	 * Obtiene una lista de Doctores Inactivos
	 * 
	 * @return List<Doctor>
	 */
	@MemberOrder(name = "Doctor", sequence = "2.5")
	public List<Doctor> listarDoctoresInactivos() {
		return allMatches(Doctor.class, new Predicate<Doctor>() {

			@Override
			public boolean apply(Doctor input) {
				// TODO Auto-generated method stub
				return input.getEstado() == EstadoEnum.Inactivo ? true : false;
			}
		});
	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public String buscarCiudad(final Provincia provincia, Ciudad ciudad) {

		return "";

	}

	public List<Provincia> choices0BuscarCiudad(final Provincia provincia) {
		return container.allMatches(QueryDefault.create(Provincia.class,
				"traerProvincia", "provincia", provincia));
	}

	public Provincia default0BuscarCiudad(final Provincia prov) {
		return container.allInstances(Provincia.class, 0).get(0);
	}

	public List<Provincia> choices1BuscarCiudad(final Provincia provincia,
			Ciudad ciudad) {
		return container.allMatches(QueryDefault.create(Provincia.class,
				"traerCiudad", "provincia", provincia, "ciudad", ciudad));
	}

	// Choices de Provincia y ciudades
		/**
		 * buscarProvincia retorna una lista de todas las Provincias en la base de
		 * datos.
		 * 
		 */

		@ActionLayout(hidden = Where.EVERYWHERE)
		public List<Provincia> buscarProvincia(String prov) {
			return allMatches(QueryDefault.create(Provincia.class,
					"traerProvincia", "nombre", prov));
		}

		/**
		 * Choice default devuelve la primer provincia de la lista.
		 * 
		 */
		public Provincia default6CrearDoctor() {
			return container.firstMatch(QueryDefault.create(Provincia.class,
					"traerTodas"));

		}

		/**
		 * Choice7 devuelve una lista de ciudades dependiendo cual provincia se
		 * selecciono previamente.
		 */

		public List<Ciudad> choices7CrearDoctor(final String apellido,
				final String nombre, final TipoDeSexoEnum tipoSexo,
				final LocalDate fechaNacimiento,
				final TipoDocumentoEnum tipoDocumento, final String documento,
				final Provincia provincias) {
			return container.allMatches(QueryDefault.create(Ciudad.class,
					"traerCiudad", "provincia", provincias));
		}

	@javax.inject.Inject
	DomainObjectContainer container;
}