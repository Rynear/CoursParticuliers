/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felix
 */
@Entity
@Table(name = "cours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cours.findAll", query = "SELECT c FROM Cours c")
    , @NamedQuery(name = "Cours.findByIdE", query = "SELECT c FROM Cours c WHERE c.coursPK.idE = :idE")
    , @NamedQuery(name = "Cours.findByIdP", query = "SELECT c FROM Cours c WHERE c.coursPK.idP = :idP")
    , @NamedQuery(name = "Cours.findByDateHeureC", query = "SELECT c FROM Cours c WHERE c.dateHeureC = :dateHeureC")
    , @NamedQuery(name = "Cours.findByCommentaireC", query = "SELECT c FROM Cours c WHERE c.commentaireC = :commentaireC")})
public class Cours implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CoursPK coursPK;
    @Column(name = "DateHeureC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureC;
    @Size(max = 250)
    @Column(name = "CommentaireC")
    private String commentaireC;
    @JoinColumn(name = "IdE", referencedColumnName = "IdE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Eleve eleve;
    @JoinColumn(name = "IdP", referencedColumnName = "IdP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Prof prof;

    public Cours() {
    }

    public Cours(CoursPK coursPK) {
        this.coursPK = coursPK;
    }

    public Cours(int idE, int idP) {
        this.coursPK = new CoursPK(idE, idP);
    }

    public CoursPK getCoursPK() {
        return coursPK;
    }

    public void setCoursPK(CoursPK coursPK) {
        this.coursPK = coursPK;
    }

    public Date getDateHeureC() {
        return dateHeureC;
    }

    public void setDateHeureC(Date dateHeureC) {
        this.dateHeureC = dateHeureC;
    }

    public String getCommentaireC() {
        return commentaireC;
    }

    public void setCommentaireC(String commentaireC) {
        this.commentaireC = commentaireC;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coursPK != null ? coursPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cours)) {
            return false;
        }
        Cours other = (Cours) object;
        if ((this.coursPK == null && other.coursPK != null) || (this.coursPK != null && !this.coursPK.equals(other.coursPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Cours[ coursPK=" + coursPK + " ]";
    }
    
}
