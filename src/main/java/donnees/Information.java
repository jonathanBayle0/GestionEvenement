package donnees;

import java.util.List;
import java.util.Objects;

import org.bson.types.ObjectId;
public class Information {
    private ObjectId id;

    private Short inf_cible;

    private String inf_contenu;

    private String inf_date;

    private String inf_nom;

    private String inf_type;

    private String inf_type_contenu;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Short getInf_cible() {
        return inf_cible;
    }

    public void setInf_cible(Short inf_cible) {
        this.inf_cible = inf_cible;
    }

    public String getInf_contenu() {
        return inf_contenu;
    }

    public void setInf_contenu(String inf_contenu) {
        this.inf_contenu = inf_contenu;
    }

    public String getInf_date() {
        return inf_date;
    }

    public void setInf_date(String inf_date) {
        this.inf_date = inf_date;
    }

    public String getInf_nom() {
        return inf_nom;
    }

    public void setInf_nom(String inf_nom) {
        this.inf_nom = inf_nom;
    }

    public String getInf_type() {
        return inf_type;
    }

    public void setInf_type(String inf_type) {
        this.inf_type = inf_type;
    }

    public String getInf_type_contenu() {
        return inf_type_contenu;
    }

    public void setInf_type_contenu(String inf_type_contenu) {
        this.inf_type_contenu = inf_type_contenu;
    }

    public Information(ObjectId id, Short inf_cible, String inf_contenu, String inf_date, String inf_nom, String inf_type, String inf_type_contenu) {
        super();
        this.id = id;
        this.inf_cible = inf_cible;
        this.inf_contenu = inf_contenu;
        this.inf_date = inf_date;
        this.inf_nom = inf_nom;
        this.inf_type = inf_type;
        this.inf_type_contenu = inf_type_contenu;
    }

    public Information() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Information)) return false;
        Information that = (Information) o;
        return getId().equals(that.getId()) && Objects.equals(getInf_cible(), that.getInf_cible()) && Objects.equals(getInf_contenu(), that.getInf_contenu()) && Objects.equals(getInf_date(), that.getInf_date()) && Objects.equals(getInf_nom(), that.getInf_nom()) && Objects.equals(getInf_type(), that.getInf_type()) && Objects.equals(getInf_type_contenu(), that.getInf_type_contenu());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInf_cible(), getInf_contenu(), getInf_date(), getInf_nom(), getInf_type(), getInf_type_contenu());
    }
}
