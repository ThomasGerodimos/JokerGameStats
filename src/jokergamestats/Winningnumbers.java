/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokergamestats;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thomas
 */
@Entity
@Table(name = "WINNINGNUMBERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Winningnumbers.findAll", query = "SELECT w FROM Winningnumbers w")
    , @NamedQuery(name = "Winningnumbers.findByDrawid", query = "SELECT w FROM Winningnumbers w WHERE w.drawid = :drawid")
    , @NamedQuery(name = "Winningnumbers.findByNumber1", query = "SELECT w FROM Winningnumbers w WHERE w.number1 = :number1")
    , @NamedQuery(name = "Winningnumbers.findByNumber2", query = "SELECT w FROM Winningnumbers w WHERE w.number2 = :number2")
    , @NamedQuery(name = "Winningnumbers.findByNumber3", query = "SELECT w FROM Winningnumbers w WHERE w.number3 = :number3")
    , @NamedQuery(name = "Winningnumbers.findByNumber4", query = "SELECT w FROM Winningnumbers w WHERE w.number4 = :number4")
    , @NamedQuery(name = "Winningnumbers.findByNumber5", query = "SELECT w FROM Winningnumbers w WHERE w.number5 = :number5")
    , @NamedQuery(name = "Winningnumbers.findByBonus", query = "SELECT w FROM Winningnumbers w WHERE w.bonus = :bonus")
    , @NamedQuery(name = "Winningnumbers.findByDrawsgameid", query = "SELECT w FROM Winningnumbers w WHERE w.drawsgameid = :drawsgameid")
    , @NamedQuery(name = "Winningnumbers.deleteByDrawid", query = "DELETE FROM Winningnumbers w WHERE w.drawid = :drawid")    
})
public class Winningnumbers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DRAWID")
    private Integer drawid;
    @Column(name = "NUMBER1")
    private Integer number1;
    @Column(name = "NUMBER2")
    private Integer number2;
    @Column(name = "NUMBER3")
    private Integer number3;
    @Column(name = "NUMBER4")
    private Integer number4;
    @Column(name = "NUMBER5")
    private Integer number5;
    @Column(name = "BONUS")
    private Integer bonus;
    @Basic(optional = false)
    @Column(name = "DRAWSGAMEID")
    private int drawsgameid;

    public Winningnumbers() {
    }

    public Winningnumbers(Integer drawid) {
        this.drawid = drawid;
    }

    public Winningnumbers(Integer drawid, int drawsgameid) {
        this.drawid = drawid;
        this.drawsgameid = drawsgameid;
    }

    public Integer getDrawid() {
        return drawid;
    }

    public void setDrawid(Integer drawid) {
        this.drawid = drawid;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }

    public Integer getNumber4() {
        return number4;
    }

    public void setNumber4(Integer number4) {
        this.number4 = number4;
    }

    public Integer getNumber5() {
        return number5;
    }

    public void setNumber5(Integer number5) {
        this.number5 = number5;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
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
        hash += (drawid != null ? drawid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Winningnumbers)) {
            return false;
        }
        Winningnumbers other = (Winningnumbers) object;
        if ((this.drawid == null && other.drawid != null) || (this.drawid != null && !this.drawid.equals(other.drawid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jokergamestats.Winningnumbers[ drawid=" + drawid + " ]";
    }
    
}
