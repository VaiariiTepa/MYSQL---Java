/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_project;

/**
 *
 * @author Vaiarii_Tepa
 */
public class Personne {
    private String nom;
    private String prenom;
    private int age;
    
    /**
     * Personne // équivalent contructeur
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    /**
     * Constructeur par default
     */
    public Personne(){
        
    }
    
    /**
     * Récupere le nom
     * @return 
     */
    public String getNom(){
        return this.nom;
    }
    
    /**
     * Enregistre le nom
     */
    public void setNom(String nom){
        this.nom = nom;
    }
    
    /**
     * Récupere le prenom
     * @return 
     */
    public String getPrenom(){
        return this.prenom;
    }
    
    /**
     * Enregistre le Prenom
     */
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    /**
     * Récupere l'age
     * @return 
     */
    public int getAge(){
        return this.age;
    }
    
    /**
     * Enregistre l'age
     */
    public void setAge(int age){
        this.age = age;
    }
    
}
