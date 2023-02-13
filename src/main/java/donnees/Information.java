package donnees;

<<<<<<< HEAD
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
=======
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_information_inf", schema = "gestionevenement", catalog = "")
public class Information {
    @Basic
    @Column(name = "_id")
    private String id;
    @Basic
    @Column(name = "inf_cible")
    private Integer infCible;
    @Basic
    @Column(name = "inf_contenu")
    private String infContenu;
    @Basic
    @Column(name = "inf_date")
    private String infDate;
    @Basic
    @Column(name = "inf_nom")
    private String infNom;
    @Basic
    @Column(name = "inf_type")
    private String infType;
    @Basic
    @Column(name = "inf_type_contenu")
    private String infTypeContenu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getInfCible() {
        return infCible;
    }

    public void setInfCible(Integer infCible) {
        this.infCible = infCible;
    }

    public String getInfContenu() {
        return infContenu;
    }

    public void setInfContenu(String infContenu) {
        this.infContenu = infContenu;
    }

    public String getInfDate() {
        return infDate;
    }

    public void setInfDate(String infDate) {
        this.infDate = infDate;
    }

    public String getInfNom() {
        return infNom;
    }

    public void setInfNom(String infNom) {
        this.infNom = infNom;
    }

    public String getInfType() {
        return infType;
    }

    public void setInfType(String infType) {
        this.infType = infType;
    }

    public String getInfTypeContenu() {
        return infTypeContenu;
    }

    public void setInfTypeContenu(String infTypeContenu) {
        this.infTypeContenu = infTypeContenu;
>>>>>>> DevMarie
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
<<<<<<< HEAD
        if (!(o instanceof Information)) return false;
        Information that = (Information) o;
        return getId().equals(that.getId()) && Objects.equals(getInf_cible(), that.getInf_cible()) && Objects.equals(getInf_contenu(), that.getInf_contenu()) && Objects.equals(getInf_date(), that.getInf_date()) && Objects.equals(getInf_nom(), that.getInf_nom()) && Objects.equals(getInf_type(), that.getInf_type()) && Objects.equals(getInf_type_contenu(), that.getInf_type_contenu());
=======
        if (o == null || getClass() != o.getClass()) return false;

        Information that = (Information) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (infCible != null ? !infCible.equals(that.infCible) : that.infCible != null) return false;
        if (infContenu != null ? !infContenu.equals(that.infContenu) : that.infContenu != null) return false;
        if (infDate != null ? !infDate.equals(that.infDate) : that.infDate != null) return false;
        if (infNom != null ? !infNom.equals(that.infNom) : that.infNom != null) return false;
        if (infType != null ? !infType.equals(that.infType) : that.infType != null) return false;
        if (infTypeContenu != null ? !infTypeContenu.equals(that.infTypeContenu) : that.infTypeContenu != null)
            return false;

        return true;
>>>>>>> DevMarie
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hash(getId(), getInf_cible(), getInf_contenu(), getInf_date(), getInf_nom(), getInf_type(), getInf_type_contenu());
=======
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (infCible != null ? infCible.hashCode() : 0);
        result = 31 * result + (infContenu != null ? infContenu.hashCode() : 0);
        result = 31 * result + (infDate != null ? infDate.hashCode() : 0);
        result = 31 * result + (infNom != null ? infNom.hashCode() : 0);
        result = 31 * result + (infType != null ? infType.hashCode() : 0);
        result = 31 * result + (infTypeContenu != null ? infTypeContenu.hashCode() : 0);
        return result;
>>>>>>> DevMarie
    }
}
