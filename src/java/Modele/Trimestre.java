
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class Trimestre {
    String id;
    String typeid;
    Date date_debut;
    Date date_fin;
    String anne_scolaireid;
    
    public Trimestre(){}
    
    public Trimestre(String id, String typeid, Date date_debut, Date date_fin, String anne_scolaireid)
    {
        this.id = id;
        this.typeid = typeid;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.anne_scolaireid = anne_scolaireid;
    }
    
    public String getid() 
    {
        return this.id;
    }
    
    public String gettypeid() 
    {
        return this.typeid;
    }
    
    public Date getdate_debut() 
    {
        return this.date_debut;
    }
    
    public Date getdate_fin() 
    {
        return this.date_fin;
    }
    
    public String getanne_scolaireid() 
    {
        return this.anne_scolaireid;
    }
    
    public void setdd(String id) 
    {
        this.id = id;
    }
    
    public void settypeid(String typeid) 
    {
        this.typeid = typeid;
    }
    
    public void setdate_debut(Date date_debut) 
    {
        this.date_debut = date_debut;
    }
    
    public void setdate_fin(Date date_fin) 
    {
        this.date_fin = date_fin;
    }
    
    public void setanne_scolaireid(String anne_scolaireid) 
    {
        this.anne_scolaireid = anne_scolaireid;
    }
}
