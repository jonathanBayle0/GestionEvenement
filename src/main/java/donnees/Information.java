package donnees;

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
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
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
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (infCible != null ? infCible.hashCode() : 0);
        result = 31 * result + (infContenu != null ? infContenu.hashCode() : 0);
        result = 31 * result + (infDate != null ? infDate.hashCode() : 0);
        result = 31 * result + (infNom != null ? infNom.hashCode() : 0);
        result = 31 * result + (infType != null ? infType.hashCode() : 0);
        result = 31 * result + (infTypeContenu != null ? infTypeContenu.hashCode() : 0);
        return result;
    }
}
