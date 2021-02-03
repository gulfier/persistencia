package mx.com.prosa.poc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TBL_FUNCIONES_NEGOCIO database table.
 * 
 */
@Entity
@Table(name="TBL_FUNCIONES_NEGOCIO")
@NamedQuery(name="TblFuncionesNegocio.findAll", query="SELECT t FROM TblFuncionesNegocio t")
public class TblFuncionesNegocio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID_FUNCION")
	private long pkIdFuncion;

	@Column(name="DS_CODE")
	private String dsCode;

	@Column(name="DS_NAME")
	private String dsName;

	@Column(name="DS_USER_CREATION")
	private String dsUserCreation;

	@Column(name="DS_USER_MODIFICATION")
	private String dsUserModification;

	@Column(name="DT_CREATION")
	private Timestamp dtCreation;

	@Column(name="DT_MODIFIED")
	private Timestamp dtModified;

	public TblFuncionesNegocio() {
	}

	public long getPkIdFuncion() {
		return this.pkIdFuncion;
	}

	public void setPkIdFuncion(long pkIdFuncion) {
		this.pkIdFuncion = pkIdFuncion;
	}

	public String getDsCode() {
		return this.dsCode;
	}

	public void setDsCode(String dsCode) {
		this.dsCode = dsCode;
	}

	public String getDsName() {
		return this.dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getDsUserCreation() {
		return this.dsUserCreation;
	}

	public void setDsUserCreation(String dsUserCreation) {
		this.dsUserCreation = dsUserCreation;
	}

	public String getDsUserModification() {
		return this.dsUserModification;
	}

	public void setDsUserModification(String dsUserModification) {
		this.dsUserModification = dsUserModification;
	}

	public Timestamp getDtCreation() {
		return this.dtCreation;
	}

	public void setDtCreation(Timestamp dtCreation) {
		this.dtCreation = dtCreation;
	}

	public Timestamp getDtModified() {
		return this.dtModified;
	}

	public void setDtModified(Timestamp dtModified) {
		this.dtModified = dtModified;
	}

}