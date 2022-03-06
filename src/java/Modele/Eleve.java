
package Modele;

/**
 *
 * @author Keeevv
 */
public class Eleve {
   String id;
    String nom;
    String prenom;
    String niveauid;
    
    public Eleve() {}
    
    public Eleve(String id, String nom, String prenom, String niveauid) 
    {
        this.id = id;    
        this.nom = nom;
        this.prenom = prenom;
        this.niveauid = niveauid;
    }
    
    public String getid() 
    {
        return this.id;
    }
    
    public String getnom() 
    {
        return this.nom;
    }
    
    public String getprenom() 
    {
        return this.prenom;
    }
    
    public String getniveauid() 
    {
        return this.niveauid;
    }
    
    public void setid(String id) 
    {
        this.id = id;
    }
    
    public void setnom(String nom) 
    {
        this.nom = nom;
    }
    
    public void setprenom(String prenom) 
    {
        this.prenom = prenom;
    }
    
    public void setniveauid(String niveauid) 
    {
        this.niveauid = niveauid;
    } 
}
