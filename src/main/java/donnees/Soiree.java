package donnees;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_soiree_soi")
public class Soiree {
    @Id
    @Column(name = "soi_id")
    private Short id;

    @Column(name = "soi_nom")
    private String nom;

    @Column(name = "soi_date_debut")
    private java.sql.Timestamp dateDebut;

    @Column(name = "soi_date_fin")
    private java.sql.Timestamp dateFin;

    @Column(name = "sal_id")
    private Short salId;

    @Column(name = "soi_prix")
    private Double prix;

    public Soiree(Short id, String nom, Timestamp dateDebut, Timestamp dateFin, Short salId, Double prix) {
        this.id=id;
        this.nom=nom;
        this.dateDebut=dateDebut;
        this.dateFin=dateFin;
        this.salId=salId;
        this.prix=prix;
    }

    public Soiree() {
        super();
    }

    public Short getId() {
        return this.id;
    }

    public void setId(Short soiId) {
        this.id = soiId;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String soiNom) {
        this.nom = soiNom;
    }

    public java.sql.Timestamp getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(java.sql.Timestamp soiDateDebut) {
        this.dateDebut = soiDateDebut;
    }

    public java.sql.Timestamp getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(java.sql.Timestamp soiDateFin) {
        this.dateFin = soiDateFin;
    }

    public Short getSalId() {
        return this.salId;
    }

    public void setSalId(Short salId) {
        this.salId = salId;
    }

    public Double getPrix() {
        return this.prix;
    }

    public void setPrix(Double soiPrix) {
        this.prix = soiPrix;
    }
}
