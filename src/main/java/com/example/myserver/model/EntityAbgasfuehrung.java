package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "abgasfuehrung", schema = "public")
public class EntityAbgasfuehrung {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "abgasfuehrungid")
    private int abgasfuehrungid;
    @Basic
    @Column(name = "anforderung")
    private String anforderung;

    public int getAbgasfuehrungid() {
        return abgasfuehrungid;
    }

    public void setAbgasfuehrungid(int abgasfuehrungid) {
        this.abgasfuehrungid = abgasfuehrungid;
    }

    public String getAnforderung() {
        return anforderung;
    }

    public void setAnforderung(String anforderung) {
        this.anforderung = anforderung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityAbgasfuehrung that = (EntityAbgasfuehrung) o;

        if (abgasfuehrungid != that.abgasfuehrungid) return false;
        if (anforderung != null ? !anforderung.equals(that.anforderung) : that.anforderung != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = abgasfuehrungid;
        result = 31 * result + (anforderung != null ? anforderung.hashCode() : 0);
        return result;
    }
}
