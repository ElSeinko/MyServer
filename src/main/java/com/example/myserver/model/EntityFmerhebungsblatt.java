package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fmerhebungsblatt", schema = "public")
public class EntityFmerhebungsblatt {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "fmerhebungsblattid")
    private int fmerhebungsblattid;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "wasseraufbereitung")
    private String wasseraufbereitung;
    @Basic
    @Column(name = "notschalter")
    private Boolean notschalter;
    @Basic
    @Column(name = "feuerloescher")
    private Boolean feuerloescher;
    @Basic
    @Column(name = "explosionsklappe")
    private Boolean explosionsklappe;
    @Basic
    @Column(name = "fussbodenunterhalb")
    private Boolean fussbodenunterhalb;
    @Basic
    @Column(name = "sicherheitsabstaende")
    private Boolean sicherheitsabstaende;
    @Basic
    @Column(name = "kaminabziehen")
    private String kaminabziehen;
    @Basic
    @Column(name = "b8201")
    private String b8201;
    @Basic
    @Column(name = "feuerloeschergeprueft")
    private String feuerloeschergeprueft;
    @Basic
    @Column(name = "maengel")
    private String maengel;

    public int getFmerhebungsblattid() {
        return fmerhebungsblattid;
    }

    public void setFmerhebungsblattid(int fmerhebungsblattid) {
        this.fmerhebungsblattid = fmerhebungsblattid;
    }

    public Integer getAuftragid() {
        return auftragid;
    }

    public void setAuftragid(Integer auftragid) {
        this.auftragid = auftragid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWasseraufbereitung() {
        return wasseraufbereitung;
    }

    public void setWasseraufbereitung(String wasseraufbereitung) {
        this.wasseraufbereitung = wasseraufbereitung;
    }

    public Boolean getNotschalter() {
        return notschalter;
    }

    public void setNotschalter(Boolean notschalter) {
        this.notschalter = notschalter;
    }

    public Boolean getFeuerloescher() {
        return feuerloescher;
    }

    public void setFeuerloescher(Boolean feuerloescher) {
        this.feuerloescher = feuerloescher;
    }

    public Boolean getExplosionsklappe() {
        return explosionsklappe;
    }

    public void setExplosionsklappe(Boolean explosionsklappe) {
        this.explosionsklappe = explosionsklappe;
    }

    public Boolean getFussbodenunterhalb() {
        return fussbodenunterhalb;
    }

    public void setFussbodenunterhalb(Boolean fussbodenunterhalb) {
        this.fussbodenunterhalb = fussbodenunterhalb;
    }

    public Boolean getSicherheitsabstaende() {
        return sicherheitsabstaende;
    }

    public void setSicherheitsabstaende(Boolean sicherheitsabstaende) {
        this.sicherheitsabstaende = sicherheitsabstaende;
    }

    public String getKaminabziehen() {
        return kaminabziehen;
    }

    public void setKaminabziehen(String kaminabziehen) {
        this.kaminabziehen = kaminabziehen;
    }

    public String getB8201() {
        return b8201;
    }

    public void setB8201(String b8201) {
        this.b8201 = b8201;
    }

    public String getFeuerloeschergeprueft() {
        return feuerloeschergeprueft;
    }

    public void setFeuerloeschergeprueft(String feuerloeschergeprueft) {
        this.feuerloeschergeprueft = feuerloeschergeprueft;
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

        EntityFmerhebungsblatt that = (EntityFmerhebungsblatt) o;

        if (fmerhebungsblattid != that.fmerhebungsblattid) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (wasseraufbereitung != null ? !wasseraufbereitung.equals(that.wasseraufbereitung) : that.wasseraufbereitung != null)
            return false;
        if (notschalter != null ? !notschalter.equals(that.notschalter) : that.notschalter != null) return false;
        if (feuerloescher != null ? !feuerloescher.equals(that.feuerloescher) : that.feuerloescher != null)
            return false;
        if (explosionsklappe != null ? !explosionsklappe.equals(that.explosionsklappe) : that.explosionsklappe != null)
            return false;
        if (fussbodenunterhalb != null ? !fussbodenunterhalb.equals(that.fussbodenunterhalb) : that.fussbodenunterhalb != null)
            return false;
        if (sicherheitsabstaende != null ? !sicherheitsabstaende.equals(that.sicherheitsabstaende) : that.sicherheitsabstaende != null)
            return false;
        if (kaminabziehen != null ? !kaminabziehen.equals(that.kaminabziehen) : that.kaminabziehen != null)
            return false;
        if (b8201 != null ? !b8201.equals(that.b8201) : that.b8201 != null) return false;
        if (feuerloeschergeprueft != null ? !feuerloeschergeprueft.equals(that.feuerloeschergeprueft) : that.feuerloeschergeprueft != null)
            return false;
        if (maengel != null ? !maengel.equals(that.maengel) : that.maengel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmerhebungsblattid;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (wasseraufbereitung != null ? wasseraufbereitung.hashCode() : 0);
        result = 31 * result + (notschalter != null ? notschalter.hashCode() : 0);
        result = 31 * result + (feuerloescher != null ? feuerloescher.hashCode() : 0);
        result = 31 * result + (explosionsklappe != null ? explosionsklappe.hashCode() : 0);
        result = 31 * result + (fussbodenunterhalb != null ? fussbodenunterhalb.hashCode() : 0);
        result = 31 * result + (sicherheitsabstaende != null ? sicherheitsabstaende.hashCode() : 0);
        result = 31 * result + (kaminabziehen != null ? kaminabziehen.hashCode() : 0);
        result = 31 * result + (b8201 != null ? b8201.hashCode() : 0);
        result = 31 * result + (feuerloeschergeprueft != null ? feuerloeschergeprueft.hashCode() : 0);
        result = 31 * result + (maengel != null ? maengel.hashCode() : 0);
        return result;
    }
}
