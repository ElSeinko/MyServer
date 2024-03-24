package com.example.myserver;

import com.example.myserver.model.EntityFmendbefund;
import com.example.myserver.model.EntityFmerhebungsblatt;
import com.example.myserver.model.EntityKunde;
import com.example.myserver.model.EntityPruefprotokoll;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/erhebungsblatt")
public class ErhebungsblattController {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();
    Gson gson = new Gson();
    @GET
    @Path("/getWithId/{id}")
    public String getWithId(@PathParam("id") int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        EntityFmerhebungsblatt eg = em.find(EntityFmerhebungsblatt.class, id);
        String json = gson.toJson(eg);
        em.getTransaction().commit();
        return json;
    }

//    @POST
//    @Path("/aendern")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public String aendern(String jsonString){
//        EntityFmerhebungsblatt ee = gson.fromJson(jsonString, EntityFmerhebungsblatt.class);
//        em = entityService.startTransaction();
//        Query query = em.createQuery("UPDATE EntityFmerhebungsblatt ee SET ee = :endbefund where ee.befundnr = :endbefundBefundnr");
//        query.setParameter("endbefund", ee).setParameter("endbefundBefundnr", ee.getBefundnr()).executeUpdate();
//        entityService.commitTransaction();
//        return "true";
//
//    }

    @GET
    @Path("/getAll")
    public String getAll(){
        em.getTransaction().begin();
        List<EntityFmerhebungsblatt> list = em.createQuery("Select eb from EntityFmerhebungsblatt eb").getResultList();
        String listJson = gson.toJson(list);
        em.getTransaction().commit();
        return listJson;
    }

    @POST
    @Path("/neu")
    @Consumes(MediaType.APPLICATION_JSON)
    public String neu(String jsonString){
        EntityFmerhebungsblatt eb = gson.fromJson(jsonString, EntityFmerhebungsblatt.class);
        em.getTransaction().begin();
        em.persist(eb);
        em.flush();
        em.getTransaction().commit();
        return "true";

    }

    @GET
    @Path("/getWithAuftragId/{auftragid}")
    public String getWithAuftragId(@PathParam("auftragid") int auftragid) {
        em.getTransaction().begin();
        Query query = em.createQuery("select e from EntityFmerhebungsblatt e WHERE e.auftragid = :auftragid");
        query.setParameter("auftragid", auftragid);
        List<EntityFmerhebungsblatt> list = query.getResultList();
        String json = gson.toJson(list.get(0));
        em.getTransaction().commit();
        return json;
    }

    @POST
    @Path("/update")
    public String update(String jsonString){
        EntityFmerhebungsblatt formular = gson.fromJson(jsonString, EntityFmerhebungsblatt.class);
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE EntityFmerhebungsblatt e SET "
                + "e.auftragid = :auftragid, "
                + "e.email = :email, "
                + "e.wasseraufbereitung = :wasseraufbereitung, "
                + "e.notschalter = :notschalter, "
                + "e.feuerloescher = :feuerloescher, "
                + "e.explosionsklappe = :explosionsklappe, "
                + "e.fussbodenunterhalb = :fussbodenunterhalb, "
                + "e.sicherheitsabstaende = :sicherheitsabstaende, "
                + "e.kaminabziehen = :kaminabziehen, "
                + "e.b8201 = :b8201, "
                + "e.feuerloeschergeprueft = :feuerloeschergeprueft, "
                + "e.maengel = :maengel, "
                + "e.fangbaustoff1 = :fangbaustoff1, "
                + "e.marketyp1 = :marketyp1, "
                + "e.hoeheueberdach1 = :hoeheueberdach1, "
                + "e.fangaufsatz1 = :fangaufsatz1, "
                + "e.fangausfuehrungsart1 = :fangausfuehrungsart1, "
                + "e.laenge1 = :laenge1, "
                + "e.durchmesser1 = :durchmesser1, "
                + "e.kehrtuerchen1 = :kehrtuerchen1, "
                + "e.bodennichtbrennbar1 = :bodennichtbrennbar1, "
                + "e.ugaenglichkeit1 = :ugaenglichkeit1, "
                + "e.betriebsdicht1 = :betriebsdicht1, "
                + "e.fangbaustoff2 = :fangbaustoff2, "
                + "e.marketyp2 = :marketyp2, "
                + "e.hoeheueberdach2 = :hoeheueberdach2, "
                + "e.fangaufsatz2 = :fangaufsatz2, "
                + "e.fangausfuehrungsart2 = :fangausfuehrungsart2, "
                + "e.laenge2 = :laenge2, "
                + "e.durchmesser2 = :durchmesser2, "
                + "e.kehrtuerchen2 = :kehrtuerchen2, "
                + "e.bodennichtbrennbar2 = :bodennichtbrennbar2, "
                + "e.ugaenglichkeit2 = :ugaenglichkeit2, "
                + "e.betriebsdicht2 = :betriebsdicht2, "
                + "e.fangbaustoff3 = :fangbaustoff3, "
                + "e.marketyp3 = :marketyp3, "
                + "e.hoeheueberdach3 = :hoeheueberdach3, "
                + "e.fangaufsatz3 = :fangaufsatz3, "
                + "e.fangausfuehrungsart3 = :fangausfuehrungsart3, "
                + "e.laenge3 = :laenge3, "
                + "e.durchmesser3 = :durchmesser3, "
                + "e.kehrtuerchen3 = :kehrtuerchen3, "
                + "e.bodennichtbrennbar3 = :bodennichtbrennbar3, "
                + "e.ugaenglichkeit3 = :ugaenglichkeit3, "
                + "e.betriebsdicht3 = :betriebsdicht3, "
                + "e.isoliert1 = :isoliert1, "
                + "e.vsdurchmesser1 = :vsdurchmesser1, "
                + "e.material1 = :material1, "
                + "e.waaglaenge1 = :waaglaenge1, "
                + "e.senkrlaenge1 = :senkrlaenge1, "
                + "e.anschlusshoehe1 = :anschlusshoehe1, "
                + "e.boegen901 = :boegen901, "
                + "e.boegen451 = :boegen451, "
                + "e.isoliert2 = :isoliert2, "
                + "e.vsdurchmesser2 = :vsdurchmesser2, "
                + "e.material2 = :material2, "
                + "e.waaglaenge2 = :waaglaenge2, "
                + "e.senkrlaenge2 = :senkrlaenge2, "
                + "e.anschlusshoehe2 = :anschlusshoehe2, "
                + "e.boegen902 = :boegen902, "
                + "e.boegen452 = :boegen452, "
                + "e.isoliert3 = :isoliert3, "
                + "e.vsdurchmesser3 = :vsdurchmesser3, "
                + "e.material3 = :material3, "
                + "e.waaglaenge3 = :waaglaenge3, "
                + "e.senkrlaenge3 = :senkrlaenge3, "
                + "e.anschlusshoehe3 = :anschlusshoehe3, "
                + "e.boegen903 = :boegen903, "
                + "e.boegen453 = :boegen453, "
                + "e.hersteller1 = :hersteller1, "
                + "e.typ1 = :typ1, "
                + "e.leistung1 = :leistung1, "
                + "e.brennstoff1 = :brennstoff1, "
                + "e.baujahr1 = :baujahr1, "
                + "e.zuluft1 = :zuluft1, "
                + "e.aufstellungsjahr1 = :aufstellungsjahr1, "
                + "e.raum1 = :raum1, "
                + "e.geschoss1 = :geschoss1, "
                + "e.benuetzung1 = :benuetzung1, "
                + "e.hersteller2 = :hersteller2, "
                + "e.typ2 = :typ2, "
                + "e.leistung2 = :leistung2, "
                + "e.brennstoff2 = :brennstoff2, "
                + "e.baujahr2 = :baujahr2, "
                + "e.zuluft2 = :zuluft2, "
                + "e.aufstellungsjahr2 = :aufstellungsjahr2, "
                + "e.raum2 = :raum2, "
                + "e.geschoss2 = :geschoss2, "
                + "e.benuetzung2 = :benuetzung2, "
                + "e.hersteller3 = :hersteller3, "
                + "e.typ3 = :typ3, "
                + "e.leistung3 = :leistung3, "
                + "e.brennstoff3 = :brennstoff3, "
                + "e.baujahr3 = :baujahr3, "
                + "e.zuluft3 = :zuluft3, "
                + "e.aufstellungsjahr3 = :aufstellungsjahr3, "
                + "e.raum3 = :raum3, "
                + "e.geschoss3 = :geschoss3, "
                + "e.benuetzung3 = :benuetzung3, "
                + "e.putztuerchen1 = :putztuerchen1, "
                + "e.putztuerchen2 = :putztuerchen2, "
                + "e.putztuerchen3 = :putztuerchen3, "
                + "e.imgsignature = :signature "
                + "WHERE e.fmerhebungsblattid = :fmerhebungsblattid");
        query.setParameter("fmerhebungsblattid", formular.getFmerhebungsblattid());
        query.setParameter("auftragid", formular.getAuftragid());
        query.setParameter("email", formular.getEmail());
        query.setParameter("wasseraufbereitung", formular.getWasseraufbereitung());
        query.setParameter("notschalter", formular.getNotschalter());
        query.setParameter("feuerloescher", formular.getFeuerloescher());
        query.setParameter("explosionsklappe", formular.getExplosionsklappe());
        query.setParameter("fussbodenunterhalb", formular.getFussbodenunterhalb());
        query.setParameter("sicherheitsabstaende", formular.getSicherheitsabstaende());
        query.setParameter("kaminabziehen", formular.getKaminabziehen());
        query.setParameter("b8201", formular.getB8201());
        query.setParameter("feuerloeschergeprueft", formular.getFeuerloeschergeprueft());
        query.setParameter("maengel", formular.getMaengel());
        query.setParameter("fangbaustoff1", formular.getFangbaustoff1());
        query.setParameter("marketyp1", formular.getMarketyp1());
        query.setParameter("hoeheueberdach1", formular.getHoeheueberdach1());
        query.setParameter("fangaufsatz1", formular.getFangaufsatz1());
        query.setParameter("fangausfuehrungsart1", formular.getFangausfuehrungsart1());
        query.setParameter("laenge1", formular.getLaenge1());
        query.setParameter("durchmesser1", formular.getDurchmesser1());
        query.setParameter("kehrtuerchen1", formular.getKehrtuerchen1());
        query.setParameter("bodennichtbrennbar1", formular.getBodennichtbrennbar1());
        query.setParameter("ugaenglichkeit1", formular.getUgaenglichkeit1());
        query.setParameter("betriebsdicht1", formular.getBetriebsdicht1());
        query.setParameter("fangbaustoff2", formular.getFangbaustoff2());
        query.setParameter("marketyp2", formular.getMarketyp2());
        query.setParameter("hoeheueberdach2", formular.getHoeheueberdach2());
        query.setParameter("fangaufsatz2", formular.getFangaufsatz2());
        query.setParameter("fangausfuehrungsart2", formular.getFangausfuehrungsart2());
        query.setParameter("laenge2", formular.getLaenge2());
        query.setParameter("durchmesser2", formular.getDurchmesser2());
        query.setParameter("kehrtuerchen2", formular.getKehrtuerchen2());
        query.setParameter("bodennichtbrennbar2", formular.getBodennichtbrennbar2());
        query.setParameter("ugaenglichkeit2", formular.getUgaenglichkeit2());
        query.setParameter("betriebsdicht2", formular.getBetriebsdicht2());
        query.setParameter("fangbaustoff3", formular.getFangbaustoff3());
        query.setParameter("marketyp3", formular.getMarketyp3());
        query.setParameter("hoeheueberdach3", formular.getHoeheueberdach3());
        query.setParameter("fangaufsatz3", formular.getFangaufsatz3());
        query.setParameter("fangausfuehrungsart3", formular.getFangausfuehrungsart3());
        query.setParameter("laenge3", formular.getLaenge3());
        query.setParameter("durchmesser3", formular.getDurchmesser3());
        query.setParameter("kehrtuerchen3", formular.getKehrtuerchen3());
        query.setParameter("bodennichtbrennbar3", formular.getBodennichtbrennbar3());
        query.setParameter("ugaenglichkeit3", formular.getUgaenglichkeit3());
        query.setParameter("betriebsdicht3", formular.getBetriebsdicht3());
        query.setParameter("isoliert1", formular.getIsoliert1());
        query.setParameter("vsdurchmesser1", formular.getVsdurchmesser1());
        query.setParameter("material1", formular.getMaterial1());
        query.setParameter("waaglaenge1", formular.getWaaglaenge1());
        query.setParameter("senkrlaenge1", formular.getSenkrlaenge1());
        query.setParameter("anschlusshoehe1", formular.getAnschlusshoehe1());
        query.setParameter("boegen901", formular.getBoegen901());
        query.setParameter("boegen451", formular.getBoegen451());
        query.setParameter("isoliert2", formular.getIsoliert2());
        query.setParameter("vsdurchmesser2", formular.getVsdurchmesser2());
        query.setParameter("material2", formular.getMaterial2());
        query.setParameter("waaglaenge2", formular.getWaaglaenge2());
        query.setParameter("senkrlaenge2", formular.getSenkrlaenge2());
        query.setParameter("anschlusshoehe2", formular.getAnschlusshoehe2());
        query.setParameter("boegen902", formular.getBoegen902());
        query.setParameter("boegen452", formular.getBoegen452());
        query.setParameter("isoliert3", formular.getIsoliert3());
        query.setParameter("vsdurchmesser3", formular.getVsdurchmesser3());
        query.setParameter("material3", formular.getMaterial3());
        query.setParameter("waaglaenge3", formular.getWaaglaenge3());
        query.setParameter("senkrlaenge3", formular.getSenkrlaenge3());
        query.setParameter("anschlusshoehe3", formular.getAnschlusshoehe3());
        query.setParameter("boegen903", formular.getBoegen903());
        query.setParameter("boegen453", formular.getBoegen453());
        query.setParameter("hersteller1", formular.getHersteller1());
        query.setParameter("typ1", formular.getTyp1());
        query.setParameter("leistung1", formular.getLeistung1());
        query.setParameter("brennstoff1", formular.getBrennstoff1());
        query.setParameter("baujahr1", formular.getBaujahr1());
        query.setParameter("zuluft1", formular.getZuluft1());
        query.setParameter("aufstellungsjahr1", formular.getAufstellungsjahr1());
        query.setParameter("raum1", formular.getRaum1());
        query.setParameter("geschoss1", formular.getGeschoss1());
        query.setParameter("benuetzung1", formular.getBenuetzung1());
        query.setParameter("hersteller2", formular.getHersteller2());
        query.setParameter("typ2", formular.getTyp2());
        query.setParameter("leistung2", formular.getLeistung2());
        query.setParameter("brennstoff2", formular.getBrennstoff2());
        query.setParameter("baujahr2", formular.getBaujahr2());
        query.setParameter("zuluft2", formular.getZuluft2());
        query.setParameter("aufstellungsjahr2", formular.getAufstellungsjahr2());
        query.setParameter("raum2", formular.getRaum2());
        query.setParameter("geschoss2", formular.getGeschoss2());
        query.setParameter("benuetzung2", formular.getBenuetzung2());
        query.setParameter("hersteller3", formular.getHersteller3());
        query.setParameter("typ3", formular.getTyp3());
        query.setParameter("leistung3", formular.getLeistung3());
        query.setParameter("brennstoff3", formular.getBrennstoff3());
        query.setParameter("baujahr3", formular.getBaujahr3());
        query.setParameter("zuluft3", formular.getZuluft3());
        query.setParameter("aufstellungsjahr3", formular.getAufstellungsjahr3());
        query.setParameter("raum3", formular.getRaum3());
        query.setParameter("geschoss3", formular.getGeschoss3());
        query.setParameter("benuetzung3", formular.getBenuetzung3());
        query.setParameter("putztuerchen1", formular.getPutztuerchen1());
        query.setParameter("putztuerchen2", formular.getPutztuerchen2());
        query.setParameter("putztuerchen3", formular.getPutztuerchen3());
        query.setParameter("signature", formular.getImgsignature());

        query.executeUpdate();

        em.getTransaction().commit();
        return "true";
    }

}
