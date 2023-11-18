package com.example.myserver.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roab8201sammlung", schema = "public")
public class EntityRoab8201Sammlung {
    @Basic
    @Column(name = "fmb8201id")
    private Integer fmb8201Id;
    @Basic
    @Column(name = "roaid")
    private Integer roaid;

    public Integer getFmb8201Id() {
        return fmb8201Id;
    }

    public void setFmb8201Id(Integer fmb8201Id) {
        this.fmb8201Id = fmb8201Id;
    }

    public Integer getRoaid() {
        return roaid;
    }

    public void setRoaid(Integer roaid) {
        this.roaid = roaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityRoab8201Sammlung that = (EntityRoab8201Sammlung) o;

        if (fmb8201Id != null ? !fmb8201Id.equals(that.fmb8201Id) : that.fmb8201Id != null) return false;
        if (roaid != null ? !roaid.equals(that.roaid) : that.roaid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmb8201Id != null ? fmb8201Id.hashCode() : 0;
        result = 31 * result + (roaid != null ? roaid.hashCode() : 0);
        return result;
    }
}
