/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokergamestats;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "PRIZECATEGORIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prizecategories.findAll", query = "SELECT p FROM Prizecategories p")
    , @NamedQuery(name = "Prizecategories.findByDrawid", query = "SELECT p FROM Prizecategories p WHERE p.prizecategoriesPK.drawid = :drawid")
    , @NamedQuery(name = "Prizecategories.findByCategory", query = "SELECT p FROM Prizecategories p WHERE p.prizecategoriesPK.category = :category")
    , @NamedQuery(name = "Prizecategories.findByProfits", query = "SELECT p FROM Prizecategories p WHERE p.profits = :profits")
    , @NamedQuery(name = "Prizecategories.findByWinners", query = "SELECT p FROM Prizecategories p WHERE p.winners = :winners")
    , @NamedQuery(name = "Prizecategories.findByProfitpercategory", query = "SELECT p FROM Prizecategories p WHERE p.profitpercategory = :profitpercategory")
    , @NamedQuery(name = "Prizecategories.findByDrawsgameid", query = "SELECT p FROM Prizecategories p WHERE p.drawsgameid = :drawsgameid")
    , @NamedQuery(name = "Prizecategories.deleteByDrawid", query = "DELETE FROM Prizecategories p WHERE p.prizecategoriesPK.drawid = :drawid")
    , @NamedQuery(name = "Prizecategories.ProfitByDrawid", query = "SELECT SUM(p.profits) FROM Prizecategories p WHERE p.prizecategoriesPK.drawid = :prmDrawid")
    , @NamedQuery(name = "Prizecategories.JackpotsByDrawid", query = "SELECT COUNT(p) FROM Prizecategories p WHERE p.prizecategoriesPK.drawid = :prmDrawid and p.winners = :prmWinners and p.prizecategoriesPK.category = :prmCategory")
})
public class Prizecategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrizecategoriesPK prizecategoriesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROFITS")
    private Float profits;
    @Column(name = "WINNERS")
    private Integer winners;
    @Column(name = "PROFITPERCATEGORY")
    private Float profitpercategory;
    @Basic(optional = false)
    @Column(name = "DRAWSGAMEID")
    private int drawsgameid;

    public Prizecategories() {
    }

    public Prizecategories(PrizecategoriesPK prizecategoriesPK) {
        this.prizecategoriesPK = prizecategoriesPK;
    }

    public Prizecategories(PrizecategoriesPK prizecategoriesPK, int drawsgameid) {
        this.prizecategoriesPK = prizecategoriesPK;
        this.drawsgameid = drawsgameid;
    }

    public Prizecategories(int drawid, String category) {
        this.prizecategoriesPK = new PrizecategoriesPK(drawid, category);
    }

    public PrizecategoriesPK getPrizecategoriesPK() {
        return prizecategoriesPK;
    }

    public void setPrizecategoriesPK(PrizecategoriesPK prizecategoriesPK) {
        this.prizecategoriesPK = prizecategoriesPK;
    }

    public Float getProfits() {
        return profits;
    }

    public void setProfits(Float profits) {
        this.profits = profits;
    }

    public Integer getWinners() {
        return winners;
    }

    public void setWinners(Integer winners) {
        this.winners = winners;
    }

    public Float getProfitpercategory() {
        return profitpercategory;
    }

    public void setProfitpercategory(Float profitpercategory) {
        this.profitpercategory = profitpercategory;
    }

    public int getDrawsgameid() {
        return drawsgameid;
    }

    public void setDrawsgameid(int drawsgameid) {
        this.drawsgameid = drawsgameid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prizecategoriesPK != null ? prizecategoriesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prizecategories)) {
            return false;
        }
        Prizecategories other = (Prizecategories) object;
        if ((this.prizecategoriesPK == null && other.prizecategoriesPK != null) || (this.prizecategoriesPK != null && !this.prizecategoriesPK.equals(other.prizecategoriesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jokergamestats.Prizecategories[ prizecategoriesPK=" + prizecategoriesPK + " ]";
    }
    
}
