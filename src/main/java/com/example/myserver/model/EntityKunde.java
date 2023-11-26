package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "kunde", schema = "public")
public class EntityKunde {
    @Id
    @Column(name = "kundeid")
    private int kundeid;
    @Basic
    @Column(name = "vorname")
    private String vorname;
    @Basic
    @Column(name = "nachname")
    private String nachname;
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

    public int getKundeid() {
        return kundeid;
    }

    public void setKundeid(int kundeid) {
        this.kundeid = kundeid;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityKunde that = (EntityKunde) o;

        if (kundeid != that.kundeid) return false;
        if (vorname != null ? !vorname.equals(that.vorname) : that.vorname != null) return false;
        if (nachname != null ? !nachname.equals(that.nachname) : that.nachname != null) return false;
        if (postleitzahl != null ? !postleitzahl.equals(that.postleitzahl) : that.postleitzahl != null) return false;
        if (ort != null ? !ort.equals(that.ort) : that.ort != null) return false;
        if (strasse != null ? !strasse.equals(that.strasse) : that.strasse != null) return false;
        if (hausnummer != null ? !hausnummer.equals(that.hausnummer) : that.hausnummer != null) return false;
        if (tuer != null ? !tuer.equals(that.tuer) : that.tuer != null) return false;
        if (telnummer != null ? !telnummer.equals(that.telnummer) : that.telnummer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kundeid;
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (nachname != null ? nachname.hashCode() : 0);
        result = 31 * result + (postleitzahl != null ? postleitzahl.hashCode() : 0);
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        result = 31 * result + (strasse != null ? strasse.hashCode() : 0);
        result = 31 * result + (hausnummer != null ? hausnummer.hashCode() : 0);
        result = 31 * result + (tuer != null ? tuer.hashCode() : 0);
        result = 31 * result + (telnummer != null ? telnummer.hashCode() : 0);
        return result;
    }
}
