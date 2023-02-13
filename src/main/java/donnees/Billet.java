package donnees;

import javax.persistence.*;

@Entity
@Table(name = "t_billet_bil")
public class Billet {
    @Id
    @Column(name = "bil_id")
    private Short id;

    @Column(name = "bil_categorie")
    private Integer categorie;

    @Column(name = "soi_id")
    private Short soiId;

    public Billet(Short id, Integer categorie, Short soiId) {
        this.id=id;
        this.categorie=categorie;
        this.soiId=soiId;
    }

    public Billet() {
        super();
    }

    public Short getId() {
        return this.id;
    }

    public void setId(Short bilId) {
        this.id = bilId;
    }

    public Integer getCategorie() {
        return this.categorie;
    }

    public void setCategorie(Integer bilCategorie) {
        this.categorie = bilCategorie;
    }

    public Short getSoiId() {
        return this.soiId;
    }

    public void setSoiId(Short soiId) {
        this.soiId = soiId;
    }
}
