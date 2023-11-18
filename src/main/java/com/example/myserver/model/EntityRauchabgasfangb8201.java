package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rauchabgasfangb8201", schema = "public")
public class EntityRauchabgasfangb8201 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "roaid")
    private int roaid;
    @Basic
    @Column(name = "nrbez")
    private String nrbez;
    @Basic
    @Column(name = "material")
    private String material;
    @Basic
    @Column(name = "querschnitt")
    private Double querschnitt;
    @Basic
    @Column(name = "hoehe")
    private Double hoehe;
    @Basic
    @Column(name = "maengel")
    private String maengel;
    @Basic
    @Column(name = "bewertung")
    private Boolean bewertung;

    public int getRoaid() {
        return roaid;
    }

    public void setRoaid(int roaid) {
        this.roaid = roaid;
    }

    public String getNrbez() {
        return nrbez;
    }

    public void setNrbez(String nrbez) {
        this.nrbez = nrbez;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getQuerschnitt() {
        return querschnitt;
    }

    public void setQuerschnitt(Double querschnitt) {
        this.querschnitt = querschnitt;
    }

    public Double getHoehe() {
        return hoehe;
    }

    public void setHoehe(Double hoehe) {
        this.hoehe = hoehe;
    }

    public String getMaengel() {
        return maengel;
    }

    public void setMaengel(String maengel) {
        this.maengel = maengel;
    }

    public Boolean getBewertung() {
        return bewertung;
    }

    public void setBewertung(Boolean bewertung) {
        this.bewertung = bewertung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityRauchabgasfangb8201 that = (EntityRauchabgasfangb8201) o;

        if (roaid != that.roaid) return false;
        if (nrbez != null ? !nrbez.equals(that.nrbez) : that.nrbez != null) return false;
        if (material != null ? !material.equals(that.material) : that.material != null) return false;
        if (querschnitt != null ? !querschnitt.equals(that.querschnitt) : that.querschnitt != null) return false;
        if (hoehe != null ? !hoehe.equals(that.hoehe) : that.hoehe != null) return false;
        if (maengel != null ? !maengel.equals(that.maengel) : that.maengel != null) return false;
        if (bewertung != null ? !bewertung.equals(that.bewertung) : that.bewertung != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roaid;
        result = 31 * result + (nrbez != null ? nrbez.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (querschnitt != null ? querschnitt.hashCode() : 0);
        result = 31 * result + (hoehe != null ? hoehe.hashCode() : 0);
        result = 31 * result + (maengel != null ? maengel.hashCode() : 0);
        result = 31 * result + (bewertung != null ? bewertung.hashCode() : 0);
        return result;
    }
}
