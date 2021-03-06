package at.htl.survey.model;

import java.util.List;

public class Geraet {

    private int geraeteNr;
    private Raum raum;
    private List<Geraet> geraet;
    private Kategorie kategorie;
    private Firma firma;
    private boolean kabellos;
    private boolean austauschbar;
    private int partof;


    private String was;
    private String warum;

    public Geraet() {
    }

    public void setGeraeteNr(int geraeteNr) {
        this.geraeteNr = geraeteNr;
    }

    public int getPartof() {
        return partof;
    }

    public void setPartof(int partof) {
        this.partof = partof;
    }

    public Geraet(int geraeteNr, Raum raum, List<Geraet> geraet, Kategorie kategorie, Firma firma, boolean kabellos, boolean austauschbar, int partof) {
        this.geraeteNr = geraeteNr;
        this.raum = raum;
        this.geraet = geraet;
        this.kategorie = kategorie;
        this.firma = firma;
        this.kabellos = kabellos;
        this.austauschbar = austauschbar;
        this.partof = partof;
    }

    public String getWas() {
        return was;
    }

    public void setWas(String was) {
        this.was = was;
    }

    public String getWarum() {
        return warum;
    }

    public void setWarum(String warum) {
        this.warum = warum;
    }

    public int getGeraeteNr() {
        return geraeteNr;
    }

    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public List<Geraet> getGeraet() {
        return this.geraet;
    }

    public void setGeraet(List<Geraet> geraet) {
        this.geraet = geraet;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public boolean isKabellos() {
        return kabellos;
    }

    public void setKabellos(boolean kabellos) {
        this.kabellos = kabellos;
    }

    public boolean isAustauschbar() {
        return austauschbar;
    }

    public void setAustauschbar(boolean austauschbar) {
        this.austauschbar = austauschbar;
    }

    @Override
    public String toString() {
        return "Geraet{" +
                "geraeteNr=" + geraeteNr +
                ", raum=" + raum +
                ", geraet=" + geraet +
                ", kategorie=" + kategorie +
                ", firma=" + firma +
                ", kabellos=" + kabellos +
                ", austauschbar=" + austauschbar +
                ", partof=" + partof +
                ", was='" + was + '\'' +
                ", warum='" + warum + '\'' +
                '}';
    }
}
