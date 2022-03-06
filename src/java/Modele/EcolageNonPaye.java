
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class EcolageNonPaye {
     String nom;
    String niveau;
    double reste;
    String mois;
    String annee;
    Date date;
    
    public EcolageNonPaye(){}
    
    public EcolageNonPaye(String nom, String niveau, double reste, String mois, String annee, Date date)
    {
        this.nom = nom;
        this.niveau = niveau;
        this.reste = reste;
        this.mois = mois;
        this.annee = annee;
        this.date = date;
    }
    
    public String getnom() 
    {
        return this.nom;
    }
    
    public String getniveau() 
    {
        return this.niveau;
    }
    
    public double getreste() 
    {
        return this.reste;
    }
    
    public String getmois() 
    {
        return this.mois;
    }
    
    public String getannee() 
    {
        return this.annee;
    }
    
    public Date getdate() 
    {
        return this.date;
    }
    
    public void setnom(String nom) {
        this.nom = nom;
    }
    
    public void setniveau(String niveau) {
        this.niveau = niveau;
    }
    
    public void setreste(double reste) {
        this.reste = reste;
    }
    
    public void setmois(String mois) {
        this.mois = mois;
    }
    
    public void setannee(String annee) {
        this.annee = annee;
    }
    
    public void setdate(Date date) {
        this.date = date;
    }
}
