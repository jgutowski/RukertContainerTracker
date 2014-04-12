/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kasha and Jeff
 */
@Entity
@Table(name = "containerinventory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Containerinventory.findAll", query = "SELECT c FROM Containerinventory c"),
    @NamedQuery(name = "Containerinventory.findById", query = "SELECT c FROM Containerinventory c WHERE c.id = :id"),
    @NamedQuery(name = "Containerinventory.findByContainerNumber", query = "SELECT c FROM Containerinventory c WHERE c.containerNumber = :containerNumber"),
    @NamedQuery(name = "Containerinventory.findByFullOut", query = "SELECT c FROM Containerinventory c WHERE c.fullOut = :fullOut"),
    @NamedQuery(name = "Containerinventory.findByEmptyIn", query = "SELECT c FROM Containerinventory c WHERE c.emptyIn = :emptyIn"),
    @NamedQuery(name = "Containerinventory.findByEmptyOut", query = "SELECT c FROM Containerinventory c WHERE c.emptyOut = :emptyOut"),
    @NamedQuery(name = "Containerinventory.findByFullIn", query = "SELECT c FROM Containerinventory c WHERE c.fullIn = :fullIn"),
    @NamedQuery(name = "Containerinventory.findByComments", query = "SELECT c FROM Containerinventory c WHERE c.comments = :comments")})
public class Containerinventory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 15)
    @Column(name = "containerNumber")
    private String containerNumber;
    @Column(name = "FullOut")
    @Temporal(TemporalType.DATE)
    private Date fullOut;
    @Column(name = "EmptyIn")
    @Temporal(TemporalType.DATE)
    private Date emptyIn;
    @Column(name = "EmptyOut")
    @Temporal(TemporalType.DATE)
    private Date emptyOut;
    @Column(name = "FullIn")
    @Temporal(TemporalType.DATE)
    private Date fullIn;
    @Size(max = 50)
    @Column(name = "Comments")
    private String comments;

    public Containerinventory() {
    }

    public Containerinventory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public Date getFullOut() {
        return fullOut;
    }

    public void setFullOut(Date fullOut) {
        this.fullOut = fullOut;
    }

    public Date getEmptyIn() {
        return emptyIn;
    }

    public void setEmptyIn(Date emptyIn) {
        this.emptyIn = emptyIn;
    }

    public Date getEmptyOut() {
        return emptyOut;
    }

    public void setEmptyOut(Date emptyOut) {
        this.emptyOut = emptyOut;
    }

    public Date getFullIn() {
        return fullIn;
    }

    public void setFullIn(Date fullIn) {
        this.fullIn = fullIn;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Containerinventory)) {
            return false;
        }
        Containerinventory other = (Containerinventory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Containerinventory[ id=" + id + " ]";
    }
    
}
