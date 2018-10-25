/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Felix
 */
@Embeddable
public class CoursPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IdE")
    private int idE;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdP")
    private int idP;

    public CoursPK() {
    }

    public CoursPK(int idE, int idP) {
        this.idE = idE;
        this.idP = idP;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idE;
        hash += (int) idP;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoursPK)) {
            return false;
        }
        CoursPK other = (CoursPK) object;
        if (this.idE != other.idE) {
            return false;
        }
        if (this.idP != other.idP) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.CoursPK[ idE=" + idE + ", idP=" + idP + " ]";
    }
    
}
