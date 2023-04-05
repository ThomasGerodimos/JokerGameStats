/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokergamestats;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "DRAWS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Draws.findAll", query = "SELECT d FROM Draws d")
    , @NamedQuery(name = "Draws.findByDrawid", query = "SELECT d FROM Draws d WHERE d.drawsPK.drawid = :drawid")
    , @NamedQuery(name = "Draws.findByDrawdate", query = "SELECT d FROM Draws d WHERE d.drawdate = :drawdate")
    , @NamedQuery(name = "Draws.findByGameid", query = "SELECT d FROM Draws d WHERE d.drawsPK.gameid = :gameid")
    , @NamedQuery(name = "Draws.DeleteByDrawid", query = "DELETE FROM Draws d WHERE d.drawsPK.drawid = :drawid")
    , @NamedQuery(name = "Draws.DistinctYears", query = "SELECT distinct FUNCTION('YEAR',d.drawdate) AS Year FROM Draws d")
    , @NamedQuery(name = "Draws.DistinctMonths", query = "SELECT distinct FUNCTION('MONTH',d.drawdate) AS Month FROM Draws d WHERE FUNCTION('YEAR',d.drawdate) = :prmYear")
    , @NamedQuery(name = "Draws.CountDrawsPerYearAndMonth", query = "SELECT COUNT(d) AS Total FROM Draws d WHERE FUNCTION('YEAR',d.drawdate) = :prmYear AND FUNCTION('MONTH',d.drawdate) = :prmMonth")
    , @NamedQuery(name = "Draws.DrawsListPerYearAndMonth", query = "SELECT d.drawsPK.drawid FROM Draws d WHERE FUNCTION('YEAR',d.drawdate) =:prmYear AND FUNCTION('MONTH',d.drawdate) =:prmMonth")

})
public class Draws implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DrawsPK drawsPK;
    @Column(name = "DRAWDATE")
    @Temporal(TemporalType.DATE)
    private Date drawdate;
    
    public Draws() {
    }

    public Draws(DrawsPK drawsPK) {
        this.drawsPK = drawsPK;
    }

    public Draws(int drawid, int gameid) {
        this.drawsPK = new DrawsPK(drawid, gameid);
    }

    public DrawsPK getDrawsPK() {
        return drawsPK;
    }

    public void setDrawsPK(DrawsPK drawsPK) {
        this.drawsPK = drawsPK;
    }

    public Date getDrawdate() {
        return drawdate;
    }

    public void setDrawdate(Date drawdate) {
        this.drawdate = drawdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drawsPK != null ? drawsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Draws)) {
            return false;
        }
        Draws other = (Draws) object;
        if ((this.drawsPK == null && other.drawsPK != null) || (this.drawsPK != null && !this.drawsPK.equals(other.drawsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jokergamestats.Draws[ drawsPK=" + drawsPK + " ]";
    }
    
}
