package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fmerhebungsblatt", schema = "public")
public class EntityFmerhebungsblatt {
    @SequenceGenerator(name = "seqerhebungsblatt", sequenceName = "seqerhebungsblatt", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqerhebungsblatt")
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
    private Boolean maengel;
    @Basic
    @Column(name = "fangbaustoff1")
    private String fangbaustoff1;
    @Basic
    @Column(name = "marketyp1")
    private String marketyp1;
    @Basic
    @Column(name = "hoeheueberdach1")
    private Double hoeheueberdach1;
    @Basic
    @Column(name = "fangaufsatz1")
    private Boolean fangaufsatz1;
    @Basic
    @Column(name = "fangausfuehrungsart1")
    private String fangausfuehrungsart1;
    @Basic
    @Column(name = "laenge1")
    private Double laenge1;
    @Basic
    @Column(name = "durchmesser1")
    private Double durchmesser1;
    @Basic
    @Column(name = "kehrtuerchen1")
    private String kehrtuerchen1;
    @Basic
    @Column(name = "bodennichtbrennbar1")
    private Boolean bodennichtbrennbar1;
    @Basic
    @Column(name = "ugaenglichkeit1")
    private Boolean ugaenglichkeit1;
    @Basic
    @Column(name = "betriebsdicht1")
    private Boolean betriebsdicht1;
    @Basic
    @Column(name = "fangbaustoff2")
    private String fangbaustoff2;
    @Basic
    @Column(name = "marketyp2")
    private String marketyp2;
    @Basic
    @Column(name = "hoeheueberdach2")
    private Double hoeheueberdach2;
    @Basic
    @Column(name = "fangaufsatz2")
    private Boolean fangaufsatz2;
    @Basic
    @Column(name = "fangausfuehrungsart2")
    private String fangausfuehrungsart2;
    @Basic
    @Column(name = "laenge2")
    private Double laenge2;
    @Basic
    @Column(name = "durchmesser2")
    private Double durchmesser2;
    @Basic
    @Column(name = "kehrtuerchen2")
    private String kehrtuerchen2;
    @Basic
    @Column(name = "bodennichtbrennbar2")
    private Boolean bodennichtbrennbar2;
    @Basic
    @Column(name = "ugaenglichkeit2")
    private Boolean ugaenglichkeit2;
    @Basic
    @Column(name = "betriebsdicht2")
    private Boolean betriebsdicht2;
    @Basic
    @Column(name = "fangbaustoff3")
    private String fangbaustoff3;
    @Basic
    @Column(name = "marketyp3")
    private String marketyp3;
    @Basic
    @Column(name = "hoeheueberdach3")
    private Double hoeheueberdach3;
    @Basic
    @Column(name = "fangaufsatz3")
    private Boolean fangaufsatz3;
    @Basic
    @Column(name = "fangausfuehrungsart3")
    private String fangausfuehrungsart3;
    @Basic
    @Column(name = "laenge3")
    private Double laenge3;
    @Basic
    @Column(name = "durchmesser3")
    private Double durchmesser3;
    @Basic
    @Column(name = "kehrtuerchen3")
    private String kehrtuerchen3;
    @Basic
    @Column(name = "bodennichtbrennbar3")
    private Boolean bodennichtbrennbar3;
    @Basic
    @Column(name = "ugaenglichkeit3")
    private Boolean ugaenglichkeit3;
    @Basic
    @Column(name = "betriebsdicht3")
    private Boolean betriebsdicht3;
    @Basic
    @Column(name = "isoliert1")
    private Boolean isoliert1;
    @Basic
    @Column(name = "vsdurchmesser1")
    private Double vsdurchmesser1;
    @Basic
    @Column(name = "material1")
    private String material1;
    @Basic
    @Column(name = "waaglaenge1")
    private Double waaglaenge1;
    @Basic
    @Column(name = "senkrlaenge1")
    private Double senkrlaenge1;
    @Basic
    @Column(name = "anschlusshoehe1")
    private Double anschlusshoehe1;
    @Basic
    @Column(name = "boegen901")
    private String boegen901;
    @Basic
    @Column(name = "boegen451")
    private String boegen451;
    @Basic
    @Column(name = "isoliert2")
    private Boolean isoliert2;
    @Basic
    @Column(name = "vsdurchmesser2")
    private Double vsdurchmesser2;
    @Basic
    @Column(name = "material2")
    private String material2;
    @Basic
    @Column(name = "waaglaenge2")
    private Double waaglaenge2;
    @Basic
    @Column(name = "senkrlaenge2")
    private Double senkrlaenge2;
    @Basic
    @Column(name = "anschlusshoehe2")
    private Double anschlusshoehe2;
    @Basic
    @Column(name = "boegen902")
    private String boegen902;
    @Basic
    @Column(name = "boegen452")
    private String boegen452;
    @Basic
    @Column(name = "isoliert3")
    private Boolean isoliert3;
    @Basic
    @Column(name = "vsdurchmesser3")
    private Double vsdurchmesser3;
    @Basic
    @Column(name = "material3")
    private String material3;
    @Basic
    @Column(name = "waaglaenge3")
    private Double waaglaenge3;
    @Basic
    @Column(name = "senkrlaenge3")
    private Double senkrlaenge3;
    @Basic
    @Column(name = "anschlusshoehe3")
    private Double anschlusshoehe3;
    @Basic
    @Column(name = "boegen903")
    private String boegen903;
    @Basic
    @Column(name = "boegen453")
    private String boegen453;
    @Basic
    @Column(name = "hersteller1")
    private String hersteller1;
    @Basic
    @Column(name = "typ1")
    private String typ1;
    @Basic
    @Column(name = "leistung1")
    private String leistung1;
    @Basic
    @Column(name = "brennstoff1")
    private String brennstoff1;
    @Basic
    @Column(name = "baujahr1")
    private Integer baujahr1;
    @Basic
    @Column(name = "zuluft1")
    private String zuluft1;
    @Basic
    @Column(name = "aufstellungsjahr1")
    private Integer aufstellungsjahr1;
    @Basic
    @Column(name = "raum1")
    private String raum1;
    @Basic
    @Column(name = "geschoss1")
    private String geschoss1;
    @Basic
    @Column(name = "benuetzung1")
    private String benuetzung1;
    @Basic
    @Column(name = "hersteller2")
    private String hersteller2;
    @Basic
    @Column(name = "typ2")
    private String typ2;
    @Basic
    @Column(name = "leistung2")
    private String leistung2;
    @Basic
    @Column(name = "brennstoff2")
    private String brennstoff2;
    @Basic
    @Column(name = "baujahr2")
    private Integer baujahr2;
    @Basic
    @Column(name = "zuluft2")
    private String zuluft2;
    @Basic
    @Column(name = "aufstellungsjahr2")
    private Integer aufstellungsjahr2;
    @Basic
    @Column(name = "raum2")
    private String raum2;
    @Basic
    @Column(name = "geschoss2")
    private String geschoss2;
    @Basic
    @Column(name = "benuetzung2")
    private String benuetzung2;
    @Basic
    @Column(name = "hersteller3")
    private String hersteller3;
    @Basic
    @Column(name = "typ3")
    private String typ3;
    @Basic
    @Column(name = "leistung3")
    private String leistung3;
    @Basic
    @Column(name = "brennstoff3")
    private String brennstoff3;
    @Basic
    @Column(name = "baujahr3")
    private Integer baujahr3;
    @Basic
    @Column(name = "zuluft3")
    private String zuluft3;
    @Basic
    @Column(name = "aufstellungsjahr3")
    private Integer aufstellungsjahr3;
    @Basic
    @Column(name = "raum3")
    private String raum3;
    @Basic
    @Column(name = "geschoss3")
    private String geschoss3;
    @Basic
    @Column(name = "benuetzung3")
    private String benuetzung3;
    @Basic
    @Column(name = "putztuerchen1")
    private String putztuerchen1;
    @Basic
    @Column(name = "putztuerchen2")
    private String putztuerchen2;
    @Basic
    @Column(name = "putztuerchen3")
    private String putztuerchen3;

    @Basic
    @Column(name = "imgsignature")
    private byte[] imgsignature;

    public byte[] getImgsignature() {
        return imgsignature;
    }

    public void setImgsignature(byte[] imgsignature) {
        this.imgsignature = imgsignature;
    }

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

    public Boolean getMaengel() {
        return maengel;
    }

    public void setMaengel(Boolean maengel) {
        this.maengel = maengel;
    }

    public String getFangbaustoff1() {
        return fangbaustoff1;
    }

    public void setFangbaustoff1(String fangbaustoff1) {
        this.fangbaustoff1 = fangbaustoff1;
    }

    public String getMarketyp1() {
        return marketyp1;
    }

    public void setMarketyp1(String marketyp1) {
        this.marketyp1 = marketyp1;
    }

    public Double getHoeheueberdach1() {
        return hoeheueberdach1;
    }

    public void setHoeheueberdach1(Double hoeheueberdach1) {
        this.hoeheueberdach1 = hoeheueberdach1;
    }

    public Boolean getFangaufsatz1() {
        return fangaufsatz1;
    }

    public void setFangaufsatz1(Boolean fangaufsatz1) {
        this.fangaufsatz1 = fangaufsatz1;
    }

    public String getFangausfuehrungsart1() {
        return fangausfuehrungsart1;
    }

    public void setFangausfuehrungsart1(String fangausfuehrungsart1) {
        this.fangausfuehrungsart1 = fangausfuehrungsart1;
    }

    public Double getLaenge1() {
        return laenge1;
    }

    public void setLaenge1(Double laenge1) {
        this.laenge1 = laenge1;
    }

    public Double getDurchmesser1() {
        return durchmesser1;
    }

    public void setDurchmesser1(Double durchmesser1) {
        this.durchmesser1 = durchmesser1;
    }

    public String getKehrtuerchen1() {
        return kehrtuerchen1;
    }

    public void setKehrtuerchen1(String kehrtuerchen1) {
        this.kehrtuerchen1 = kehrtuerchen1;
    }

    public Boolean getBodennichtbrennbar1() {
        return bodennichtbrennbar1;
    }

    public void setBodennichtbrennbar1(Boolean bodennichtbrennbar1) {
        this.bodennichtbrennbar1 = bodennichtbrennbar1;
    }

    public Boolean getUgaenglichkeit1() {
        return ugaenglichkeit1;
    }

    public void setUgaenglichkeit1(Boolean ugaenglichkeit1) {
        this.ugaenglichkeit1 = ugaenglichkeit1;
    }

    public Boolean getBetriebsdicht1() {
        return betriebsdicht1;
    }

    public void setBetriebsdicht1(Boolean betriebsdicht1) {
        this.betriebsdicht1 = betriebsdicht1;
    }

    public String getFangbaustoff2() {
        return fangbaustoff2;
    }

    public void setFangbaustoff2(String fangbaustoff2) {
        this.fangbaustoff2 = fangbaustoff2;
    }

    public String getMarketyp2() {
        return marketyp2;
    }

    public void setMarketyp2(String marketyp2) {
        this.marketyp2 = marketyp2;
    }

    public Double getHoeheueberdach2() {
        return hoeheueberdach2;
    }

    public void setHoeheueberdach2(Double hoeheueberdach2) {
        this.hoeheueberdach2 = hoeheueberdach2;
    }

    public Boolean getFangaufsatz2() {
        return fangaufsatz2;
    }

    public void setFangaufsatz2(Boolean fangaufsatz2) {
        this.fangaufsatz2 = fangaufsatz2;
    }

    public String getFangausfuehrungsart2() {
        return fangausfuehrungsart2;
    }

    public void setFangausfuehrungsart2(String fangausfuehrungsart2) {
        this.fangausfuehrungsart2 = fangausfuehrungsart2;
    }

    public Double getLaenge2() {
        return laenge2;
    }

    public void setLaenge2(Double laenge2) {
        this.laenge2 = laenge2;
    }

    public Double getDurchmesser2() {
        return durchmesser2;
    }

    public void setDurchmesser2(Double durchmesser2) {
        this.durchmesser2 = durchmesser2;
    }

    public String getKehrtuerchen2() {
        return kehrtuerchen2;
    }

    public void setKehrtuerchen2(String kehrtuerchen2) {
        this.kehrtuerchen2 = kehrtuerchen2;
    }

    public Boolean getBodennichtbrennbar2() {
        return bodennichtbrennbar2;
    }

    public void setBodennichtbrennbar2(Boolean bodennichtbrennbar2) {
        this.bodennichtbrennbar2 = bodennichtbrennbar2;
    }

    public Boolean getUgaenglichkeit2() {
        return ugaenglichkeit2;
    }

    public void setUgaenglichkeit2(Boolean ugaenglichkeit2) {
        this.ugaenglichkeit2 = ugaenglichkeit2;
    }

    public Boolean getBetriebsdicht2() {
        return betriebsdicht2;
    }

    public void setBetriebsdicht2(Boolean betriebsdicht2) {
        this.betriebsdicht2 = betriebsdicht2;
    }

    public String getFangbaustoff3() {
        return fangbaustoff3;
    }

    public void setFangbaustoff3(String fangbaustoff3) {
        this.fangbaustoff3 = fangbaustoff3;
    }

    public String getMarketyp3() {
        return marketyp3;
    }

    public void setMarketyp3(String marketyp3) {
        this.marketyp3 = marketyp3;
    }

    public Double getHoeheueberdach3() {
        return hoeheueberdach3;
    }

    public void setHoeheueberdach3(Double hoeheueberdach3) {
        this.hoeheueberdach3 = hoeheueberdach3;
    }

    public Boolean getFangaufsatz3() {
        return fangaufsatz3;
    }

    public void setFangaufsatz3(Boolean fangaufsatz3) {
        this.fangaufsatz3 = fangaufsatz3;
    }

    public String getFangausfuehrungsart3() {
        return fangausfuehrungsart3;
    }

    public void setFangausfuehrungsart3(String fangausfuehrungsart3) {
        this.fangausfuehrungsart3 = fangausfuehrungsart3;
    }

    public Double getLaenge3() {
        return laenge3;
    }

    public void setLaenge3(Double laenge3) {
        this.laenge3 = laenge3;
    }

    public Double getDurchmesser3() {
        return durchmesser3;
    }

    public void setDurchmesser3(Double durchmesser3) {
        this.durchmesser3 = durchmesser3;
    }

    public String getKehrtuerchen3() {
        return kehrtuerchen3;
    }

    public void setKehrtuerchen3(String kehrtuerchen3) {
        this.kehrtuerchen3 = kehrtuerchen3;
    }

    public Boolean getBodennichtbrennbar3() {
        return bodennichtbrennbar3;
    }

    public void setBodennichtbrennbar3(Boolean bodennichtbrennbar3) {
        this.bodennichtbrennbar3 = bodennichtbrennbar3;
    }

    public Boolean getUgaenglichkeit3() {
        return ugaenglichkeit3;
    }

    public void setUgaenglichkeit3(Boolean ugaenglichkeit3) {
        this.ugaenglichkeit3 = ugaenglichkeit3;
    }

    public Boolean getBetriebsdicht3() {
        return betriebsdicht3;
    }

    public void setBetriebsdicht3(Boolean betriebsdicht3) {
        this.betriebsdicht3 = betriebsdicht3;
    }

    public Boolean getIsoliert1() {
        return isoliert1;
    }

    public void setIsoliert1(Boolean isoliert1) {
        this.isoliert1 = isoliert1;
    }

    public Double getVsdurchmesser1() {
        return vsdurchmesser1;
    }

    public void setVsdurchmesser1(Double vsdurchmesser1) {
        this.vsdurchmesser1 = vsdurchmesser1;
    }

    public String getMaterial1() {
        return material1;
    }

    public void setMaterial1(String material1) {
        this.material1 = material1;
    }

    public Double getWaaglaenge1() {
        return waaglaenge1;
    }

    public void setWaaglaenge1(Double waaglaenge1) {
        this.waaglaenge1 = waaglaenge1;
    }

    public Double getSenkrlaenge1() {
        return senkrlaenge1;
    }

    public void setSenkrlaenge1(Double senkrlaenge1) {
        this.senkrlaenge1 = senkrlaenge1;
    }

    public Double getAnschlusshoehe1() {
        return anschlusshoehe1;
    }

    public void setAnschlusshoehe1(Double anschlusshoehe1) {
        this.anschlusshoehe1 = anschlusshoehe1;
    }

    public String getBoegen901() {
        return boegen901;
    }

    public void setBoegen901(String boegen901) {
        this.boegen901 = boegen901;
    }

    public String getBoegen451() {
        return boegen451;
    }

    public void setBoegen451(String boegen451) {
        this.boegen451 = boegen451;
    }

    public Boolean getIsoliert2() {
        return isoliert2;
    }

    public void setIsoliert2(Boolean isoliert2) {
        this.isoliert2 = isoliert2;
    }

    public Double getVsdurchmesser2() {
        return vsdurchmesser2;
    }

    public void setVsdurchmesser2(Double vsdurchmesser2) {
        this.vsdurchmesser2 = vsdurchmesser2;
    }

    public String getMaterial2() {
        return material2;
    }

    public void setMaterial2(String material2) {
        this.material2 = material2;
    }

    public Double getWaaglaenge2() {
        return waaglaenge2;
    }

    public void setWaaglaenge2(Double waaglaenge2) {
        this.waaglaenge2 = waaglaenge2;
    }

    public Double getSenkrlaenge2() {
        return senkrlaenge2;
    }

    public void setSenkrlaenge2(Double senkrlaenge2) {
        this.senkrlaenge2 = senkrlaenge2;
    }

    public Double getAnschlusshoehe2() {
        return anschlusshoehe2;
    }

    public void setAnschlusshoehe2(Double anschlusshoehe2) {
        this.anschlusshoehe2 = anschlusshoehe2;
    }

    public String getBoegen902() {
        return boegen902;
    }

    public void setBoegen902(String boegen902) {
        this.boegen902 = boegen902;
    }

    public String getBoegen452() {
        return boegen452;
    }

    public void setBoegen452(String boegen452) {
        this.boegen452 = boegen452;
    }

    public Boolean getIsoliert3() {
        return isoliert3;
    }

    public void setIsoliert3(Boolean isoliert3) {
        this.isoliert3 = isoliert3;
    }

    public Double getVsdurchmesser3() {
        return vsdurchmesser3;
    }

    public void setVsdurchmesser3(Double vsdurchmesser3) {
        this.vsdurchmesser3 = vsdurchmesser3;
    }

    public String getMaterial3() {
        return material3;
    }

    public void setMaterial3(String material3) {
        this.material3 = material3;
    }

    public Double getWaaglaenge3() {
        return waaglaenge3;
    }

    public void setWaaglaenge3(Double waaglaenge3) {
        this.waaglaenge3 = waaglaenge3;
    }

    public Double getSenkrlaenge3() {
        return senkrlaenge3;
    }

    public void setSenkrlaenge3(Double senkrlaenge3) {
        this.senkrlaenge3 = senkrlaenge3;
    }

    public Double getAnschlusshoehe3() {
        return anschlusshoehe3;
    }

    public void setAnschlusshoehe3(Double anschlusshoehe3) {
        this.anschlusshoehe3 = anschlusshoehe3;
    }

    public String getBoegen903() {
        return boegen903;
    }

    public void setBoegen903(String boegen903) {
        this.boegen903 = boegen903;
    }

    public String getBoegen453() {
        return boegen453;
    }

    public void setBoegen453(String boegen453) {
        this.boegen453 = boegen453;
    }

    public String getHersteller1() {
        return hersteller1;
    }

    public void setHersteller1(String hersteller1) {
        this.hersteller1 = hersteller1;
    }

    public String getTyp1() {
        return typ1;
    }

    public void setTyp1(String typ1) {
        this.typ1 = typ1;
    }

    public String getLeistung1() {
        return leistung1;
    }

    public void setLeistung1(String leistung1) {
        this.leistung1 = leistung1;
    }

    public String getBrennstoff1() {
        return brennstoff1;
    }

    public void setBrennstoff1(String brennstoff1) {
        this.brennstoff1 = brennstoff1;
    }

    public Integer getBaujahr1() {
        return baujahr1;
    }

    public void setBaujahr1(Integer baujahr1) {
        this.baujahr1 = baujahr1;
    }

    public String getZuluft1() {
        return zuluft1;
    }

    public void setZuluft1(String zuluft1) {
        this.zuluft1 = zuluft1;
    }

    public Integer getAufstellungsjahr1() {
        return aufstellungsjahr1;
    }

    public void setAufstellungsjahr1(Integer aufstellungsjahr1) {
        this.aufstellungsjahr1 = aufstellungsjahr1;
    }

    public String getRaum1() {
        return raum1;
    }

    public void setRaum1(String raum1) {
        this.raum1 = raum1;
    }

    public String getGeschoss1() {
        return geschoss1;
    }

    public void setGeschoss1(String geschoss1) {
        this.geschoss1 = geschoss1;
    }

    public String getBenuetzung1() {
        return benuetzung1;
    }

    public void setBenuetzung1(String benuetzung1) {
        this.benuetzung1 = benuetzung1;
    }

    public String getHersteller2() {
        return hersteller2;
    }

    public void setHersteller2(String hersteller2) {
        this.hersteller2 = hersteller2;
    }

    public String getTyp2() {
        return typ2;
    }

    public void setTyp2(String typ2) {
        this.typ2 = typ2;
    }

    public String getLeistung2() {
        return leistung2;
    }

    public void setLeistung2(String leistung2) {
        this.leistung2 = leistung2;
    }

    public String getBrennstoff2() {
        return brennstoff2;
    }

    public void setBrennstoff2(String brennstoff2) {
        this.brennstoff2 = brennstoff2;
    }

    public Integer getBaujahr2() {
        return baujahr2;
    }

    public void setBaujahr2(Integer baujahr2) {
        this.baujahr2 = baujahr2;
    }

    public String getZuluft2() {
        return zuluft2;
    }

    public void setZuluft2(String zuluft2) {
        this.zuluft2 = zuluft2;
    }

    public Integer getAufstellungsjahr2() {
        return aufstellungsjahr2;
    }

    public void setAufstellungsjahr2(Integer aufstellungsjahr2) {
        this.aufstellungsjahr2 = aufstellungsjahr2;
    }

    public String getRaum2() {
        return raum2;
    }

    public void setRaum2(String raum2) {
        this.raum2 = raum2;
    }

    public String getGeschoss2() {
        return geschoss2;
    }

    public void setGeschoss2(String geschoss2) {
        this.geschoss2 = geschoss2;
    }

    public String getBenuetzung2() {
        return benuetzung2;
    }

    public void setBenuetzung2(String benuetzung2) {
        this.benuetzung2 = benuetzung2;
    }

    public String getHersteller3() {
        return hersteller3;
    }

    public void setHersteller3(String hersteller3) {
        this.hersteller3 = hersteller3;
    }

    public String getTyp3() {
        return typ3;
    }

    public void setTyp3(String typ3) {
        this.typ3 = typ3;
    }

    public String getLeistung3() {
        return leistung3;
    }

    public void setLeistung3(String leistung3) {
        this.leistung3 = leistung3;
    }

    public String getBrennstoff3() {
        return brennstoff3;
    }

    public void setBrennstoff3(String brennstoff3) {
        this.brennstoff3 = brennstoff3;
    }

    public Integer getBaujahr3() {
        return baujahr3;
    }

    public void setBaujahr3(Integer baujahr3) {
        this.baujahr3 = baujahr3;
    }

    public String getZuluft3() {
        return zuluft3;
    }

    public void setZuluft3(String zuluft3) {
        this.zuluft3 = zuluft3;
    }

    public Integer getAufstellungsjahr3() {
        return aufstellungsjahr3;
    }

    public void setAufstellungsjahr3(Integer aufstellungsjahr3) {
        this.aufstellungsjahr3 = aufstellungsjahr3;
    }

    public String getRaum3() {
        return raum3;
    }

    public void setRaum3(String raum3) {
        this.raum3 = raum3;
    }

    public String getGeschoss3() {
        return geschoss3;
    }

    public void setGeschoss3(String geschoss3) {
        this.geschoss3 = geschoss3;
    }

    public String getBenuetzung3() {
        return benuetzung3;
    }

    public void setBenuetzung3(String benuetzung3) {
        this.benuetzung3 = benuetzung3;
    }

    public String getPutztuerchen1() {
        return putztuerchen1;
    }

    public void setPutztuerchen1(String putztuerchen1) {
        this.putztuerchen1 = putztuerchen1;
    }

    public String getPutztuerchen2() {
        return putztuerchen2;
    }

    public void setPutztuerchen2(String putztuerchen2) {
        this.putztuerchen2 = putztuerchen2;
    }

    public String getPutztuerchen3() {
        return putztuerchen3;
    }

    public void setPutztuerchen3(String putztuerchen3) {
        this.putztuerchen3 = putztuerchen3;
    }
}
