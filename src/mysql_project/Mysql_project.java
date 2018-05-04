/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_project;
import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Vaiarii_Tepa
 */
public class Mysql_project {
    private static String nom_prompt;
    private static String prenom_prompt;
    private static int age;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    Prompt();
    }
    
    /**
    * Obtient une connexion à la base de données à partir
    * des paramètres spécifiés dans le fichier connect.conf
    * renvoie la connexion à la base de données
    */
    public static Connection getConnection() throws SQLException, IOException {

    String drivers = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/projet_java";
    String username = "java";
    String password = "java";

    return DriverManager.getConnection(url, username, password);
    }
    
    
    /**
     * Affiche les donnees
     * @param nom
     * @param prenom
     * @return 
     * @throws SQLException
     * @throws IOException 
     */
    public static boolean Select(String nom,String prenom) throws SQLException, IOException{
        
        Connection conn = getConnection();
        Statement stat = conn.createStatement();
        ResultSet resultat = stat.executeQuery("SELECT nom,prenom,age FROM utilisateur");

        while(resultat.next()) {
            System.out.println(resultat.getString("Nom")
                                    + " " + resultat.getString("Prenom")
                                    + " " + resultat.getInt("age"));
            String res_prenom = resultat.getString("Prenom");
            String res_nom = resultat.getString("Nom");
            
            if((res_prenom.equals(prenom))&&(res_nom.equals(nom))){
                System.out.println("Cette personne a déja été enregistrer :D");
            }else{
                CreatePerson();
            }
        
        }
        
        
        
        return true;
    }

    public static void Prompt() throws SQLException, IOException{
        
        nom_prompt = Keyin.inString("Nom :");

        prenom_prompt = Keyin.inString("Prenom :");
        age = Keyin.inInt("Age :");
        Select(nom_prompt,prenom_prompt);
    }
    
    /**
     * Inscription nouveaux client :D
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
     public static void CreatePerson() throws SQLException, IOException {
            Connection conn = getConnection();
            Statement stat = conn.createStatement();
            

            //personne.setNom(nom);
            stat.execute("INSERT INTO utilisateur (`nom`, `prenom`, `age`) VALUES ('"+nom_prompt+"','"+prenom_prompt+"',"+age+")");
            

        
    }
     
    /**
     *
     * @param id
     * @return
     */
    public static Personne getById(int id){
        
        return null;
    }
    
}
