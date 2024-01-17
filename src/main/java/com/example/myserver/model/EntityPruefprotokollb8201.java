package com.example.myserver.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "pruefprotokollb8201", schema = "public")
public class EntityPruefprotokollb8201 {
    @SequenceGenerator(name = "seqpruefprotokollb8201", sequenceName = "seqpruefprotokollb8201", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqpruefprotokollb8201")
    @Id
    @Column(name = "pruefprotokollb8201id")
    private int pruefprotokollb8201Id;
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
    @Column(name = "roanrbez3")
    private String roanrbez3;
    @Basic
    @Column(name = "roamaterial3")
    private String roamaterial3;
    @Basic
    @Column(name = "roaquerschnitt3")
    private Double roaquerschnitt3;
    @Basic
    @Column(name = "roahoehe3")
    private Double roahoehe3;
    @Basic
    @Column(name = "roamaengel3")
    private String roamaengel3;
    @Basic
    @Column(name = "roanrbez4")
    private String roanrbez4;
    @Basic
    @Column(name = "roamaterial4")
    private String roamaterial4;
    @Basic
    @Column(name = "roaquerschnitt4")
    private Double roaquerschnitt4;
    @Basic
    @Column(name = "roahoehe4")
    private Double roahoehe4;
    @Basic
    @Column(name = "roamaengel4")
    private String roamaengel4;
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
    @Column(name = "fvztype3")
    private String fvztype3;
    @Basic
    @Column(name = "fvzbrennstoff3")
    private String fvzbrennstoff3;
    @Basic
    @Column(name = "fvzraum3")
    private String fvzraum3;
    @Basic
    @Column(name = "fvzkw3")
    private Double fvzkw3;
    @Basic
    @Column(name = "fvzzunr3")
    private String fvzzunr3;
    @Basic
    @Column(name = "fvzmaengel3")
    private String fvzmaengel3;
    @Basic
    @Column(name = "fvztype4")
    private String fvztype4;
    @Basic
    @Column(name = "fvzbrennstoff4")
    private String fvzbrennstoff4;
    @Basic
    @Column(name = "fvzraum4")
    private String fvzraum4;
    @Basic
    @Column(name = "fvzkw4")
    private Double fvzkw4;
    @Basic
    @Column(name = "fvzzunr4")
    private String fvzzunr4;
    @Basic
    @Column(name = "fvzmaengel4")
    private String fvzmaengel4;
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
    @Column(name = "ispos1")
    private Boolean ispos1;
    @Basic
    @Column(name = "ispos2")
    private Boolean ispos2;
    @Basic
    @Column(name = "ispos3")
    private Boolean ispos3;
    @Basic
    @Column(name = "ispos4")
    private Boolean ispos4;

    public int getPruefprotokollb8201Id() {
        return pruefprotokollb8201Id;
    }

    public void setPruefprotokollb8201Id(int pruefprotokollb8201Id) {
        this.pruefprotokollb8201Id = pruefprotokollb8201Id;
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

    public String getRoanrbez3() {
        return roanrbez3;
    }

    public void setRoanrbez3(String roanrbez3) {
        this.roanrbez3 = roanrbez3;
    }

    public String getRoamaterial3() {
        return roamaterial3;
    }

    public void setRoamaterial3(String roamaterial3) {
        this.roamaterial3 = roamaterial3;
    }

    public Double getRoaquerschnitt3() {
        return roaquerschnitt3;
    }

    public void setRoaquerschnitt3(Double roaquerschnitt3) {
        this.roaquerschnitt3 = roaquerschnitt3;
    }

    public Double getRoahoehe3() {
        return roahoehe3;
    }

    public void setRoahoehe3(Double roahoehe3) {
        this.roahoehe3 = roahoehe3;
    }

    public String getRoamaengel3() {
        return roamaengel3;
    }

    public void setRoamaengel3(String roamaengel3) {
        this.roamaengel3 = roamaengel3;
    }

    public String getRoanrbez4() {
        return roanrbez4;
    }

    public void setRoanrbez4(String roanrbez4) {
        this.roanrbez4 = roanrbez4;
    }

    public String getRoamaterial4() {
        return roamaterial4;
    }

    public void setRoamaterial4(String roamaterial4) {
        this.roamaterial4 = roamaterial4;
    }

    public Double getRoaquerschnitt4() {
        return roaquerschnitt4;
    }

    public void setRoaquerschnitt4(Double roaquerschnitt4) {
        this.roaquerschnitt4 = roaquerschnitt4;
    }

    public Double getRoahoehe4() {
        return roahoehe4;
    }

    public void setRoahoehe4(Double roahoehe4) {
        this.roahoehe4 = roahoehe4;
    }

    public String getRoamaengel4() {
        return roamaengel4;
    }

    public void setRoamaengel4(String roamaengel4) {
        this.roamaengel4 = roamaengel4;
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

    public String getFvztype3() {
        return fvztype3;
    }

    public void setFvztype3(String fvztype3) {
        this.fvztype3 = fvztype3;
    }

    public String getFvzbrennstoff3() {
        return fvzbrennstoff3;
    }

    public void setFvzbrennstoff3(String fvzbrennstoff3) {
        this.fvzbrennstoff3 = fvzbrennstoff3;
    }

    public String getFvzraum3() {
        return fvzraum3;
    }

    public void setFvzraum3(String fvzraum3) {
        this.fvzraum3 = fvzraum3;
    }

    public Double getFvzkw3() {
        return fvzkw3;
    }

    public void setFvzkw3(Double fvzkw3) {
        this.fvzkw3 = fvzkw3;
    }

    public String getFvzzunr3() {
        return fvzzunr3;
    }

    public void setFvzzunr3(String fvzzunr3) {
        this.fvzzunr3 = fvzzunr3;
    }

    public String getFvzmaengel3() {
        return fvzmaengel3;
    }

    public void setFvzmaengel3(String fvzmaengel3) {
        this.fvzmaengel3 = fvzmaengel3;
    }

    public String getFvztype4() {
        return fvztype4;
    }

    public void setFvztype4(String fvztype4) {
        this.fvztype4 = fvztype4;
    }

    public String getFvzbrennstoff4() {
        return fvzbrennstoff4;
    }

    public void setFvzbrennstoff4(String fvzbrennstoff4) {
        this.fvzbrennstoff4 = fvzbrennstoff4;
    }

    public String getFvzraum4() {
        return fvzraum4;
    }

    public void setFvzraum4(String fvzraum4) {
        this.fvzraum4 = fvzraum4;
    }

    public Double getFvzkw4() {
        return fvzkw4;
    }

    public void setFvzkw4(Double fvzkw4) {
        this.fvzkw4 = fvzkw4;
    }

    public String getFvzzunr4() {
        return fvzzunr4;
    }

    public void setFvzzunr4(String fvzzunr4) {
        this.fvzzunr4 = fvzzunr4;
    }

    public String getFvzmaengel4() {
        return fvzmaengel4;
    }

    public void setFvzmaengel4(String fvzmaengel4) {
        this.fvzmaengel4 = fvzmaengel4;
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

    public Boolean getIspos1() {
        return ispos1;
    }

    public void setIspos1(Boolean ispos1) {
        this.ispos1 = ispos1;
    }

    public Boolean getIspos2() {
        return ispos2;
    }

    public void setIspos2(Boolean ispos2) {
        this.ispos2 = ispos2;
    }

    public Boolean getIspos3() {
        return ispos3;
    }

    public void setIspos3(Boolean ispos3) {
        this.ispos3 = ispos3;
    }

    public Boolean getIspos4() {
        return ispos4;
    }

    public void setIspos4(Boolean ispos4) {
        this.ispos4 = ispos4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityPruefprotokollb8201 that = (EntityPruefprotokollb8201) o;

        if (pruefprotokollb8201Id != that.pruefprotokollb8201Id) return false;
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
        if (roanrbez3 != null ? !roanrbez3.equals(that.roanrbez3) : that.roanrbez3 != null) return false;
        if (roamaterial3 != null ? !roamaterial3.equals(that.roamaterial3) : that.roamaterial3 != null) return false;
        if (roaquerschnitt3 != null ? !roaquerschnitt3.equals(that.roaquerschnitt3) : that.roaquerschnitt3 != null)
            return false;
        if (roahoehe3 != null ? !roahoehe3.equals(that.roahoehe3) : that.roahoehe3 != null) return false;
        if (roamaengel3 != null ? !roamaengel3.equals(that.roamaengel3) : that.roamaengel3 != null) return false;
        if (roanrbez4 != null ? !roanrbez4.equals(that.roanrbez4) : that.roanrbez4 != null) return false;
        if (roamaterial4 != null ? !roamaterial4.equals(that.roamaterial4) : that.roamaterial4 != null) return false;
        if (roaquerschnitt4 != null ? !roaquerschnitt4.equals(that.roaquerschnitt4) : that.roaquerschnitt4 != null)
            return false;
        if (roahoehe4 != null ? !roahoehe4.equals(that.roahoehe4) : that.roahoehe4 != null) return false;
        if (roamaengel4 != null ? !roamaengel4.equals(that.roamaengel4) : that.roamaengel4 != null) return false;
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
        if (fvztype3 != null ? !fvztype3.equals(that.fvztype3) : that.fvztype3 != null) return false;
        if (fvzbrennstoff3 != null ? !fvzbrennstoff3.equals(that.fvzbrennstoff3) : that.fvzbrennstoff3 != null)
            return false;
        if (fvzraum3 != null ? !fvzraum3.equals(that.fvzraum3) : that.fvzraum3 != null) return false;
        if (fvzkw3 != null ? !fvzkw3.equals(that.fvzkw3) : that.fvzkw3 != null) return false;
        if (fvzzunr3 != null ? !fvzzunr3.equals(that.fvzzunr3) : that.fvzzunr3 != null) return false;
        if (fvzmaengel3 != null ? !fvzmaengel3.equals(that.fvzmaengel3) : that.fvzmaengel3 != null) return false;
        if (fvztype4 != null ? !fvztype4.equals(that.fvztype4) : that.fvztype4 != null) return false;
        if (fvzbrennstoff4 != null ? !fvzbrennstoff4.equals(that.fvzbrennstoff4) : that.fvzbrennstoff4 != null)
            return false;
        if (fvzraum4 != null ? !fvzraum4.equals(that.fvzraum4) : that.fvzraum4 != null) return false;
        if (fvzkw4 != null ? !fvzkw4.equals(that.fvzkw4) : that.fvzkw4 != null) return false;
        if (fvzzunr4 != null ? !fvzzunr4.equals(that.fvzzunr4) : that.fvzzunr4 != null) return false;
        if (fvzmaengel4 != null ? !fvzmaengel4.equals(that.fvzmaengel4) : that.fvzmaengel4 != null) return false;
        if (pruefer != null ? !pruefer.equals(that.pruefer) : that.pruefer != null) return false;
        if (pruefdatum != null ? !pruefdatum.equals(that.pruefdatum) : that.pruefdatum != null) return false;
        if (tlc != null ? !tlc.equals(that.tlc) : that.tlc != null) return false;
        if (tac != null ? !tac.equals(that.tac) : that.tac != null) return false;
        if (rz != null ? !rz.equals(that.rz) : that.rz != null) return false;
        if (co2 != null ? !co2.equals(that.co2) : that.co2 != null) return false;
        if (comg != null ? !comg.equals(that.comg) : that.comg != null) return false;
        if (eta != null ? !eta.equals(that.eta) : that.eta != null) return false;
        if (ispos1 != null ? !ispos1.equals(that.ispos1) : that.ispos1 != null) return false;
        if (ispos2 != null ? !ispos2.equals(that.ispos2) : that.ispos2 != null) return false;
        if (ispos3 != null ? !ispos3.equals(that.ispos3) : that.ispos3 != null) return false;
        if (ispos4 != null ? !ispos4.equals(that.ispos4) : that.ispos4 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pruefprotokollb8201Id;
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
        result = 31 * result + (roanrbez3 != null ? roanrbez3.hashCode() : 0);
        result = 31 * result + (roamaterial3 != null ? roamaterial3.hashCode() : 0);
        result = 31 * result + (roaquerschnitt3 != null ? roaquerschnitt3.hashCode() : 0);
        result = 31 * result + (roahoehe3 != null ? roahoehe3.hashCode() : 0);
        result = 31 * result + (roamaengel3 != null ? roamaengel3.hashCode() : 0);
        result = 31 * result + (roanrbez4 != null ? roanrbez4.hashCode() : 0);
        result = 31 * result + (roamaterial4 != null ? roamaterial4.hashCode() : 0);
        result = 31 * result + (roaquerschnitt4 != null ? roaquerschnitt4.hashCode() : 0);
        result = 31 * result + (roahoehe4 != null ? roahoehe4.hashCode() : 0);
        result = 31 * result + (roamaengel4 != null ? roamaengel4.hashCode() : 0);
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
        result = 31 * result + (fvztype3 != null ? fvztype3.hashCode() : 0);
        result = 31 * result + (fvzbrennstoff3 != null ? fvzbrennstoff3.hashCode() : 0);
        result = 31 * result + (fvzraum3 != null ? fvzraum3.hashCode() : 0);
        result = 31 * result + (fvzkw3 != null ? fvzkw3.hashCode() : 0);
        result = 31 * result + (fvzzunr3 != null ? fvzzunr3.hashCode() : 0);
        result = 31 * result + (fvzmaengel3 != null ? fvzmaengel3.hashCode() : 0);
        result = 31 * result + (fvztype4 != null ? fvztype4.hashCode() : 0);
        result = 31 * result + (fvzbrennstoff4 != null ? fvzbrennstoff4.hashCode() : 0);
        result = 31 * result + (fvzraum4 != null ? fvzraum4.hashCode() : 0);
        result = 31 * result + (fvzkw4 != null ? fvzkw4.hashCode() : 0);
        result = 31 * result + (fvzzunr4 != null ? fvzzunr4.hashCode() : 0);
        result = 31 * result + (fvzmaengel4 != null ? fvzmaengel4.hashCode() : 0);
        result = 31 * result + (pruefer != null ? pruefer.hashCode() : 0);
        result = 31 * result + (pruefdatum != null ? pruefdatum.hashCode() : 0);
        result = 31 * result + (tlc != null ? tlc.hashCode() : 0);
        result = 31 * result + (tac != null ? tac.hashCode() : 0);
        result = 31 * result + (rz != null ? rz.hashCode() : 0);
        result = 31 * result + (co2 != null ? co2.hashCode() : 0);
        result = 31 * result + (comg != null ? comg.hashCode() : 0);
        result = 31 * result + (eta != null ? eta.hashCode() : 0);
        result = 31 * result + (ispos1 != null ? ispos1.hashCode() : 0);
        result = 31 * result + (ispos2 != null ? ispos2.hashCode() : 0);
        result = 31 * result + (ispos3 != null ? ispos3.hashCode() : 0);
        result = 31 * result + (ispos4 != null ? ispos4.hashCode() : 0);
        return result;
    }
}
