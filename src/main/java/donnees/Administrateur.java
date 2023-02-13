package donnees;

import javax.persistence.*;

@Entity
@Table(name = "t_administrateur_adm")
public class Administrateur {
    @Id
    @Column(name = "adm_pseudo")
    private String pseudo;

    @Id
    @Column(name = "adm_mot_de_passe")
    private String motDePasse; //null

    public Administrateur(String pseudo, String motDePasse) {
        this.pseudo=pseudo;
        this.motDePasse=motDePasse;
    }

    public Administrateur() {
        super();
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String admPseudo) {
        this.pseudo = admPseudo;
    }

    public String getMotDePasse() {
        return this.motDePasse;
    }

    public void setMotDePasse(String admMotDePasse) {
        this.motDePasse = admMotDePasse;
    }
}
