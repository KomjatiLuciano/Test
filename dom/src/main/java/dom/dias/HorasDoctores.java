package dom.dias;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.services.i18n.TranslatableString;

import dom.doctor.Doctor;

@PersistenceCapable
public class HorasDoctores {

	// Doctor doc = new Doctor();

	/**
	 * Representa en UI el nombre "Doctor" en carga/modificacion.
	 */
	/*----------------------------------------------------*/
	// public TranslatableString title() {
	// return TranslatableString.tr("{nombre}", "nombre", "Horas Doctor: "
	// + doc.getApellido() + ", " + doc.getNombre());
	// }

	/**
	 * Obtiene el nombre del icono.
	 */
	/*----------------------------------------------------*/
	public String iconName() {
		return "horas";
	}

	// {{ Doctor (property)
	private Doctor doctor;

	@Column(allowsNull = "true")
	@MemberOrder(sequence = "1")
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(final Doctor doctor) {
		this.doctor = doctor;
	}

	// }}

	// {{ SieteAm (property)
	private String sieteAm;

	@Column(allowsNull = "true")
	@MemberOrder(sequence = "2")
	public String getSieteAm() {
		return sieteAm;
	}

	public void setSieteAm(final String sieteAm) {
		this.sieteAm = sieteAm;
	}

	// }}

	// {{ SieteTreintaAm (property)
	private String sieteTreintaAm;

	@MemberOrder(sequence = "3")
	@Column(allowsNull = "true")
	public String getSieteTreintaAm() {
		return sieteTreintaAm;
	}

	public void setSieteTreintaAm(final String sieteTreintaAm) {
		this.sieteTreintaAm = sieteTreintaAm;
	}

	// }}

	// {{ OchoAm (property)
	private String ochoam;

	@MemberOrder(sequence = "4")
	@Column(allowsNull = "true")
	public String getOchoAm() {
		return ochoam;
	}

	public void setOchoAm(final String ochoam) {
		this.ochoam = ochoam;
	}

	// }}

	// {{ OchoTreintaAm (property)
	private String ochoTreintaAm;

	@MemberOrder(sequence = "5")
	@Column(allowsNull = "true")
	public String getOchoTreintaAm() {
		return ochoTreintaAm;
	}

	public void setOchoTreintaAm(final String ochoTreintaAm) {
		this.ochoTreintaAm = ochoTreintaAm;
	}

	// }}

	// {{ NueveAm (property)
	private String nueveAm;

	@MemberOrder(sequence = "6")
	@Column(allowsNull = "true")
	public String getNueveAm() {
		return nueveAm;
	}

	public void setNueveAm(final String nueveAm) {
		this.nueveAm = nueveAm;
	}

	// }}

	// {{ NueveTreintaAm (property)
	private String nueveTreintaAm;

	@MemberOrder(sequence = "7")
	@Column(allowsNull = "true")
	public String getNueveTreintaAm() {
		return nueveTreintaAm;
	}

	public void setNueveTreintaAm(final String nueveTreintaAm) {
		this.nueveTreintaAm = nueveTreintaAm;
	}

	// }}

	// {{ DiezAm (property)
	private String diezAm;

	@MemberOrder(sequence = "8")
	@Column(allowsNull = "true")
	public String getDiezAm() {
		return diezAm;
	}

	public void setDiezAm(final String diezAm) {
		this.diezAm = diezAm;
	}

	// }}

	// {{ DiezTreintaAm (property)
	private String diezTreintaAm;

	@MemberOrder(sequence = "9")
	@Column(allowsNull = "true")
	public String getDiezTreintaAm() {
		return diezTreintaAm;
	}

	public void setDiezTreintaAm(final String diezTreintaAm) {
		this.diezTreintaAm = diezTreintaAm;
	}

	// }}

	// {{ OnceAm (property)
	private String onceAm;

	@MemberOrder(sequence = "10")
	@Column(allowsNull = "true")
	public String getOnceAm() {
		return onceAm;
	}

	public void setOnceAm(final String onceAm) {
		this.onceAm = onceAm;
	}

	// }}

	// {{ OnceTreintaAm (property)
	private String onceTreintaAm;

	@MemberOrder(sequence = "11")
	@Column(allowsNull = "true")
	public String getOnceTreintaAm() {
		return onceTreintaAm;
	}

	public void setOnceTreintaAm(final String onceTreintaAm) {
		this.onceTreintaAm = onceTreintaAm;
	}

	// }}

	// {{ DoceAm (property)
	private String doceAm;

	@MemberOrder(sequence = "12")
	@Column(allowsNull = "true")
	public String getDoceAm() {
		return doceAm;
	}

	public void setDoceAm(final String doceAm) {
		this.doceAm = doceAm;
	}

	// }}

	// {{ DoceTreintaPm (property)
	private String doceTreintaPm;

	@MemberOrder(sequence = "13")
	@Column(allowsNull = "true")
	public String getDoceTreintaPm() {
		return doceTreintaPm;
	}

	public void setDoceTreintaPm(final String doceTreintaPm) {
		this.doceTreintaPm = doceTreintaPm;
	}

	// }}

	// {{ UnaPm (property)
	private String unaPm;

	@MemberOrder(sequence = "14")
	@Column(allowsNull = "true")
	public String getUnaPm() {
		return unaPm;
	}

	public void setUnaPm(final String unaPm) {
		this.unaPm = unaPm;
	}

	// }}

	// {{ UnaTreintaPm (property)
	private String unaTreintaPm;

	@MemberOrder(sequence = "15")
	@Column(allowsNull = "true")
	public String getUnaTreintaPm() {
		return unaTreintaPm;
	}

	public void setUnaTreintaPm(final String unaTreintaPm) {
		this.unaTreintaPm = unaTreintaPm;
	}

	// }}

	// {{ DosPm (property)
	private String dosPm;

	@MemberOrder(sequence = "16")
	@Column(allowsNull = "true")
	public String getDosPm() {
		return dosPm;
	}

	public void setDosPm(final String dosPm) {
		this.dosPm = dosPm;
	}

	// }}

	// {{ DosTreintaPm (property)
	private String dosTreintaPm;

	@MemberOrder(sequence = "17")
	@Column(allowsNull = "true")
	public String getDosTreintaPm() {
		return dosTreintaPm;
	}

	public void setDosTreintaPm(final String dosTreintaPm) {
		this.dosTreintaPm = dosTreintaPm;
	}

	// }}

	// {{ TresPm (property)
	private String tresPm;

	@MemberOrder(sequence = "18")
	@Column(allowsNull = "true")
	public String getTresPm() {
		return tresPm;
	}

	public void setTresPm(final String tresPm) {
		this.tresPm = tresPm;
	}

	// }}

	// {{ TresTreintaPm (property)
	private String tresTreintaPm;

	@MemberOrder(sequence = "19")
	@Column(allowsNull = "true")
	public String getTresTreintaPm() {
		return tresTreintaPm;
	}

	public void setTresTreintaPm(final String tresTreintaPm) {
		this.tresTreintaPm = tresTreintaPm;
	}

	// }}

	// {{ CuatroPm (property)
	private String cuatroPm;

	@MemberOrder(sequence = "20")
	@Column(allowsNull = "true")
	public String getCuatroPm() {
		return cuatroPm;
	}

	public void setCuatroPm(final String cuatroPm) {
		this.cuatroPm = cuatroPm;
	}

	// }}

	// {{ CuatroTreintaPm (property)
	private String cuatroTreintaPm;

	@MemberOrder(sequence = "21")
	@Column(allowsNull = "true")
	public String getCuatroTreintaPm() {
		return cuatroTreintaPm;
	}

	public void setCuatroTreintaPm(final String cuatroTreintaPm) {
		this.cuatroTreintaPm = cuatroTreintaPm;
	}

	// }}

	// {{ CincoPm (property)
	private String cincoPm;

	@MemberOrder(sequence = "22")
	@Column(allowsNull = "true")
	public String getCincoPm() {
		return cincoPm;
	}

	public void setCincoPm(final String cincoPm) {
		this.cincoPm = cincoPm;
	}

	// }}

	// {{ CincoTreintaPm (property)
	private String cincoTreintaPm;

	@MemberOrder(sequence = "23")
	@Column(allowsNull = "true")
	public String getCincoTreintaPm() {
		return cincoTreintaPm;
	}

	public void setCincoTreintaPm(final String cincoTreintaPm) {
		this.cincoTreintaPm = cincoTreintaPm;
	}

	// }}

	// {{ SeisPm (property)
	private String seisPm;

	@MemberOrder(sequence = "24")
	@Column(allowsNull = "true")
	public String getSeisPm() {
		return seisPm;
	}

	public void setSeisPm(final String seisPm) {
		this.seisPm = seisPm;
	}

	// }}

	// {{ SeisTreintaPm (property)
	private String seisTreintaPm;

	@MemberOrder(sequence = "25")
	@Column(allowsNull = "true")
	public String getSeisTreintaPm() {
		return seisTreintaPm;
	}

	public void setSeisTreintaPm(final String seisTreintaPm) {
		this.seisTreintaPm = seisTreintaPm;
	}

	// }}

	// {{ SietePm (property)
	private String sietePm;

	@MemberOrder(sequence = "26")
	@Column(allowsNull = "true")
	public String getSietePm() {
		return sietePm;
	}

	public void setSietePm(final String sietePm) {
		this.sietePm = sietePm;
	}

	// }}

	// {{ SieteTreintaPm (property)
	private String sieteTreintaPm;

	@MemberOrder(sequence = "27")
	@Column(allowsNull = "true")
	public String getSieteTreintaPm() {
		return sieteTreintaPm;
	}

	public void setSieteTreintaPm(final String sieteTreintaPm) {
		this.sieteTreintaPm = sieteTreintaPm;
	}

	// }}

	// {{ OchoPm (property)
	private String ochoPm;

	@MemberOrder(sequence = "28")
	@Column(allowsNull = "true")
	public String getOchoPm() {
		return ochoPm;
	}

	public void setOchoPm(final String ochoPm) {
		this.ochoPm = ochoPm;
	}

	// }}

	// {{ OchoTreintaPm (property)
	private String ochoTreintaPm;

	@MemberOrder(sequence = "29")
	@Column(allowsNull = "true")
	public String getOchoTreintaPm() {
		return ochoTreintaPm;
	}

	public void setOchoTreintaPm(final String ochoTreintaPm) {
		this.ochoTreintaPm = ochoTreintaPm;
	}
	// }}

}