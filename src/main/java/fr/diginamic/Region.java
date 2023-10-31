package fr.diginamic;
import javax.persistence.*;

@Entity
@Table(name="region")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="CODE_REGION")
	private String codeRegion;
	
	@Column(name="NOM_REGION")
	private String nomRegion;

	public Region() {
	}

	public Region(String codeRegion, String nomRegion) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

}
