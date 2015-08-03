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
package dom.dias;
/**
 * Interface para implementar los distintos tipos de Dias de la semana
 * 
 * @author Adamantium
 * @since 27/06/2015
 * @version 1.0.0
 */

public interface IHorasMañanaEnum {

	HorasMañanaEnum getCategory();

	void setCategory(HorasMañanaEnum horasMañanaEnum);
}