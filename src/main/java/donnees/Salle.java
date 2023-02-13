package donnees;

import javax.persistence.*;

@Entity
@Table(name = "t_salle_sal")
public class Salle {
    @Id
    @Column(name = "sal_id")
    private Short id;

    @Column(name = "sal_nom")
    private String nom;

    @Column(name = "sal_adresse")
    private String adresse;

    @Column(name = "sal_capacite")
    private Integer capacite;

    @Column(name = "sal_nom_gestionnaire")
    private String nomGestionnaire;

    @Column(name = "sal_prenom_gestionnaire")
    private String prenomGestionnaire;

    @Column(name = "sal_association")
    private String association;

    public Salle(Short id, String nom, String adresse, Integer capacite, String nomGestionnaire, String prenomGestionnaire, String association) {
        this.id=id;
        this.nom=nom;
        this.adresse=adresse;
        this.capacite=capacite;
        this.nomGestionnaire=nomGestionnaire;
        this.prenomGestionnaire=prenomGestionnaire;
        this.association=association;
    }

    public Salle() {
        super();
    }

    public Short getId() {
        return this.id;
    }

    public void setId(Short salId) {
        this.id = salId;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String salNom) {
        this.nom = salNom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String salAdresse) {
        this.adresse = salAdresse;
    }

    public Integer getCapacite() {
        return this.capacite;
    }

    public void setCapacite(Integer salCapacite) {
        this.capacite = salCapacite;
    }

    public String getNomGestionnaire() {
        return this.nomGestionnaire;
    }

    public void setNomGestionnaire(String salNomGestionnaire) {
        this.nomGestionnaire = salNomGestionnaire;
    }

    public String getPrenomGestionnaire() {
        return this.prenomGestionnaire;
    }

    public void setPrenomGestionnaire(String salPrenomGestionnaire) {
        this.prenomGestionnaire = salPrenomGestionnaire;
    }

    public String getAssociation() {
        return this.association;
    }

    public void setAssociation(String salAssociation) {
        this.association = salAssociation;
    }
}
