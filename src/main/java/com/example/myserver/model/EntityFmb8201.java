package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fmb8201", schema = "public")
public class EntityFmb8201 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "fmb8201id")
    private int fmb8201Id;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "objekt")
    private String objekt;
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
    @Column(name = "gemeinde")
    private String gemeinde;
    @Basic
    @Column(name = "telgemeinde")
    private String telgemeinde;
    @Basic
    @Column(name = "befundnummer")
    private Integer befundnummer;
    @Basic
    @Column(name = "tlc")
    private Double tlc;
    @Basic
    @Column(name = "tac")
    private Double tac;
    @Basic
    @Column(name = "rz")
    private Double rz;
    @Basic
    @Column(name = "co2")
    private Double co2;
    @Basic
    @Column(name = "comg")
    private Double comg;
    @Basic
    @Column(name = "eta")
    private Double eta;

    public int getFmb8201Id() {
        return fmb8201Id;
    }

    public void setFmb8201Id(int fmb8201Id) {
        this.fmb8201Id = fmb8201Id;
    }

    public Integer getAuftragid() {
        return auftragid;
    }

    public void setAuftragid(Integer auftragid) {
        this.auftragid = auftragid;
    }

    public String getObjekt() {
        return objekt;
    }

    public void setObjekt(String objekt) {
        this.objekt = objekt;
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

    public String getGemeinde() {
        return gemeinde;
    }

    public void setGemeinde(String gemeinde) {
        this.gemeinde = gemeinde;
    }

    public String getTelgemeinde() {
        return telgemeinde;
    }

    public void setTelgemeinde(String telgemeinde) {
        this.telgemeinde = telgemeinde;
    }

    public Integer getBefundnummer() {
        return befundnummer;
    }

    public void setBefundnummer(Integer befundnummer) {
        this.befundnummer = befundnummer;
    }

    public Double getTlc() {
        return tlc;
    }

    public void setTlc(Double tlc) {
        this.tlc = tlc;
    }

    public Double getTac() {
        return tac;
    }

    public void setTac(Double tac) {
        this.tac = tac;
    }

    public Double getRz() {
        return rz;
    }

    public void setRz(Double rz) {
        this.rz = rz;
    }

    public Double getCo2() {
        return co2;
    }

    public void setCo2(Double co2) {
        this.co2 = co2;
    }

    public Double getComg() {
        return comg;
    }

    public void setComg(Double comg) {
        this.comg = comg;
    }

    public Double getEta() {
        return eta;
    }

    public void setEta(Double eta) {
        this.eta = eta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFmb8201 that = (EntityFmb8201) o;

        if (fmb8201Id != that.fmb8201Id) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (objekt != null ? !objekt.equals(that.objekt) : that.objekt != null) return false;
        if (postleitzahl != null ? !postleitzahl.equals(that.postleitzahl) : that.postleitzahl != null) return false;
        if (ort != null ? !ort.equals(that.ort) : that.ort != null) return false;
        if (strasse != null ? !strasse.equals(that.strasse) : that.strasse != null) return false;
        if (hausnummer != null ? !hausnummer.equals(that.hausnummer) : that.hausnummer != null) return false;
        if (tuer != null ? !tuer.equals(that.tuer) : that.tuer != null) return false;
        if (gemeinde != null ? !gemeinde.equals(that.gemeinde) : that.gemeinde != null) return false;
        if (telgemeinde != null ? !telgemeinde.equals(that.telgemeinde) : that.telgemeinde != null) return false;
        if (befundnummer != null ? !befundnummer.equals(that.befundnummer) : that.befundnummer != null) return false;
        if (tlc != null ? !tlc.equals(that.tlc) : that.tlc != null) return false;
        if (tac != null ? !tac.equals(that.tac) : that.tac != null) return false;
        if (rz != null ? !rz.equals(that.rz) : that.rz != null) return false;
        if (co2 != null ? !co2.equals(that.co2) : that.co2 != null) return false;
        if (comg != null ? !comg.equals(that.comg) : that.comg != null) return false;
        if (eta != null ? !eta.equals(that.eta) : that.eta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmb8201Id;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (objekt != null ? objekt.hashCode() : 0);
        result = 31 * result + (postleitzahl != null ? postleitzahl.hashCode() : 0);
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        result = 31 * result + (strasse != null ? strasse.hashCode() : 0);
        result = 31 * result + (hausnummer != null ? hausnummer.hashCode() : 0);
        result = 31 * result + (tuer != null ? tuer.hashCode() : 0);
        result = 31 * result + (gemeinde != null ? gemeinde.hashCode() : 0);
        result = 31 * result + (telgemeinde != null ? telgemeinde.hashCode() : 0);
        result = 31 * result + (befundnummer != null ? befundnummer.hashCode() : 0);
        result = 31 * result + (tlc != null ? tlc.hashCode() : 0);
        result = 31 * result + (tac != null ? tac.hashCode() : 0);
        result = 31 * result + (rz != null ? rz.hashCode() : 0);
        result = 31 * result + (co2 != null ? co2.hashCode() : 0);
        result = 31 * result + (comg != null ? comg.hashCode() : 0);
        result = 31 * result + (eta != null ? eta.hashCode() : 0);
        return result;
    }
}
