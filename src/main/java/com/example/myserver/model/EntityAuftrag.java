package com.example.myserver.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "auftrag", schema = "public")
public class EntityAuftrag {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "auftragid")
    private int auftragid;
    @Basic
    @Column(name = "kundeid")
    private Integer kundeid;
    @Basic
    @Column(name = "formular")
    private String formular;
    @Basic
    @Column(name = "postleitzahl")
    private Integer postleitzahl;
    @Basic
    @Column(name = "ort")
    private String ort;
    @Basic
    @Column(name = "strasse")
    private String strasse;
    @Basic
    @Column(name = "hausnummer")
    private Integer hausnummer;
    @Basic
    @Column(name = "tuer")
    private Integer tuer;
    @Basic
    @Column(name = "telnummer")
    private Integer telnummer;
    @Basic
    @Column(name = "datum")
    private Date datum;
    @Basic
    @Column(name = "anmerkung")
    private String anmerkung;

    public int getAuftragid() {
        return auftragid;
    }

    public void setAuftragid(int auftragid) {
        this.auftragid = auftragid;
    }

    public Integer getKundeid() {
        return kundeid;
    }

    public void setKundeid(Integer kundeid) {
        this.kundeid = kundeid;
    }

    public String getFormular() {
        return formular;
    }

    public void setFormular(String formular) {
        this.formular = formular;
    }

    public Integer getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(Integer postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public Integer getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(Integer hausnummer) {
        this.hausnummer = hausnummer;
    }

    public Integer getTuer() {
        return tuer;
    }

    public void setTuer(Integer tuer) {
        this.tuer = tuer;
    }

    public Integer getTelnummer() {
        return telnummer;
    }

    public void setTelnummer(Integer telnummer) {
        this.telnummer = telnummer;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getAnmerkung() {
        return anmerkung;
    }

    public void setAnmerkung(String anmerkung) {
        this.anmerkung = anmerkung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityAuftrag that = (EntityAuftrag) o;

        if (auftragid != that.auftragid) return false;
        if (kundeid != null ? !kundeid.equals(that.kundeid) : that.kundeid != null) return false;
        if (formular != null ? !formular.equals(that.formular) : that.formular != null) return false;
        if (postleitzahl != null ? !postleitzahl.equals(that.postleitzahl) : that.postleitzahl != null) return false;
        if (ort != null ? !ort.equals(that.ort) : that.ort != null) return false;
        if (strasse != null ? !strasse.equals(that.strasse) : that.strasse != null) return false;
        if (hausnummer != null ? !hausnummer.equals(that.hausnummer) : that.hausnummer != null) return false;
        if (tuer != null ? !tuer.equals(that.tuer) : that.tuer != null) return false;
        if (telnummer != null ? !telnummer.equals(that.telnummer) : that.telnummer != null) return false;
        if (datum != null ? !datum.equals(that.datum) : that.datum != null) return false;
        if (anmerkung != null ? !anmerkung.equals(that.anmerkung) : that.anmerkung != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = auftragid;
        result = 31 * result + (kundeid != null ? kundeid.hashCode() : 0);
        result = 31 * result + (formular != null ? formular.hashCode() : 0);
        result = 31 * result + (postleitzahl != null ? postleitzahl.hashCode() : 0);
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        result = 31 * result + (strasse != null ? strasse.hashCode() : 0);
        result = 31 * result + (hausnummer != null ? hausnummer.hashCode() : 0);
        result = 31 * result + (tuer != null ? tuer.hashCode() : 0);
        result = 31 * result + (telnummer != null ? telnummer.hashCode() : 0);
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + (anmerkung != null ? anmerkung.hashCode() : 0);
        return result;
    }
}
