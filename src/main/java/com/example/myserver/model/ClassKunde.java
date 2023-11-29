package com.example.myserver.model;



import java.util.Objects;


public class ClassKunde {

    private int kundeid;

    private String vorname;

    private String nachname;

    private Integer postleitzahl;

    private String ort;

    private String strasse;

    private Integer hausnummer;

    private Integer tuer;

    private Long telnummer;

    public ClassKunde() {
    }

    public ClassKunde(int kundeid, String vorname, String nachname, Integer postleitzahl, String ort, String strasse, Integer hausnummer, Integer tuer, Long telnummer) {
        this.kundeid = kundeid;
        this.vorname = vorname;
        this.nachname = nachname;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.tuer = tuer;
        this.telnummer = telnummer;
    }

    public int getKundeid() {
        return kundeid;
    }

    public void setKundeid(int kundeid) {
        this.kundeid = kundeid;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
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

    public Long getTelnummer() {
        return telnummer;
    }

    public void setTelnummer(Long telnummer) {
        this.telnummer = telnummer;
    }



    @Override
    public int hashCode() {
        return Objects.hash(kundeid, vorname, nachname, postleitzahl, ort, strasse, hausnummer, tuer, telnummer);
    }
}
