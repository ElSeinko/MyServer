package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "miausammlung", schema = "public")
public class EntityMiausammlung {
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "mitarbeiterid")
    private Integer mitarbeiterid;
    @Id
    private Integer id;

    public Integer getAuftragid() {
        return auftragid;
    }

    public void setAuftragid(Integer auftragid) {
        this.auftragid = auftragid;
    }

    public Integer getMitarbeiterid() {
        return mitarbeiterid;
    }

    public void setMitarbeiterid(Integer mitarbeiterid) {
        this.mitarbeiterid = mitarbeiterid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityMiausammlung that = (EntityMiausammlung) o;

        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (mitarbeiterid != null ? !mitarbeiterid.equals(that.mitarbeiterid) : that.mitarbeiterid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = auftragid != null ? auftragid.hashCode() : 0;
        result = 31 * result + (mitarbeiterid != null ? mitarbeiterid.hashCode() : 0);
        return result;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
