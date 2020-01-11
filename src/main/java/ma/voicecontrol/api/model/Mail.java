package ma.voicecontrol.api.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_MAIL",discriminatorType=DiscriminatorType.STRING,length=2)
public class Mail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String fromm;
    private String too;
    private String contenu;

    @ManyToOne
    private Utilisateur utilisateur;

    public Mail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFromm() {
        return fromm;
    }

    public void setFromm(String from) {
        this.fromm = from;
    }

    public String getToo() {
        return too;
    }

    public void setToo(String to) {
        this.too = to;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
