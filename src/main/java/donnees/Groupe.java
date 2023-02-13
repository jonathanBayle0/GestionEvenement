package donnees;

import javax.persistence.*;

@Entity
@Table(name = "t_groupe_gro")
public class Groupe {
    @Id
    @Column(name = "gro_id")
    private Short groId;

    @Column(name = "gro_nom")
    private String nom;

    @Column(name = "gro_description")
    private String description;

    public Short getGroId() {
        return this.groId;
    }

    public void setGroId(Short groId) {
        this.groId = groId;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String groNom) {
        this.nom = groNom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String groDescription) {
        this.description = groDescription;
    }
}
