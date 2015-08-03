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
package dom.estado;
/**
 * Clase enumerada, de la cual agrega el estado de un doctor,Paciente o
 * Recepcionista.
 * 
 * @author Adamantium
 * @since 01/06/2015
 * @version 1.0.0
 */
public enum EstadoEnum {
	Activo("Activo"), Inactivo("Inactivo");

	private final String nombre;

	public String getNombre() {
		return nombre;
	}

	private EstadoEnum(String nom) {
		nombre = nom;
	}

	@Override
	public String toString() {
		return this.nombre;
	}
}