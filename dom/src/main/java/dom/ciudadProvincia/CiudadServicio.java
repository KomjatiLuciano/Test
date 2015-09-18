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

@DomainService(repositoryFor = Ciudad.class)
@DomainServiceLayout(named = "Ciudad", menuBar = DomainServiceLayout.MenuBar.PRIMARY, menuOrder = "2")
@Named("Ciudad")
public class CiudadServicio extends AbstractFactoryAndRepository {

	@MemberOrder(name = "Ciudad", sequence = "2.1")
	public Ciudad crearCiudad(
			@ParameterLayout(named = "Nombre") @Parameter(regexPattern = dom.regex.RegexValidation.ValidaNombres.REFERENCIA) final String nombre,
			@ParameterLayout(named = "Provincia") final Provincia provincia) {

		final Ciudad ciudad = newTransientInstance(Ciudad.class);
		ciudad.setNombre(nombre);
		ciudad.setProvincia(provincia);
		persist(ciudad);
		container.flush();
		return ciudad;
	}

	@MemberOrder(name = "Ciudad", sequence = "2.3")
	public List<Ciudad> listarCiudades() {
		return container.allInstances(Ciudad.class);
	}

	@ActionLayout(hidden = Where.EVERYWHERE)
	public List<Ciudad> buscarCiudad(String ciudad) {
		return allMatches(QueryDefault.create(Ciudad.class, "traerCiudad",
				"parametro", ciudad));
	}

	@javax.inject.Inject
	DomainObjectContainer container;

}