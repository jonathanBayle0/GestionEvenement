package donnees;

import javax.persistence.*;

@Entity
@Table(name = "t_artiste_art")
public class Artiste {
    @Id
    @Column(name = "art_id")
    private Short id;

    @Column(name = "art_nom")
    private String nom;

    @Column(name = "art_prenom")
    private String prenom;

    @Column(name = "art_pseudo")
    private String pseudo;

    @Column(name = "gro_id")
    private Short groId;

    public Short getId() {
        return this.id;
    }

    public void setId(Short artId) {
        this.id = artId;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String artNom) {
        this.nom = artNom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String artPrenom) {
        this.prenom = artPrenom;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String artPseudo) {
        this.pseudo = artPseudo;
    }

    public Short getGroId() {
        return this.groId;
    }

    public void setGroId(Short groId) {
        this.groId = groId;
    }
}
