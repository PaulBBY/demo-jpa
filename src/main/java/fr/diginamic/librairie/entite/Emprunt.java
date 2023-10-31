package fr.diginamic.librairie.entite;

import javax.persistence.*;

@Entity
@Table
public class Emprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="DATE_DEBUT")
	private String dateDebut;
	
	@Column(name="DATE_FIN")
	private String dateFin;

	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	Client client;
	
	public Emprunt() {
	}

	
	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", client=" + client + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	
	

}
