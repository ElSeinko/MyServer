package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "feuverzul", schema = "public")
public class EntityFeuverzul {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "feuverzulid")
    private int feuverzulid;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "brennstoff")
    private String brennstoff;
    @Basic
    @Column(name = "raum")
    private String raum;
    @Basic
    @Column(name = "kw")
    private Double kw;
    @Basic
    @Column(name = "zunr")
    private String zunr;
    @Basic
    @Column(name = "maengel")
    private String maengel;

    public int getFeuverzulid() {
        return feuverzulid;
    }

    public void setFeuverzulid(int feuverzulid) {
        this.feuverzulid = feuverzulid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrennstoff() {
        return brennstoff;
    }

    public void setBrennstoff(String brennstoff) {
        this.brennstoff = brennstoff;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    public Double getKw() {
        return kw;
    }

    public void setKw(Double kw) {
        this.kw = kw;
    }

    public String getZunr() {
        return zunr;
    }

    public void setZunr(String zunr) {
        this.zunr = zunr;
    }

    public String getMaengel() {
        return maengel;
    }

    public void setMaengel(String maengel) {
        this.maengel = maengel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFeuverzul that = (EntityFeuverzul) o;

        if (feuverzulid != that.feuverzulid) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (brennstoff != null ? !brennstoff.equals(that.brennstoff) : that.brennstoff != null) return false;
        if (raum != null ? !raum.equals(that.raum) : that.raum != null) return false;
        if (kw != null ? !kw.equals(that.kw) : that.kw != null) return false;
        if (zunr != null ? !zunr.equals(that.zunr) : that.zunr != null) return false;
        if (maengel != null ? !maengel.equals(that.maengel) : that.maengel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feuverzulid;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (brennstoff != null ? brennstoff.hashCode() : 0);
        result = 31 * result + (raum != null ? raum.hashCode() : 0);
        result = 31 * result + (kw != null ? kw.hashCode() : 0);
        result = 31 * result + (zunr != null ? zunr.hashCode() : 0);
        result = 31 * result + (maengel != null ? maengel.hashCode() : 0);
        return result;
    }
}
