package jokergamestats;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Thomas
 */
@Embeddable
public class PrizecategoriesPK implements Serializable {
    @ManyToOne
    @JoinColumn(name="DRAWID")
    @Basic(optional = false)
    @Column(name = "DRAWID")
    private int drawid;
    @Basic(optional = false)
    @Column(name = "CATEGORY")
    private String category;

    public PrizecategoriesPK() {
    }

    public PrizecategoriesPK(int drawid, String category) {
        this.drawid = drawid;
        this.category = category;
    }

    public int getDrawid() {
        return drawid;
    }

    public void setDrawid(int drawid) {
        this.drawid = drawid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) drawid;
        hash += (category != null ? category.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrizecategoriesPK)) {
            return false;
        }
        PrizecategoriesPK other = (PrizecategoriesPK) object;
        if (this.drawid != other.drawid) {
            return false;
        }
        if ((this.category == null && other.category != null) || (this.category != null && !this.category.equals(other.category))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jokergamestats.PrizecategoriesPK[ drawid=" + drawid + ", category=" + category + " ]";
    }
    
}
