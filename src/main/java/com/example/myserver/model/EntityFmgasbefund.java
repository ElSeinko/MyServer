package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fmgasbefund", schema = "public")
public class EntityFmgasbefund {
    @Id
    @Column(name = "fmgasbefundid")
    private int fmgasbefundid;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "objekt")
    private String objekt;
    @Basic
    @Column(name = "eigentuemer")
    private String eigentuemer;
    @Basic
    @Column(name = "benutzer")
    private String benutzer;
    @Basic
    @Column(name = "installateur")
    private String installateur;
    @Basic
    @Column(name = "gasfangbaustoff")
    private String gasfangbaustoff;
    @Basic
    @Column(name = "querschnitt")
    private Double querschnitt;
    @Basic
    @Column(name = "hoefanges")
    private Double hoefanges;
    @Basic
    @Column(name = "wirksfanghoehe")
    private Double wirksfanghoehe;
    @Basic
    @Column(name = "angeschlossenefeuerstaettetyp")
    private String angeschlossenefeuerstaettetyp;
    @Basic
    @Column(name = "leistung")
    private String leistung;
    @Basic
    @Column(name = "baujahr")
    private Integer baujahr;
    @Basic
    @Column(name = "zuabluftfuehrung")
    private String zuabluftfuehrung;
    @Basic
    @Column(name = "aufstellungsgeschoss")
    private String aufstellungsgeschoss;
    @Basic
    @Column(name = "verbindungsstueckdurchmesser")
    private Double verbindungsstueckdurchmesser;
    @Basic
    @Column(name = "waagrechtelaenge")
    private Double waagrechtelaenge;
    @Basic
    @Column(name = "geschossfangsohle")
    private Integer geschossfangsohle;

    public int getFmgasbefundid() {
        return fmgasbefundid;
    }

    public void setFmgasbefundid(int fmgasbefundid) {
        this.fmgasbefundid = fmgasbefundid;
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

    public String getEigentuemer() {
        return eigentuemer;
    }

    public void setEigentuemer(String eigentuemer) {
        this.eigentuemer = eigentuemer;
    }

    public String getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(String benutzer) {
        this.benutzer = benutzer;
    }

    public String getInstallateur() {
        return installateur;
    }

    public void setInstallateur(String installateur) {
        this.installateur = installateur;
    }

    public String getGasfangbaustoff() {
        return gasfangbaustoff;
    }

    public void setGasfangbaustoff(String gasfangbaustoff) {
        this.gasfangbaustoff = gasfangbaustoff;
    }

    public Double getQuerschnitt() {
        return querschnitt;
    }

    public void setQuerschnitt(Double querschnitt) {
        this.querschnitt = querschnitt;
    }

    public Double getHoefanges() {
        return hoefanges;
    }

    public void setHoefanges(Double hoefanges) {
        this.hoefanges = hoefanges;
    }

    public Double getWirksfanghoehe() {
        return wirksfanghoehe;
    }

    public void setWirksfanghoehe(Double wirksfanghoehe) {
        this.wirksfanghoehe = wirksfanghoehe;
    }

    public String getAngeschlossenefeuerstaettetyp() {
        return angeschlossenefeuerstaettetyp;
    }

    public void setAngeschlossenefeuerstaettetyp(String angeschlossenefeuerstaettetyp) {
        this.angeschlossenefeuerstaettetyp = angeschlossenefeuerstaettetyp;
    }

    public String getLeistung() {
        return leistung;
    }

    public void setLeistung(String leistung) {
        this.leistung = leistung;
    }

    public Integer getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Integer baujahr) {
        this.baujahr = baujahr;
    }

    public String getZuabluftfuehrung() {
        return zuabluftfuehrung;
    }

    public void setZuabluftfuehrung(String zuabluftfuehrung) {
        this.zuabluftfuehrung = zuabluftfuehrung;
    }

    public String getAufstellungsgeschoss() {
        return aufstellungsgeschoss;
    }

    public void setAufstellungsgeschoss(String aufstellungsgeschoss) {
        this.aufstellungsgeschoss = aufstellungsgeschoss;
    }

    public Double getVerbindungsstueckdurchmesser() {
        return verbindungsstueckdurchmesser;
    }

    public void setVerbindungsstueckdurchmesser(Double verbindungsstueckdurchmesser) {
        this.verbindungsstueckdurchmesser = verbindungsstueckdurchmesser;
    }

    public Double getWaagrechtelaenge() {
        return waagrechtelaenge;
    }

    public void setWaagrechtelaenge(Double waagrechtelaenge) {
        this.waagrechtelaenge = waagrechtelaenge;
    }

    public Integer getGeschossfangsohle() {
        return geschossfangsohle;
    }

    public void setGeschossfangsohle(Integer geschossfangsohle) {
        this.geschossfangsohle = geschossfangsohle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFmgasbefund that = (EntityFmgasbefund) o;

        if (fmgasbefundid != that.fmgasbefundid) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (objekt != null ? !objekt.equals(that.objekt) : that.objekt != null) return false;
        if (eigentuemer != null ? !eigentuemer.equals(that.eigentuemer) : that.eigentuemer != null) return false;
        if (benutzer != null ? !benutzer.equals(that.benutzer) : that.benutzer != null) return false;
        if (installateur != null ? !installateur.equals(that.installateur) : that.installateur != null) return false;
        if (gasfangbaustoff != null ? !gasfangbaustoff.equals(that.gasfangbaustoff) : that.gasfangbaustoff != null)
            return false;
        if (querschnitt != null ? !querschnitt.equals(that.querschnitt) : that.querschnitt != null) return false;
        if (hoefanges != null ? !hoefanges.equals(that.hoefanges) : that.hoefanges != null) return false;
        if (wirksfanghoehe != null ? !wirksfanghoehe.equals(that.wirksfanghoehe) : that.wirksfanghoehe != null)
            return false;
        if (angeschlossenefeuerstaettetyp != null ? !angeschlossenefeuerstaettetyp.equals(that.angeschlossenefeuerstaettetyp) : that.angeschlossenefeuerstaettetyp != null)
            return false;
        if (leistung != null ? !leistung.equals(that.leistung) : that.leistung != null) return false;
        if (baujahr != null ? !baujahr.equals(that.baujahr) : that.baujahr != null) return false;
        if (zuabluftfuehrung != null ? !zuabluftfuehrung.equals(that.zuabluftfuehrung) : that.zuabluftfuehrung != null)
            return false;
        if (aufstellungsgeschoss != null ? !aufstellungsgeschoss.equals(that.aufstellungsgeschoss) : that.aufstellungsgeschoss != null)
            return false;
        if (verbindungsstueckdurchmesser != null ? !verbindungsstueckdurchmesser.equals(that.verbindungsstueckdurchmesser) : that.verbindungsstueckdurchmesser != null)
            return false;
        if (waagrechtelaenge != null ? !waagrechtelaenge.equals(that.waagrechtelaenge) : that.waagrechtelaenge != null)
            return false;
        if (geschossfangsohle != null ? !geschossfangsohle.equals(that.geschossfangsohle) : that.geschossfangsohle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmgasbefundid;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (objekt != null ? objekt.hashCode() : 0);
        result = 31 * result + (eigentuemer != null ? eigentuemer.hashCode() : 0);
        result = 31 * result + (benutzer != null ? benutzer.hashCode() : 0);
        result = 31 * result + (installateur != null ? installateur.hashCode() : 0);
        result = 31 * result + (gasfangbaustoff != null ? gasfangbaustoff.hashCode() : 0);
        result = 31 * result + (querschnitt != null ? querschnitt.hashCode() : 0);
        result = 31 * result + (hoefanges != null ? hoefanges.hashCode() : 0);
        result = 31 * result + (wirksfanghoehe != null ? wirksfanghoehe.hashCode() : 0);
        result = 31 * result + (angeschlossenefeuerstaettetyp != null ? angeschlossenefeuerstaettetyp.hashCode() : 0);
        result = 31 * result + (leistung != null ? leistung.hashCode() : 0);
        result = 31 * result + (baujahr != null ? baujahr.hashCode() : 0);
        result = 31 * result + (zuabluftfuehrung != null ? zuabluftfuehrung.hashCode() : 0);
        result = 31 * result + (aufstellungsgeschoss != null ? aufstellungsgeschoss.hashCode() : 0);
        result = 31 * result + (verbindungsstueckdurchmesser != null ? verbindungsstueckdurchmesser.hashCode() : 0);
        result = 31 * result + (waagrechtelaenge != null ? waagrechtelaenge.hashCode() : 0);
        result = 31 * result + (geschossfangsohle != null ? geschossfangsohle.hashCode() : 0);
        return result;
    }
}
