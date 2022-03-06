
package Modele;

/**
 *
 * @author Keeevv
 */
public class TypeNote {
    String id;
    String nom;

    public TypeNote(){}
    
    public TypeNote(String id, String nom)
    {
        this.id = id;
        this.nom = nom;
    }
    
    public String getid() 
    {
        return this.id;
    }
    
    public String getnom() 
    {
        return this.nom;
    }
    
    public void setid(String id) 
    {
        this.id = id;
    }
    
    public void setnom(String nom) 
    {
        this.nom = nom;
    }
}
