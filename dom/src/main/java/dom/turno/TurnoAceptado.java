package dom.turno;

import javax.jdo.annotations.DatastoreIdentity;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.services.i18n.TranslatableString;

@PersistenceCapable(identityType = IdentityType.DATASTORE)
@DatastoreIdentity(strategy = IdGeneratorStrategy.IDENTITY, column = "idTurnoAceptado")
public class TurnoAceptado implements IEstadoTurno {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre", "Turno Aceptado.");
	}

	private Turno turno;

	public TurnoAceptado(Turno turno) {
		this.turno = turno;
	}

	@Override
	public void disponerTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void solicitarTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aceptarTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atenderTurno() {
		this.turno.setIEstadoTurno(this.turno.getTurnoAtendido());

	}

	@Override
	public void cancelarTurno() {
		this.turno.setIEstadoTurno(this.turno.getTurnoCancelado());

	}

	@Override
	public String nombreEstado() {
		return "Turno Aceptado.";
	}

}