
package Modele;

/**
 *
 * @author Keeevv
 */
public class Horaire {
    String id;
    String profid;
    int horaire;
    double salairehoraire;
    
    public Horaire(){}
    
    public Horaire(String id, String profid, int horaire, double salairehoraire)
    {
        this.id = id;
        this.profid = profid;
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
    
    public int gethoraire() 
    {
        return horaire;
    }
    
    public double getsalairehoraire() 
    {
        return salairehoraire;
    }
    
    public void setid(String id) 
    {
        this.id = id;
    }
    
    public void setprofid(String profid) 
    {
        this.profid = profid;
    }
    
    public void sethoraire(int horaire) 
    {
        this.horaire = horaire;
    }
    
    public void setsalairehoraire(double salairehoraire) 
    {
        this.salairehoraire = salairehoraire;
    }
}
