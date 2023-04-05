/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokergamestats;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

/**
 *
 * @author Thomas
 */
@Embeddable
public class DrawsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DRAWID")
    @OneToMany(mappedBy="DRAWID")
    private int drawid;
    @Basic(optional = false)
    @Column(name = "GAMEID")
    private int gameid;

    public DrawsPK() {
    }

    public DrawsPK(int drawid, int gameid) {
        this.drawid = drawid;
        this.gameid = gameid;
    }

    public int getDrawid() {
        return drawid;
    }

    public void setDrawid(int drawid) {
        this.drawid = drawid;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) drawid;
        hash += (int) gameid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DrawsPK)) {
            return false;
        }
        DrawsPK other = (DrawsPK) object;
        if (this.drawid != other.drawid) {
            return false;
        }
        if (this.gameid != other.gameid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jokergamestats.DrawsPK[ drawid=" + drawid + ", gameid=" + gameid + " ]";
    }
    
}
