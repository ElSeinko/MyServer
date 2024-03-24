package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fmvorbefund", schema = "public")
public class EntityFmvorbefund {
    @SequenceGenerator(name = "seqvorbefund", sequenceName = "seqvorbefund", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqvorbefund")
    @Id
    @Column(name = "fmvorbefundid")
    private int fmvorbefundid;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "objekt")
    private String objekt;
    @Basic
    @Column(name = "rauchfangbauart")
    private String rauchfangbauart;
    @Basic
    @Column(name = "fanghoehem")
    private Integer fanghoehem;
    @Basic
    @Column(name = "fanghoehecm")
    private Integer fanghoehecm;
    @Basic
    @Column(name = "fanglaenge")
    private Double fanglaenge;
    @Basic
    @Column(name = "betriebsdich")
    private Boolean betriebsdich;
    @Basic
    @Column(name = "fangaufsatz")
    private Boolean fangaufsatz;
    @Basic
    @Column(name = "fangbauart2")
    private String fangbauart2;
    @Basic
    @Column(name = "hoeheanschlussstelle")
    private Double hoeheanschlussstelle;
    @Basic
    @Column(name = "angeschlossenefeu")
    private Boolean angeschlossenefeu;
    @Basic
    @Column(name = "verlegtesver")
    private Boolean verlegtesver;
    @Basic
    @Column(name = "reinigungsoeffnungerf")
    private Boolean reinigungsoeffnungerf;
    @Basic
    @Column(name = "artderfeu")
    private Boolean artderfeu;
    @Basic
    @Column(name = "anf1")
    private String anf1;
    @Basic
    @Column(name = "anf2")
    private String anf2;
    @Basic
    @Column(name = "anf3")
    private String anf3;
    @Basic
    @Column(name = "anf4")
    private String anf4;
    @Basic
    @Column(name = "hoeheanschlussstellebool")
    private Boolean hoeheanschlussstellebool;
    @Basic
    @Column(name = "imgsignature")
    private byte[] imgsignature;

    public byte[] getImgsignature() {
        return imgsignature;
    }

    public void setImgsignature(byte[] imgsignature) {
        this.imgsignature = imgsignature;
    }

    public int getFmvorbefundid() {
        return fmvorbefundid;
    }

    public void setFmvorbefundid(int fmvorbefundid) {
        this.fmvorbefundid = fmvorbefundid;
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

    public String getRauchfangbauart() {
        return rauchfangbauart;
    }

    public void setRauchfangbauart(String rauchfangbauart) {
        this.rauchfangbauart = rauchfangbauart;
    }

    public Integer getFanghoehem() {
        return fanghoehem;
    }

    public void setFanghoehem(Integer fanghoehem) {
        this.fanghoehem = fanghoehem;
    }

    public Integer getFanghoehecm() {
        return fanghoehecm;
    }

    public void setFanghoehecm(Integer fanghoehecm) {
        this.fanghoehecm = fanghoehecm;
    }

    public Double getFanglaenge() {
        return fanglaenge;
    }

    public void setFanglaenge(Double fanglaenge) {
        this.fanglaenge = fanglaenge;
    }

    public Boolean getBetriebsdich() {
        return betriebsdich;
    }

    public void setBetriebsdich(Boolean betriebsdich) {
        this.betriebsdich = betriebsdich;
    }

    public Boolean getFangaufsatz() {
        return fangaufsatz;
    }

    public void setFangaufsatz(Boolean fangaufsatz) {
        this.fangaufsatz = fangaufsatz;
    }

    public String getFangbauart2() {
        return fangbauart2;
    }

    public void setFangbauart2(String fangbauart2) {
        this.fangbauart2 = fangbauart2;
    }

    public Double getHoeheanschlussstelle() {
        return hoeheanschlussstelle;
    }

    public void setHoeheanschlussstelle(Double hoeheanschlussstelle) {
        this.hoeheanschlussstelle = hoeheanschlussstelle;
    }

    public Boolean getAngeschlossenefeu() {
        return angeschlossenefeu;
    }

    public void setAngeschlossenefeu(Boolean angeschlossenefeu) {
        this.angeschlossenefeu = angeschlossenefeu;
    }

    public Boolean getVerlegtesver() {
        return verlegtesver;
    }

    public void setVerlegtesver(Boolean verlegtesver) {
        this.verlegtesver = verlegtesver;
    }

    public Boolean getReinigungsoeffnungerf() {
        return reinigungsoeffnungerf;
    }

    public void setReinigungsoeffnungerf(Boolean reinigungsoeffnungerf) {
        this.reinigungsoeffnungerf = reinigungsoeffnungerf;
    }

    public Boolean getArtderfeu() {
        return artderfeu;
    }

    public void setArtderfeu(Boolean artderfeu) {
        this.artderfeu = artderfeu;
    }

    public String getAnf1() {
        return anf1;
    }

    public void setAnf1(String anf1) {
        this.anf1 = anf1;
    }

    public String getAnf2() {
        return anf2;
    }

    public void setAnf2(String anf2) {
        this.anf2 = anf2;
    }

    public String getAnf3() {
        return anf3;
    }

    public void setAnf3(String anf3) {
        this.anf3 = anf3;
    }

    public String getAnf4() {
        return anf4;
    }

    public void setAnf4(String anf4) {
        this.anf4 = anf4;
    }

    public Boolean getHoeheanschlussstellebool() {
        return hoeheanschlussstellebool;
    }

    public void setHoeheanschlussstellebool(Boolean hoeheanschlussstellebool) {
        this.hoeheanschlussstellebool = hoeheanschlussstellebool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFmvorbefund that = (EntityFmvorbefund) o;

        if (fmvorbefundid != that.fmvorbefundid) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (objekt != null ? !objekt.equals(that.objekt) : that.objekt != null) return false;
        if (rauchfangbauart != null ? !rauchfangbauart.equals(that.rauchfangbauart) : that.rauchfangbauart != null)
            return false;
        if (fanghoehem != null ? !fanghoehem.equals(that.fanghoehem) : that.fanghoehem != null) return false;
        if (fanghoehecm != null ? !fanghoehecm.equals(that.fanghoehecm) : that.fanghoehecm != null) return false;
        if (fanglaenge != null ? !fanglaenge.equals(that.fanglaenge) : that.fanglaenge != null) return false;
        if (betriebsdich != null ? !betriebsdich.equals(that.betriebsdich) : that.betriebsdich != null) return false;
        if (fangaufsatz != null ? !fangaufsatz.equals(that.fangaufsatz) : that.fangaufsatz != null) return false;
        if (fangbauart2 != null ? !fangbauart2.equals(that.fangbauart2) : that.fangbauart2 != null) return false;
        if (hoeheanschlussstelle != null ? !hoeheanschlussstelle.equals(that.hoeheanschlussstelle) : that.hoeheanschlussstelle != null)
            return false;
        if (angeschlossenefeu != null ? !angeschlossenefeu.equals(that.angeschlossenefeu) : that.angeschlossenefeu != null)
            return false;
        if (verlegtesver != null ? !verlegtesver.equals(that.verlegtesver) : that.verlegtesver != null) return false;
        if (reinigungsoeffnungerf != null ? !reinigungsoeffnungerf.equals(that.reinigungsoeffnungerf) : that.reinigungsoeffnungerf != null)
            return false;
        if (artderfeu != null ? !artderfeu.equals(that.artderfeu) : that.artderfeu != null) return false;
        if (anf1 != null ? !anf1.equals(that.anf1) : that.anf1 != null) return false;
        if (anf2 != null ? !anf2.equals(that.anf2) : that.anf2 != null) return false;
        if (anf3 != null ? !anf3.equals(that.anf3) : that.anf3 != null) return false;
        if (anf4 != null ? !anf4.equals(that.anf4) : that.anf4 != null) return false;
        if (hoeheanschlussstellebool != null ? !hoeheanschlussstellebool.equals(that.hoeheanschlussstellebool) : that.hoeheanschlussstellebool != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmvorbefundid;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (objekt != null ? objekt.hashCode() : 0);
        result = 31 * result + (rauchfangbauart != null ? rauchfangbauart.hashCode() : 0);
        result = 31 * result + (fanghoehem != null ? fanghoehem.hashCode() : 0);
        result = 31 * result + (fanghoehecm != null ? fanghoehecm.hashCode() : 0);
        result = 31 * result + (fanglaenge != null ? fanglaenge.hashCode() : 0);
        result = 31 * result + (betriebsdich != null ? betriebsdich.hashCode() : 0);
        result = 31 * result + (fangaufsatz != null ? fangaufsatz.hashCode() : 0);
        result = 31 * result + (fangbauart2 != null ? fangbauart2.hashCode() : 0);
        result = 31 * result + (hoeheanschlussstelle != null ? hoeheanschlussstelle.hashCode() : 0);
        result = 31 * result + (angeschlossenefeu != null ? angeschlossenefeu.hashCode() : 0);
        result = 31 * result + (verlegtesver != null ? verlegtesver.hashCode() : 0);
        result = 31 * result + (reinigungsoeffnungerf != null ? reinigungsoeffnungerf.hashCode() : 0);
        result = 31 * result + (artderfeu != null ? artderfeu.hashCode() : 0);
        result = 31 * result + (anf1 != null ? anf1.hashCode() : 0);
        result = 31 * result + (anf2 != null ? anf2.hashCode() : 0);
        result = 31 * result + (anf3 != null ? anf3.hashCode() : 0);
        result = 31 * result + (anf4 != null ? anf4.hashCode() : 0);
        result = 31 * result + (hoeheanschlussstellebool != null ? hoeheanschlussstellebool.hashCode() : 0);
        return result;
    }
}
