package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fmmangelmldg", schema = "public")
public class EntityFmmangelmldg {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "fmmangelmldgid")
    private int fmmangelmldgid;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "gemeindeamt")
    private String gemeindeamt;
    @Basic
    @Column(name = "rauchfangkehrer")
    private String rauchfangkehrer;
    @Basic
    @Column(name = "telefon")
    private Long telefon;
    @Basic
    @Column(name = "objekt")
    private String objekt;
    @Basic
    @Column(name = "mangel1")
    private String mangel1;
    @Basic
    @Column(name = "mangel2")
    private String mangel2;
    @Basic
    @Column(name = "mangel3")
    private String mangel3;
    @Basic
    @Column(name = "mangel4")
    private String mangel4;
    @Basic
    @Column(name = "mangel5")
    private String mangel5;
    @Basic
    @Column(name = "mangel6")
    private String mangel6;
    @Basic
    @Column(name = "mangel7")
    private String mangel7;

    public int getFmmangelmldgid() {
        return fmmangelmldgid;
    }

    public void setFmmangelmldgid(int fmmangelmldgid) {
        this.fmmangelmldgid = fmmangelmldgid;
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

    public String getRauchfangkehrer() {
        return rauchfangkehrer;
    }

    public void setRauchfangkehrer(String rauchfangkehrer) {
        this.rauchfangkehrer = rauchfangkehrer;
    }

    public Long getTelefon() {
        return telefon;
    }

    public void setTelefon(Long telefon) {
        this.telefon = telefon;
    }

    public String getObjekt() {
        return objekt;
    }

    public void setObjekt(String objekt) {
        this.objekt = objekt;
    }

    public String getMangel1() {
        return mangel1;
    }

    public void setMangel1(String mangel1) {
        this.mangel1 = mangel1;
    }

    public String getMangel2() {
        return mangel2;
    }

    public void setMangel2(String mangel2) {
        this.mangel2 = mangel2;
    }

    public String getMangel3() {
        return mangel3;
    }

    public void setMangel3(String mangel3) {
        this.mangel3 = mangel3;
    }

    public String getMangel4() {
        return mangel4;
    }

    public void setMangel4(String mangel4) {
        this.mangel4 = mangel4;
    }

    public String getMangel5() {
        return mangel5;
    }

    public void setMangel5(String mangel5) {
        this.mangel5 = mangel5;
    }

    public String getMangel6() {
        return mangel6;
    }

    public void setMangel6(String mangel6) {
        this.mangel6 = mangel6;
    }

    public String getMangel7() {
        return mangel7;
    }

    public void setMangel7(String mangel7) {
        this.mangel7 = mangel7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFmmangelmldg that = (EntityFmmangelmldg) o;

        if (fmmangelmldgid != that.fmmangelmldgid) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (gemeindeamt != null ? !gemeindeamt.equals(that.gemeindeamt) : that.gemeindeamt != null) return false;
        if (rauchfangkehrer != null ? !rauchfangkehrer.equals(that.rauchfangkehrer) : that.rauchfangkehrer != null)
            return false;
        if (telefon != null ? !telefon.equals(that.telefon) : that.telefon != null) return false;
        if (objekt != null ? !objekt.equals(that.objekt) : that.objekt != null) return false;
        if (mangel1 != null ? !mangel1.equals(that.mangel1) : that.mangel1 != null) return false;
        if (mangel2 != null ? !mangel2.equals(that.mangel2) : that.mangel2 != null) return false;
        if (mangel3 != null ? !mangel3.equals(that.mangel3) : that.mangel3 != null) return false;
        if (mangel4 != null ? !mangel4.equals(that.mangel4) : that.mangel4 != null) return false;
        if (mangel5 != null ? !mangel5.equals(that.mangel5) : that.mangel5 != null) return false;
        if (mangel6 != null ? !mangel6.equals(that.mangel6) : that.mangel6 != null) return false;
        if (mangel7 != null ? !mangel7.equals(that.mangel7) : that.mangel7 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fmmangelmldgid;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (gemeindeamt != null ? gemeindeamt.hashCode() : 0);
        result = 31 * result + (rauchfangkehrer != null ? rauchfangkehrer.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (objekt != null ? objekt.hashCode() : 0);
        result = 31 * result + (mangel1 != null ? mangel1.hashCode() : 0);
        result = 31 * result + (mangel2 != null ? mangel2.hashCode() : 0);
        result = 31 * result + (mangel3 != null ? mangel3.hashCode() : 0);
        result = 31 * result + (mangel4 != null ? mangel4.hashCode() : 0);
        result = 31 * result + (mangel5 != null ? mangel5.hashCode() : 0);
        result = 31 * result + (mangel6 != null ? mangel6.hashCode() : 0);
        result = 31 * result + (mangel7 != null ? mangel7.hashCode() : 0);
        return result;
    }
}
