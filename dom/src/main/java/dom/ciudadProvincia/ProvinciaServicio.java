package dom.ciudadProvincia;

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

import dom.doctor.Doctor;

@DomainService(repositoryFor = Provincia.class)
@DomainServiceLayout(named = "Provincia", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "2")
@Named("Provincia")
public class ProvinciaServicio extends AbstractFactoryAndRepository {

	@MemberOrder(name = "Provincia", sequence = "2.1")
	public Provincia crearProvincia(
			@ParameterLayout(named = "Nombre") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaNombres.REFERENCIA) final String nombre) {

		final Provincia provincia = newTransientInstance(Provincia.class);
		provincia.setNombre(nombre);
		persist(provincia);
		container.flush();
		return provincia;
	}

	@MemberOrder(name = "Provincia", sequence = "2.3")
	public List<Provincia> listarProvincias() {
		return container.allInstances(Provincia.class);
	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public List<Provincia> buscarProvincia(String provincia) {
		return allMatches(QueryDefault.create(Provincia.class,
				"traerProvincia", "parametro", provincia));
	}
	
	@ActionLayout(hidden = Where.EVERYWHERE)
	public List<Doctor> buscarDoctor(String doctor) {
		return allMatches(QueryDefault.create(Doctor.class,
				"buscarNombre,Apellido,Id", "parametro", doctor));
	}

	@javax.inject.Inject
	DomainObjectContainer container;

}