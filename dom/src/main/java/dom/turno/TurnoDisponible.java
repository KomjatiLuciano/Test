package dom.turno;

import javax.jdo.annotations.DatastoreIdentity;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.services.i18n.TranslatableString;

@PersistenceCapable(identityType = IdentityType.DATASTORE)
@DatastoreIdentity(strategy = IdGeneratorStrategy.IDENTITY, column = "idTurnoDisponible")
public class TurnoDisponible implements IEstadoTurno {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre", "Turno Disponible.");
	}

	private Turno turno;

	public TurnoDisponible(Turno turno) {
		this.turno = turno;
	}

	@Override
	public void disponerTurno() {
		turno.setDisponible(true);

	}

	@Override
	public void solicitarTurno() {
		turno.setIEstadoTurno(turno.getTurnoSolicitado());

	}

	@Override
	public void aceptarTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atenderTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelarTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public String nombreEstado() {
		return "Turno Disponible.";
	}

}