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
package dom.regex;

public final class RegexValidation {
	public static final class ValidaNombres {

		private ValidaNombres() {
		}

		public static final String REFERENCIA = "[a-z,A-Z,0-9,ñ,Ñ, ]+";
		public static final String INICIALES = "[a-z,A-Z,ñ,Ñ]{2}$+";
	}

	public static final class ValidaTel {
		private ValidaTel() {

		}

		public static final String NUMEROTEL = "[+]?[0-9 -]*";

	}

	public static final class ValidaMail {
		private ValidaMail() {

		}

		public static final String EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	}

	public static final class ValidaDoc {
		private ValidaDoc() {

		}

		public static final String DOCUMENTO = "[0-9]+";
	}

	public static final class ValidaMatricula {

		private ValidaMatricula() {

		}

		public static final String MATRICULA = "[a-z,A-Z,0-9,ñ,Ñ]+";

	}

	public static final class ValidaNumCarnet {
		private ValidaNumCarnet() {

		}

		public static final String NUMCARNET = "[0-9,-]+";
	}

	public static final class ValidaCobertura {
		private ValidaCobertura() {

		}

		public static final String COBERTURA = "[a-z, A-Z,0-9,-]+";
	}

	public static final class ValidaHora {
		private ValidaHora() {

		}

		public static final String HORA = "[0-23]{2}+[:]+[0-59]{2}";
	}
}