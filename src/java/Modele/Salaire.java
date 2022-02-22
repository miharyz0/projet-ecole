
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class Salaire {
    String id;
    String profid;
    int mois;
    int annee;
    double montant;
    Date datepaiement;
    double horaire;
    double salairehoraire ;
    
    public Salaire(){}

    public Salaire(String id, String profid, int mois, int annee, double montant, Date datepaiement, double horaire, double salairehoraire)    
    {
        this.id = id;
        this.profid = profid;
        this.mois = mois;
        this.annee = annee;
        this.montant = montant;
        this.datepaiement = datepaiement;
        this.horaire = horaire;
        this.salairehoraire = salairehoraire;
    }
    
    public String getid() 
    {
        return id;
    }
    
    public String getprofid() 
    {
        return profid;
    }
    
    public int getmois() 
    {
        return this.mois;
    }
    
    public int getannee() 
    {
        return this.annee;
    }
    
    public double getmontant() 
    {
        return this.montant;
    }
    
    public Date getdatepaiement() 
    {
        return this.datepaiement;
    }
    
    public double gethoraire() 
    {
        return this.horaire;
    }
    
    public double getsalairehoraire() 
    {
        return this.salairehoraire;
    }
    
    public void setid(String id) 
    {
        this.id = id;
    }
    
    public void setprofid(String profid) 
    {
        this.profid = profid;
    }
    
    public void setmois(int mois) 
    {
        this.mois = mois;
    }
    
    public void setannee(int annee) 
    {
        this.annee = annee;
    }
    
    public void setmontant(double montant) 
    {
        this.montant = montant;
    }
    
    public void setdatepaiement(Date datepaiement) 
    {
        this.datepaiement = datepaiement;
    }
    
    public void sethoraire(double horaire) 
    {
        this.horaire = horaire;
    }
    
    public void setsalairehoraire(double salairehoraire) 
    {
        this.salairehoraire = salairehoraire;
    }
}
