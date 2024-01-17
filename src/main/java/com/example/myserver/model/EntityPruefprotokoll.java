package com.example.myserver.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "pruefprotokoll", schema = "public")
public class EntityPruefprotokoll {
    @SequenceGenerator(name = "seqpruefprotokoll", sequenceName = "seqpruefprotokoll", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqpruefprotokoll")
    @Id
    @Column(name = "pruefprotokollid")
    private int pruefprotokollid;
    @Basic
    @Column(name = "auftragid")
    private Integer auftragid;
    @Basic
    @Column(name = "objekt1")
    private String objekt1;
    @Basic
    @Column(name = "adresse1")
    private String adresse1;
    @Basic
    @Column(name = "ort1")
    private String ort1;
    @Basic
    @Column(name = "datum1")
    private Date datum1;
    @Basic
    @Column(name = "gemeinde1")
    private String gemeinde1;
    @Basic
    @Column(name = "telnr1")
    private Long telnr1;
    @Basic
    @Column(name = "objekt2")
    private String objekt2;
    @Basic
    @Column(name = "adresse2")
    private String adresse2;
    @Basic
    @Column(name = "ort2")
    private String ort2;
    @Basic
    @Column(name = "datum2")
    private Date datum2;
    @Basic
    @Column(name = "gemeinde2")
    private String gemeinde2;
    @Basic
    @Column(name = "telnr2")
    private Long telnr2;
    @Basic
    @Column(name = "roanrbez1")
    private String roanrbez1;
    @Basic
    @Column(name = "roamaterial1")
    private String roamaterial1;
    @Basic
    @Column(name = "roaquerschnitt1")
    private Double roaquerschnitt1;
    @Basic
    @Column(name = "roahoehe1")
    private Double roahoehe1;
    @Basic
    @Column(name = "roamaengel1")
    private String roamaengel1;
    @Basic
    @Column(name = "roanrbez2")
    private String roanrbez2;
    @Basic
    @Column(name = "roamaterial2")
    private String roamaterial2;
    @Basic
    @Column(name = "roaquerschnitt2")
    private Double roaquerschnitt2;
    @Basic
    @Column(name = "roahoehe2")
    private Double roahoehe2;
    @Basic
    @Column(name = "roamaengel2")
    private String roamaengel2;
    @Basic
    @Column(name = "fvztype1")
    private String fvztype1;
    @Basic
    @Column(name = "fvzbrennstoff1")
    private String fvzbrennstoff1;
    @Basic
    @Column(name = "fvzraum1")
    private String fvzraum1;
    @Basic
    @Column(name = "fvzkw1")
    private Double fvzkw1;
    @Basic
    @Column(name = "fvzzunr1")
    private String fvzzunr1;
    @Basic
    @Column(name = "fvzmaengel1")
    private String fvzmaengel1;
    @Basic
    @Column(name = "fvztype2")
    private String fvztype2;
    @Basic
    @Column(name = "fvzbrennstoff2")
    private String fvzbrennstoff2;
    @Basic
    @Column(name = "fvzraum2")
    private String fvzraum2;
    @Basic
    @Column(name = "fvzkw2")
    private Double fvzkw2;
    @Basic
    @Column(name = "fvzzunr2")
    private String fvzzunr2;
    @Basic
    @Column(name = "fvzmaengel2")
    private String fvzmaengel2;
    @Basic
    @Column(name = "pruefer")
    private String pruefer;
    @Basic
    @Column(name = "pruefdatum")
    private Date pruefdatum;
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
    @Basic
    @Column(name = "maengelbeheben")
    private Integer maengelbeheben;

    public int getPruefprotokollid() {
        return pruefprotokollid;
    }

    public void setPruefprotokollid(int pruefprotokollid) {
        this.pruefprotokollid = pruefprotokollid;
    }

    public Integer getAuftragid() {
        return auftragid;
    }

    public void setAuftragid(Integer auftragid) {
        this.auftragid = auftragid;
    }

    public String getObjekt1() {
        return objekt1;
    }

    public void setObjekt1(String objekt1) {
        this.objekt1 = objekt1;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getOrt1() {
        return ort1;
    }

    public void setOrt1(String ort1) {
        this.ort1 = ort1;
    }

    public Date getDatum1() {
        return datum1;
    }

    public void setDatum1(Date datum1) {
        this.datum1 = datum1;
    }

    public String getGemeinde1() {
        return gemeinde1;
    }

    public void setGemeinde1(String gemeinde1) {
        this.gemeinde1 = gemeinde1;
    }

    public Long getTelnr1() {
        return telnr1;
    }

    public void setTelnr1(Long telnr1) {
        this.telnr1 = telnr1;
    }

    public String getObjekt2() {
        return objekt2;
    }

    public void setObjekt2(String objekt2) {
        this.objekt2 = objekt2;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getOrt2() {
        return ort2;
    }

    public void setOrt2(String ort2) {
        this.ort2 = ort2;
    }

    public Date getDatum2() {
        return datum2;
    }

    public void setDatum2(Date datum2) {
        this.datum2 = datum2;
    }

    public String getGemeinde2() {
        return gemeinde2;
    }

    public void setGemeinde2(String gemeinde2) {
        this.gemeinde2 = gemeinde2;
    }

    public Long getTelnr2() {
        return telnr2;
    }

    public void setTelnr2(Long telnr2) {
        this.telnr2 = telnr2;
    }

    public String getRoanrbez1() {
        return roanrbez1;
    }

    public void setRoanrbez1(String roanrbez1) {
        this.roanrbez1 = roanrbez1;
    }

    public String getRoamaterial1() {
        return roamaterial1;
    }

    public void setRoamaterial1(String roamaterial1) {
        this.roamaterial1 = roamaterial1;
    }

    public Double getRoaquerschnitt1() {
        return roaquerschnitt1;
    }

    public void setRoaquerschnitt1(Double roaquerschnitt1) {
        this.roaquerschnitt1 = roaquerschnitt1;
    }

    public Double getRoahoehe1() {
        return roahoehe1;
    }

    public void setRoahoehe1(Double roahoehe1) {
        this.roahoehe1 = roahoehe1;
    }

    public String getRoamaengel1() {
        return roamaengel1;
    }

    public void setRoamaengel1(String roamaengel1) {
        this.roamaengel1 = roamaengel1;
    }

    public String getRoanrbez2() {
        return roanrbez2;
    }

    public void setRoanrbez2(String roanrbez2) {
        this.roanrbez2 = roanrbez2;
    }

    public String getRoamaterial2() {
        return roamaterial2;
    }

    public void setRoamaterial2(String roamaterial2) {
        this.roamaterial2 = roamaterial2;
    }

    public Double getRoaquerschnitt2() {
        return roaquerschnitt2;
    }

    public void setRoaquerschnitt2(Double roaquerschnitt2) {
        this.roaquerschnitt2 = roaquerschnitt2;
    }

    public Double getRoahoehe2() {
        return roahoehe2;
    }

    public void setRoahoehe2(Double roahoehe2) {
        this.roahoehe2 = roahoehe2;
    }

    public String getRoamaengel2() {
        return roamaengel2;
    }

    public void setRoamaengel2(String roamaengel2) {
        this.roamaengel2 = roamaengel2;
    }

    public String getFvztype1() {
        return fvztype1;
    }

    public void setFvztype1(String fvztype1) {
        this.fvztype1 = fvztype1;
    }

    public String getFvzbrennstoff1() {
        return fvzbrennstoff1;
    }

    public void setFvzbrennstoff1(String fvzbrennstoff1) {
        this.fvzbrennstoff1 = fvzbrennstoff1;
    }

    public String getFvzraum1() {
        return fvzraum1;
    }

    public void setFvzraum1(String fvzraum1) {
        this.fvzraum1 = fvzraum1;
    }

    public Double getFvzkw1() {
        return fvzkw1;
    }

    public void setFvzkw1(Double fvzkw1) {
        this.fvzkw1 = fvzkw1;
    }

    public String getFvzzunr1() {
        return fvzzunr1;
    }

    public void setFvzzunr1(String fvzzunr1) {
        this.fvzzunr1 = fvzzunr1;
    }

    public String getFvzmaengel1() {
        return fvzmaengel1;
    }

    public void setFvzmaengel1(String fvzmaengel1) {
        this.fvzmaengel1 = fvzmaengel1;
    }

    public String getFvztype2() {
        return fvztype2;
    }

    public void setFvztype2(String fvztype2) {
        this.fvztype2 = fvztype2;
    }

    public String getFvzbrennstoff2() {
        return fvzbrennstoff2;
    }

    public void setFvzbrennstoff2(String fvzbrennstoff2) {
        this.fvzbrennstoff2 = fvzbrennstoff2;
    }

    public String getFvzraum2() {
        return fvzraum2;
    }

    public void setFvzraum2(String fvzraum2) {
        this.fvzraum2 = fvzraum2;
    }

    public Double getFvzkw2() {
        return fvzkw2;
    }

    public void setFvzkw2(Double fvzkw2) {
        this.fvzkw2 = fvzkw2;
    }

    public String getFvzzunr2() {
        return fvzzunr2;
    }

    public void setFvzzunr2(String fvzzunr2) {
        this.fvzzunr2 = fvzzunr2;
    }

    public String getFvzmaengel2() {
        return fvzmaengel2;
    }

    public void setFvzmaengel2(String fvzmaengel2) {
        this.fvzmaengel2 = fvzmaengel2;
    }

    public String getPruefer() {
        return pruefer;
    }

    public void setPruefer(String pruefer) {
        this.pruefer = pruefer;
    }

    public Date getPruefdatum() {
        return pruefdatum;
    }

    public void setPruefdatum(Date pruefdatum) {
        this.pruefdatum = pruefdatum;
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

    public Integer getMaengelbeheben() {
        return maengelbeheben;
    }

    public void setMaengelbeheben(Integer maengelbeheben) {
        this.maengelbeheben = maengelbeheben;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityPruefprotokoll that = (EntityPruefprotokoll) o;

        if (pruefprotokollid != that.pruefprotokollid) return false;
        if (auftragid != null ? !auftragid.equals(that.auftragid) : that.auftragid != null) return false;
        if (objekt1 != null ? !objekt1.equals(that.objekt1) : that.objekt1 != null) return false;
        if (adresse1 != null ? !adresse1.equals(that.adresse1) : that.adresse1 != null) return false;
        if (ort1 != null ? !ort1.equals(that.ort1) : that.ort1 != null) return false;
        if (datum1 != null ? !datum1.equals(that.datum1) : that.datum1 != null) return false;
        if (gemeinde1 != null ? !gemeinde1.equals(that.gemeinde1) : that.gemeinde1 != null) return false;
        if (telnr1 != null ? !telnr1.equals(that.telnr1) : that.telnr1 != null) return false;
        if (objekt2 != null ? !objekt2.equals(that.objekt2) : that.objekt2 != null) return false;
        if (adresse2 != null ? !adresse2.equals(that.adresse2) : that.adresse2 != null) return false;
        if (ort2 != null ? !ort2.equals(that.ort2) : that.ort2 != null) return false;
        if (datum2 != null ? !datum2.equals(that.datum2) : that.datum2 != null) return false;
        if (gemeinde2 != null ? !gemeinde2.equals(that.gemeinde2) : that.gemeinde2 != null) return false;
        if (telnr2 != null ? !telnr2.equals(that.telnr2) : that.telnr2 != null) return false;
        if (roanrbez1 != null ? !roanrbez1.equals(that.roanrbez1) : that.roanrbez1 != null) return false;
        if (roamaterial1 != null ? !roamaterial1.equals(that.roamaterial1) : that.roamaterial1 != null) return false;
        if (roaquerschnitt1 != null ? !roaquerschnitt1.equals(that.roaquerschnitt1) : that.roaquerschnitt1 != null)
            return false;
        if (roahoehe1 != null ? !roahoehe1.equals(that.roahoehe1) : that.roahoehe1 != null) return false;
        if (roamaengel1 != null ? !roamaengel1.equals(that.roamaengel1) : that.roamaengel1 != null) return false;
        if (roanrbez2 != null ? !roanrbez2.equals(that.roanrbez2) : that.roanrbez2 != null) return false;
        if (roamaterial2 != null ? !roamaterial2.equals(that.roamaterial2) : that.roamaterial2 != null) return false;
        if (roaquerschnitt2 != null ? !roaquerschnitt2.equals(that.roaquerschnitt2) : that.roaquerschnitt2 != null)
            return false;
        if (roahoehe2 != null ? !roahoehe2.equals(that.roahoehe2) : that.roahoehe2 != null) return false;
        if (roamaengel2 != null ? !roamaengel2.equals(that.roamaengel2) : that.roamaengel2 != null) return false;
        if (fvztype1 != null ? !fvztype1.equals(that.fvztype1) : that.fvztype1 != null) return false;
        if (fvzbrennstoff1 != null ? !fvzbrennstoff1.equals(that.fvzbrennstoff1) : that.fvzbrennstoff1 != null)
            return false;
        if (fvzraum1 != null ? !fvzraum1.equals(that.fvzraum1) : that.fvzraum1 != null) return false;
        if (fvzkw1 != null ? !fvzkw1.equals(that.fvzkw1) : that.fvzkw1 != null) return false;
        if (fvzzunr1 != null ? !fvzzunr1.equals(that.fvzzunr1) : that.fvzzunr1 != null) return false;
        if (fvzmaengel1 != null ? !fvzmaengel1.equals(that.fvzmaengel1) : that.fvzmaengel1 != null) return false;
        if (fvztype2 != null ? !fvztype2.equals(that.fvztype2) : that.fvztype2 != null) return false;
        if (fvzbrennstoff2 != null ? !fvzbrennstoff2.equals(that.fvzbrennstoff2) : that.fvzbrennstoff2 != null)
            return false;
        if (fvzraum2 != null ? !fvzraum2.equals(that.fvzraum2) : that.fvzraum2 != null) return false;
        if (fvzkw2 != null ? !fvzkw2.equals(that.fvzkw2) : that.fvzkw2 != null) return false;
        if (fvzzunr2 != null ? !fvzzunr2.equals(that.fvzzunr2) : that.fvzzunr2 != null) return false;
        if (fvzmaengel2 != null ? !fvzmaengel2.equals(that.fvzmaengel2) : that.fvzmaengel2 != null) return false;
        if (pruefer != null ? !pruefer.equals(that.pruefer) : that.pruefer != null) return false;
        if (pruefdatum != null ? !pruefdatum.equals(that.pruefdatum) : that.pruefdatum != null) return false;
        if (tlc != null ? !tlc.equals(that.tlc) : that.tlc != null) return false;
        if (tac != null ? !tac.equals(that.tac) : that.tac != null) return false;
        if (rz != null ? !rz.equals(that.rz) : that.rz != null) return false;
        if (co2 != null ? !co2.equals(that.co2) : that.co2 != null) return false;
        if (comg != null ? !comg.equals(that.comg) : that.comg != null) return false;
        if (eta != null ? !eta.equals(that.eta) : that.eta != null) return false;
        if (maengelbeheben != null ? !maengelbeheben.equals(that.maengelbeheben) : that.maengelbeheben != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pruefprotokollid;
        result = 31 * result + (auftragid != null ? auftragid.hashCode() : 0);
        result = 31 * result + (objekt1 != null ? objekt1.hashCode() : 0);
        result = 31 * result + (adresse1 != null ? adresse1.hashCode() : 0);
        result = 31 * result + (ort1 != null ? ort1.hashCode() : 0);
        result = 31 * result + (datum1 != null ? datum1.hashCode() : 0);
        result = 31 * result + (gemeinde1 != null ? gemeinde1.hashCode() : 0);
        result = 31 * result + (telnr1 != null ? telnr1.hashCode() : 0);
        result = 31 * result + (objekt2 != null ? objekt2.hashCode() : 0);
        result = 31 * result + (adresse2 != null ? adresse2.hashCode() : 0);
        result = 31 * result + (ort2 != null ? ort2.hashCode() : 0);
        result = 31 * result + (datum2 != null ? datum2.hashCode() : 0);
        result = 31 * result + (gemeinde2 != null ? gemeinde2.hashCode() : 0);
        result = 31 * result + (telnr2 != null ? telnr2.hashCode() : 0);
        result = 31 * result + (roanrbez1 != null ? roanrbez1.hashCode() : 0);
        result = 31 * result + (roamaterial1 != null ? roamaterial1.hashCode() : 0);
        result = 31 * result + (roaquerschnitt1 != null ? roaquerschnitt1.hashCode() : 0);
        result = 31 * result + (roahoehe1 != null ? roahoehe1.hashCode() : 0);
        result = 31 * result + (roamaengel1 != null ? roamaengel1.hashCode() : 0);
        result = 31 * result + (roanrbez2 != null ? roanrbez2.hashCode() : 0);
        result = 31 * result + (roamaterial2 != null ? roamaterial2.hashCode() : 0);
        result = 31 * result + (roaquerschnitt2 != null ? roaquerschnitt2.hashCode() : 0);
        result = 31 * result + (roahoehe2 != null ? roahoehe2.hashCode() : 0);
        result = 31 * result + (roamaengel2 != null ? roamaengel2.hashCode() : 0);
        result = 31 * result + (fvztype1 != null ? fvztype1.hashCode() : 0);
        result = 31 * result + (fvzbrennstoff1 != null ? fvzbrennstoff1.hashCode() : 0);
        result = 31 * result + (fvzraum1 != null ? fvzraum1.hashCode() : 0);
        result = 31 * result + (fvzkw1 != null ? fvzkw1.hashCode() : 0);
        result = 31 * result + (fvzzunr1 != null ? fvzzunr1.hashCode() : 0);
        result = 31 * result + (fvzmaengel1 != null ? fvzmaengel1.hashCode() : 0);
        result = 31 * result + (fvztype2 != null ? fvztype2.hashCode() : 0);
        result = 31 * result + (fvzbrennstoff2 != null ? fvzbrennstoff2.hashCode() : 0);
        result = 31 * result + (fvzraum2 != null ? fvzraum2.hashCode() : 0);
        result = 31 * result + (fvzkw2 != null ? fvzkw2.hashCode() : 0);
        result = 31 * result + (fvzzunr2 != null ? fvzzunr2.hashCode() : 0);
        result = 31 * result + (fvzmaengel2 != null ? fvzmaengel2.hashCode() : 0);
        result = 31 * result + (pruefer != null ? pruefer.hashCode() : 0);
        result = 31 * result + (pruefdatum != null ? pruefdatum.hashCode() : 0);
        result = 31 * result + (tlc != null ? tlc.hashCode() : 0);
        result = 31 * result + (tac != null ? tac.hashCode() : 0);
        result = 31 * result + (rz != null ? rz.hashCode() : 0);
        result = 31 * result + (co2 != null ? co2.hashCode() : 0);
        result = 31 * result + (comg != null ? comg.hashCode() : 0);
        result = 31 * result + (eta != null ? eta.hashCode() : 0);
        result = 31 * result + (maengelbeheben != null ? maengelbeheben.hashCode() : 0);
        return result;
    }
}
