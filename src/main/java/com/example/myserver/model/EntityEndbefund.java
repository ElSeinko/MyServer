package com.example.myserver.model;

import jakarta.ejb.Local;
import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "endbefund", schema = "public")
public class EntityEndbefund {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "bauausfuehrender")
    private String bauausfuehrender;
    @Basic
    @Column(name = "bauwerber")
    private String bauwerber;
    @Basic
    @Column(name = "befundnr")
    private Integer befundnr;
    @Basic
    @Column(name = "im_objekt")
    private String imObjekt;
    @Basic
    @Column(name = "id_kunde")
    private Integer idKunde;
    @Basic
    @Column(name = "roa_durchmesser_lichte_weite")
    private Double roaDurchmesserLichteWeite;
    @Basic
    @Column(name = "roa_material")
    private String roaMaterial;
    @Basic
    @Column(name = "roa_laenge")
    private Double roaLaenge;
    @Basic
    @Column(name = "roa_sohlengeschoss")
    private Integer roaSohlengeschoss;
    @Basic
    @Column(name = "roa_zugaenglichkeit")
    private String roaZugaenglichkeit;
    @Basic
    @Column(name = "vs_durchmesser_lichte_weite")
    private Double vsDurchmesserLichteWeite;
    @Basic
    @Column(name = "vs_material")
    private String vsMaterial;
    @Basic
    @Column(name = "vs_waaglaenge")
    private Double vsWaaglaenge;
    @Basic
    @Column(name = "vs_isoliert")
    private String vsIsoliert;
    @Basic
    @Column(name = "vs_anschlusshoehe")
    private Double vsAnschlusshoehe;
    @Basic
    @Column(name = "vs_senklaenge")
    private Double vsSenklaenge;
    @Basic
    @Column(name = "af_type")
    private String afType;
    @Basic
    @Column(name = "af_leistung")
    private Double afLeistung;
    @Basic
    @Column(name = "af_aufstellungsraum")
    private String afAufstellungsraum;
    @Basic
    @Column(name = "af_brennstoff")
    private String afBrennstoff;
    @Basic
    @Column(name = "af_baujahr")
    private Integer afBaujahr;
    @Basic
    @Column(name = "af_auftellungsjahr")
    private Integer afAuftellungsjahr;
    @Basic
    @Column(name = "pruefdatum")
    private LocalDate pruefdatum;
    @Basic
    @Column(name = "id_auftrag")
    private Integer idAuftrag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBauausfuehrender() {
        return bauausfuehrender;
    }

    public void setBauausfuehrender(String bauausfuehrender) {
        this.bauausfuehrender = bauausfuehrender;
    }

    public String getBauwerber() {
        return bauwerber;
    }

    public void setBauwerber(String bauwerber) {
        this.bauwerber = bauwerber;
    }

    public Integer getBefundnr() {
        return befundnr;
    }

    public void setBefundnr(Integer befundnr) {
        this.befundnr = befundnr;
    }

    public String getImObjekt() {
        return imObjekt;
    }

    public void setImObjekt(String imObjekt) {
        this.imObjekt = imObjekt;
    }

    public Integer getIdKunde() {
        return idKunde;
    }

    public void setIdKunde(Integer idKunde) {
        this.idKunde = idKunde;
    }

    public Double getRoaDurchmesserLichteWeite() {
        return roaDurchmesserLichteWeite;
    }

    public void setRoaDurchmesserLichteWeite(Double roaDurchmesserLichteWeite) {
        this.roaDurchmesserLichteWeite = roaDurchmesserLichteWeite;
    }

    public String getRoaMaterial() {
        return roaMaterial;
    }

    public void setRoaMaterial(String roaMaterial) {
        this.roaMaterial = roaMaterial;
    }

    public Double getRoaLaenge() {
        return roaLaenge;
    }

    public void setRoaLaenge(Double roaLaenge) {
        this.roaLaenge = roaLaenge;
    }

    public Integer getRoaSohlengeschoss() {
        return roaSohlengeschoss;
    }

    public void setRoaSohlengeschoss(Integer roaSohlengeschoss) {
        this.roaSohlengeschoss = roaSohlengeschoss;
    }

    public String getRoaZugaenglichkeit() {
        return roaZugaenglichkeit;
    }

    public void setRoaZugaenglichkeit(String roaZugaenglichkeit) {
        this.roaZugaenglichkeit = roaZugaenglichkeit;
    }

    public Double getVsDurchmesserLichteWeite() {
        return vsDurchmesserLichteWeite;
    }

    public void setVsDurchmesserLichteWeite(Double vsDurchmesserLichteWeite) {
        this.vsDurchmesserLichteWeite = vsDurchmesserLichteWeite;
    }

    public String getVsMaterial() {
        return vsMaterial;
    }

    public void setVsMaterial(String vsMaterial) {
        this.vsMaterial = vsMaterial;
    }

    public Double getVsWaaglaenge() {
        return vsWaaglaenge;
    }

    public void setVsWaaglaenge(Double vsWaaglaenge) {
        this.vsWaaglaenge = vsWaaglaenge;
    }

    public String getVsIsoliert() {
        return vsIsoliert;
    }

    public void setVsIsoliert(String vsIsoliert) {
        this.vsIsoliert = vsIsoliert;
    }

    public Double getVsAnschlusshoehe() {
        return vsAnschlusshoehe;
    }

    public void setVsAnschlusshoehe(Double vsAnschlusshoehe) {
        this.vsAnschlusshoehe = vsAnschlusshoehe;
    }

    public Double getVsSenklaenge() {
        return vsSenklaenge;
    }

    public void setVsSenklaenge(Double vsSenklaenge) {
        this.vsSenklaenge = vsSenklaenge;
    }

    public String getAfType() {
        return afType;
    }

    public void setAfType(String afType) {
        this.afType = afType;
    }

    public Double getAfLeistung() {
        return afLeistung;
    }

    public void setAfLeistung(Double afLeistung) {
        this.afLeistung = afLeistung;
    }

    public String getAfAufstellungsraum() {
        return afAufstellungsraum;
    }

    public void setAfAufstellungsraum(String afAufstellungsraum) {
        this.afAufstellungsraum = afAufstellungsraum;
    }

    public String getAfBrennstoff() {
        return afBrennstoff;
    }

    public void setAfBrennstoff(String afBrennstoff) {
        this.afBrennstoff = afBrennstoff;
    }

    public Integer getAfBaujahr() {
        return afBaujahr;
    }

    public void setAfBaujahr(Integer afBaujahr) {
        this.afBaujahr = afBaujahr;
    }

    public Integer getAfAuftellungsjahr() {
        return afAuftellungsjahr;
    }

    public void setAfAuftellungsjahr(Integer afAuftellungsjahr) {
        this.afAuftellungsjahr = afAuftellungsjahr;
    }

    public LocalDate getPruefdatum() {
        return pruefdatum;
    }

    public void setPruefdatum(LocalDate pruefdatum) {
        this.pruefdatum = pruefdatum;
    }

    public Integer getIdAuftrag() {
        return idAuftrag;
    }

    public void setIdAuftrag(Integer idAuftrag) {
        this.idAuftrag = idAuftrag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityEndbefund that = (EntityEndbefund) o;

        if (id != that.id) return false;
        if (bauausfuehrender != null ? !bauausfuehrender.equals(that.bauausfuehrender) : that.bauausfuehrender != null)
            return false;
        if (bauwerber != null ? !bauwerber.equals(that.bauwerber) : that.bauwerber != null) return false;
        if (befundnr != null ? !befundnr.equals(that.befundnr) : that.befundnr != null) return false;
        if (imObjekt != null ? !imObjekt.equals(that.imObjekt) : that.imObjekt != null) return false;
        if (idKunde != null ? !idKunde.equals(that.idKunde) : that.idKunde != null) return false;
        if (roaDurchmesserLichteWeite != null ? !roaDurchmesserLichteWeite.equals(that.roaDurchmesserLichteWeite) : that.roaDurchmesserLichteWeite != null)
            return false;
        if (roaMaterial != null ? !roaMaterial.equals(that.roaMaterial) : that.roaMaterial != null) return false;
        if (roaLaenge != null ? !roaLaenge.equals(that.roaLaenge) : that.roaLaenge != null) return false;
        if (roaSohlengeschoss != null ? !roaSohlengeschoss.equals(that.roaSohlengeschoss) : that.roaSohlengeschoss != null)
            return false;
        if (roaZugaenglichkeit != null ? !roaZugaenglichkeit.equals(that.roaZugaenglichkeit) : that.roaZugaenglichkeit != null)
            return false;
        if (vsDurchmesserLichteWeite != null ? !vsDurchmesserLichteWeite.equals(that.vsDurchmesserLichteWeite) : that.vsDurchmesserLichteWeite != null)
            return false;
        if (vsMaterial != null ? !vsMaterial.equals(that.vsMaterial) : that.vsMaterial != null) return false;
        if (vsWaaglaenge != null ? !vsWaaglaenge.equals(that.vsWaaglaenge) : that.vsWaaglaenge != null) return false;
        if (vsIsoliert != null ? !vsIsoliert.equals(that.vsIsoliert) : that.vsIsoliert != null) return false;
        if (vsAnschlusshoehe != null ? !vsAnschlusshoehe.equals(that.vsAnschlusshoehe) : that.vsAnschlusshoehe != null)
            return false;
        if (vsSenklaenge != null ? !vsSenklaenge.equals(that.vsSenklaenge) : that.vsSenklaenge != null) return false;
        if (afType != null ? !afType.equals(that.afType) : that.afType != null) return false;
        if (afLeistung != null ? !afLeistung.equals(that.afLeistung) : that.afLeistung != null) return false;
        if (afAufstellungsraum != null ? !afAufstellungsraum.equals(that.afAufstellungsraum) : that.afAufstellungsraum != null)
            return false;
        if (afBrennstoff != null ? !afBrennstoff.equals(that.afBrennstoff) : that.afBrennstoff != null) return false;
        if (afBaujahr != null ? !afBaujahr.equals(that.afBaujahr) : that.afBaujahr != null) return false;
        if (afAuftellungsjahr != null ? !afAuftellungsjahr.equals(that.afAuftellungsjahr) : that.afAuftellungsjahr != null)
            return false;
        if (pruefdatum != null ? !pruefdatum.equals(that.pruefdatum) : that.pruefdatum != null) return false;
        if (idAuftrag != null ? !idAuftrag.equals(that.idAuftrag) : that.idAuftrag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bauausfuehrender != null ? bauausfuehrender.hashCode() : 0);
        result = 31 * result + (bauwerber != null ? bauwerber.hashCode() : 0);
        result = 31 * result + (befundnr != null ? befundnr.hashCode() : 0);
        result = 31 * result + (imObjekt != null ? imObjekt.hashCode() : 0);
        result = 31 * result + (idKunde != null ? idKunde.hashCode() : 0);
        result = 31 * result + (roaDurchmesserLichteWeite != null ? roaDurchmesserLichteWeite.hashCode() : 0);
        result = 31 * result + (roaMaterial != null ? roaMaterial.hashCode() : 0);
        result = 31 * result + (roaLaenge != null ? roaLaenge.hashCode() : 0);
        result = 31 * result + (roaSohlengeschoss != null ? roaSohlengeschoss.hashCode() : 0);
        result = 31 * result + (roaZugaenglichkeit != null ? roaZugaenglichkeit.hashCode() : 0);
        result = 31 * result + (vsDurchmesserLichteWeite != null ? vsDurchmesserLichteWeite.hashCode() : 0);
        result = 31 * result + (vsMaterial != null ? vsMaterial.hashCode() : 0);
        result = 31 * result + (vsWaaglaenge != null ? vsWaaglaenge.hashCode() : 0);
        result = 31 * result + (vsIsoliert != null ? vsIsoliert.hashCode() : 0);
        result = 31 * result + (vsAnschlusshoehe != null ? vsAnschlusshoehe.hashCode() : 0);
        result = 31 * result + (vsSenklaenge != null ? vsSenklaenge.hashCode() : 0);
        result = 31 * result + (afType != null ? afType.hashCode() : 0);
        result = 31 * result + (afLeistung != null ? afLeistung.hashCode() : 0);
        result = 31 * result + (afAufstellungsraum != null ? afAufstellungsraum.hashCode() : 0);
        result = 31 * result + (afBrennstoff != null ? afBrennstoff.hashCode() : 0);
        result = 31 * result + (afBaujahr != null ? afBaujahr.hashCode() : 0);
        result = 31 * result + (afAuftellungsjahr != null ? afAuftellungsjahr.hashCode() : 0);
        result = 31 * result + (pruefdatum != null ? pruefdatum.hashCode() : 0);
        result = 31 * result + (idAuftrag != null ? idAuftrag.hashCode() : 0);
        return result;
    }
}
