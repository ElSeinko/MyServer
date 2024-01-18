package com.example.myserver.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "fmkehrversgemeinde", schema = "public")
public class EntityFmkehrversgemeinde {
    @SequenceGenerator(name = "seqkehrverweigerung", sequenceName = "seqkehrverweigerung", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqkehrverweigerung")
    @Id
    @Column(name = "fmkehrversgemeindeid")
    private int fmkehrversgemeindeid;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "gemeindeamt")
    private String gemeindeamt;
    @Basic
    @Column(name = "bauabteilung")
    private String bauabteilung;
    @Basic
    @Column(name = "datum")
    private Date datum;
    @Basic
    @Column(name = "objekt")
    private String objekt;
    @Basic
    @Column(name = "benutzung")
    private String benutzung;
    @Basic
    @Column(name = "letzekehrung")
    private Date letzekehrung;

    public int getFmkehrversgemeindeid() {
        return fmkehrversgemeindeid;
    }

    public void setFmkehrversgemeindeid(int fmkehrversgemeindeid) {
        this.fmkehrversgemeindeid = fmkehrversgemeindeid;
    }

    public Integer getAuftragid() {
        return auftragid;
    }

    public void setAuftragid(Integer auftragid) {
        this.auftragid = auftragid;
    }

    public String getGemeindeamt() {
        return gemeindeamt;
    }

    public void setGemeindeamt(String gemeindeamt) {
        this.gemeindeamt = gemeindeamt;
    }

    public String getBauabteilung() {
        return bauabteilung;
    }

    public void setBauabteilung(String bauabteilung) {
        this.bauabteilung = bauabteilung;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getObjekt() {
        return objekt;
    }

    public void setObjekt(String objekt) {
        this.objekt = objekt;
    }

    public String getBenutzung() {
        return benutzung;
    }

    public void setBenutzung(String benutzung) {
        this.benutzung = benutzung;
    }

    public Date getLetzekehrung() {
        return letzekehrung;
    }

    public void setLetzekehrung(Date letzekehrung) {
        this.letzekehrung = letzekehrung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFmkehrversgemeinde that = (EntityFmkehrversgemeinde) o;

        if (fmkehrversgemeindeid != that.fmkehrversgemeindeid) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (gemeindeamt != null ? !gemeindeamt.equals(that.gemeindeamt) : that.gemeindeamt != null) return false;
        if (bauabteilung != null ? !bauabteilung.equals(that.bauabteilung) : that.bauabteilung != null) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (objekt != null ? !objekt.equals(that.objekt) : that.objekt != null) return false;
        if (benutzung != null ? !benutzung.equals(that.benutzung) : that.benutzung != null) return false;
        if (letzekehrung != null ? !letzekehrung.equals(that.letzekehrung) : that.letzekehrung != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmkehrversgemeindeid;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (gemeindeamt != null ? gemeindeamt.hashCode() : 0);
        result = 31 * result + (bauabteilung != null ? bauabteilung.hashCode() : 0);
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (objekt != null ? objekt.hashCode() : 0);
        result = 31 * result + (benutzung != null ? benutzung.hashCode() : 0);
        result = 31 * result + (letzekehrung != null ? letzekehrung.hashCode() : 0);
        return result;
    }
}
