package com.example.myserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mitarbeiter", schema = "public")
public class EntityMitarbeiter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "mitarbeiterid")
    private int mitarbeiterid;
    @Basic
    @Column(name = "vorname")
    private String vorname;
    @Basic
    @Column(name = "nachname")
    private String nachname;

    public int getMitarbeiterid() {
        return mitarbeiterid;
    }

    public void setMitarbeiterid(int mitarbeiterid) {
        this.mitarbeiterid = mitarbeiterid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityMitarbeiter that = (EntityMitarbeiter) o;

        if (mitarbeiterid != that.mitarbeiterid) return false;
        if (vorname != null ? !vorname.equals(that.vorname) : that.vorname != null) return false;
        if (nachname != null ? !nachname.equals(that.nachname) : that.nachname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mitarbeiterid;
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (nachname != null ? nachname.hashCode() : 0);
        return result;
    }
}
