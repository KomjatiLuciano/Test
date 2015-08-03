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

import javax.jdo.annotations.DatastoreIdentity;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.services.i18n.TranslatableString;

@PersistenceCapable(identityType = IdentityType.DATASTORE)
@DatastoreIdentity(strategy = IdGeneratorStrategy.IDENTITY, column = "idTurnoSolicitado")
public class TurnoSolicitado implements IEstadoTurno {

	public TranslatableString title() {
		return TranslatableString.tr("{nombre}", "nombre", "Turno Solicitado.");
	}

	private Turno turno;

	public TurnoSolicitado(Turno turno) {
		this.turno = turno;
	}

	@Override
	public void disponerTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void solicitarTurno() {
		turno.setDisponible(false);
	}

	@Override
	public void aceptarTurno() {
		// envia el mail
		this.turno.setIEstadoTurno(this.turno.getTurnoAceptado());

	}

	@Override
	public void atenderTurno() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelarTurno() {
		this.turno.setIEstadoTurno(this.turno.getTurnoCancelado());
		// turno.setDisponible(true);

	}

	@Override
	public String nombreEstado() {
		return "Turno Solicitado.";
	}

}