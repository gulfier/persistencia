package mx.com.prosa.poc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the TBL_SEGMENTOS database table.
 * 
 */
@Entity
@Table(name="TBL_SEGMENTOS")
@NamedQuery(name="TblSegmentos.findAll", query="SELECT t FROM TblSegmentos t")
public class TblSegmentos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID_SEGMENTO")
	private long pkIdSegmento;

	@Column(name="DS_DESCRPCION")
	private String dsDescrpcion;

	@Column(name="DS_NOMBRE")
	private String dsNombre;

	@Column(name="DS_PCI")
	private String dsPci;

	@Column(name="DS_RANGO_IP_INICIA")
	private String dsRangoIpInicia;

	@Column(name="DS_RANGO_IP_TERMINA")
	private String dsRangoIpTermina;

	@Column(name="DS_TIPO")
	private String dsTipo;

	@ManyToOne
	@JoinColumn(name="FK_ID_UBICACION", referencedColumnName = "PK_ID_UBICACION", nullable = false, insertable = true, updatable = true)
	private TblUbicaciones fkIdUbicacion;

	public TblSegmentos() {
	}

	public long getPkIdSegmento() {
		return this.pkIdSegmento;
	}

	public void setPkIdSegmento(long pkIdSegmento) {
		this.pkIdSegmento = pkIdSegmento;
	}

	public String getDsDescrpcion() {
		return this.dsDescrpcion;
	}

	public void setDsDescrpcion(String dsDescrpcion) {
		this.dsDescrpcion = dsDescrpcion;
	}

	public String getDsNombre() {
		return this.dsNombre;
	}

	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

	public String getDsPci() {
		return this.dsPci;
	}

	public void setDsPci(String dsPci) {
		this.dsPci = dsPci;
	}

	public String getDsRangoIpInicia() {
		return this.dsRangoIpInicia;
	}

	public void setDsRangoIpInicia(String dsRangoIpInicia) {
		this.dsRangoIpInicia = dsRangoIpInicia;
	}

	public String getDsRangoIpTermina() {
		return this.dsRangoIpTermina;
	}

	public void setDsRangoIpTermina(String dsRangoIpTermina) {
		this.dsRangoIpTermina = dsRangoIpTermina;
	}

	public String getDsTipo() {
		return this.dsTipo;
	}

	public void setDsTipo(String dsTipo) {
		this.dsTipo = dsTipo;
	}

	public TblUbicaciones getFkIdUbicacion() {
		return this.fkIdUbicacion;
	}

	public void setFkIdUbicacion(TblUbicaciones fkIdUbicacion) {
		this.fkIdUbicacion = fkIdUbicacion;
	}

}