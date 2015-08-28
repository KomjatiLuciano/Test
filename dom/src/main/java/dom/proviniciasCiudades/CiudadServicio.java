package dom.proviniciasCiudades;

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

@DomainService(repositoryFor = Ciudad.class)
@DomainServiceLayout(named = "Ciudad", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "1")
@Named("Ciudad")
public class CiudadServicio extends AbstractFactoryAndRepository {

	@MemberOrder(name = "Ciudad", sequence = "1.1")
	public Ciudad crearCiudad(
			@ParameterLayout(named = "Nombre") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaNombres.REFERENCIA) final String nombre,
			@ParameterLayout(named = "Provincia") final ProvinciaEnum provincia) {

		final Ciudad ciudad = newTransientInstance(Ciudad.class);
		ciudad.setNombre(nombre.substring(0, 1).toUpperCase()
				+ nombre.substring(1));
		ciudad.setProvincia(provincia);
		persist(ciudad);
		container.flush();
		return ciudad;
	}

	@MemberOrder(name = "Ciudad", sequence = "1.2")
	public List<Ciudad> listarCiudades() {
		return container.allInstances(Ciudad.class);
	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public List<Ciudad> buscarCiudad(String ciudad) {
		return allMatches(QueryDefault.create(Ciudad.class, "buscarNombre",
				"parametro", ciudad));
	}

	@javax.inject.Inject
	DomainObjectContainer container;
}