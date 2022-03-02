
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class Annee_Scolaire {
     String id;
    Date date_debut;
    Date date_fin;
    
    public Annee_Scolaire(){}
    
    public Annee_Scolaire(String id, Date date_debut, Date date_fin)
    {
        this.id = id;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }
    
    public String getid() 
    {
        return this.id;
    }
    
    public Date getdate_debut() 
    {
        return this.date_debut;
    }
    
    public Date getdate_fin() 
    {
        return this.date_fin;
    }

    public void setid(String id) 
    {
        this.id = id;
    }
    
    public void setdate_debut(Date date_debut) 
    {
        this.date_debut = date_debut;
    }
    
    public void setdate_fin(Date date_fin) 
    {
        this.date_fin = date_fin;
    }
}
