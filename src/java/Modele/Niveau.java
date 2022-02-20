
package Modele;

/**
 *
 * @author Keeevv
 */
public class Niveau {
    String id;
    String nom;
    String ecolage;
    
    public Niveau(){}
    
    public Niveau(String id, String nom, String ecolage){
        this.id = id;
        this.nom = nom;
        this.ecolage = ecolage;
    }
    
    public String getid(){
        return this.id;
    }
    
    public String getnom(){
        return this.nom;
    }
    
    public String getecolage(){
        return this.ecolage;
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    public void setnom(String nom){
        this.nom = nom;
    }
    
    public void setecolage(String ecolage){
        this.ecolage = ecolage;
    }
}


