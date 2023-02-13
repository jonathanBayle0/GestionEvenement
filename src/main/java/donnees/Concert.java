package donnees;

import javax.persistence.*;

@Entity
@Table(name = "t_concert_con")
public class Concert {
    @Id
    @Column(name = "con_id")
    private Short id;

    @Column(name = "con_date_debut")
    private java.sql.Timestamp dateDebut;

    @Column(name = "con_date_fin")
    private java.sql.Timestamp dateFin;

    @Column(name = "soi_id")
    private Short soiId;

    @Column(name = "gro_id")
    private Short groId;

    public Short getId() {
        return this.id;
    }

    public void setId(Short conId) {
        this.id = conId;
    }

    public java.sql.Timestamp getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(java.sql.Timestamp conDateDebut) {
        this.dateDebut = conDateDebut;
    }

    public java.sql.Timestamp getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(java.sql.Timestamp conDateFin) {
        this.dateFin = conDateFin;
    }

    public Short getSoiId() {
        return this.soiId;
    }

    public void setSoiId(Short soiId) {
        this.soiId = soiId;
    }

    public Short getGroId() {
        return this.groId;
    }

    public void setGroId(Short groId) {
        this.groId = groId;
    }
}
