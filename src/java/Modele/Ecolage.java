
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class Ecolage {
     String eleveid;
    double montant;
    String mois;
    String annee;
    Date date;
    String niveauid;
    double ecolage;
    
    public Ecolage(){}
    
    public Ecolage(String eleveid, double montant, String mois, String annee, Date date, String niveauid, double ecolage){
        this.eleveid = eleveid;
        this.montant = montant;
        this.mois = mois;
        this.annee = annee;
        this.date = date;
        this.niveauid = niveauid;
        this.ecolage = ecolage;
    }
    
    public String geteleveid() {
        return this.eleveid;
    }
    
    public double getmontant() {
        return this.montant;
    }
    
    public String getmois() {
        return this.mois;
    }
    
    public String getannee() {
        return this.annee;
    }
    
    public Date getdate() {
        return this.date;
    }
    
    public String getniveauid() {
        return this.niveauid;
    }
    
    public double getecolage() {
        return this.ecolage;
    }
    
    public void seteleveid(String eleveid) {
        this.eleveid = eleveid;
    }
    
    public void setmontant(double montant){
        this.montant = montant;
    }
    
    public void setmois(String mois){
        this.mois = mois;
    }
    
    public void setannee(String annee){
        this.annee = annee;
    }
    
    public void setdate(Date date) {
        this.date = date;
    }
    
    public void setniveauid(String niveauid) {
        this.niveauid = niveauid;
    }
    
    public void setecolage(double ecolage)
    {
        this.ecolage = ecolage;
    }
}
