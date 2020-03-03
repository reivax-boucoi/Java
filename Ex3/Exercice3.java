/*
    To compile and execute, run : 
    javac Exercice3.java && java Exercice3
*/

import java.util.ArrayList;

class Voiture34{ // non public class to fit in a single file project
    
    public Voiture34(){
        listeVoitures.add(this);
        nbVoitures++;
    };
    
    private char nom;
    private static int nbVoitures=0;
    private static ArrayList<Voiture34> listeVoitures = new ArrayList<Voiture34>();
    
    public char getName(){
        return nom;
    };
    public void setName(char nom){
        this.nom=nom;
    };
    
    public static int getNbVoitures(){
        return nbVoitures;
    };
    public static ArrayList<Voiture34> getVoiture34(){
        return listeVoitures;
    };
}


class Exercice3{
    public static void main(String[] argv){
    
        Voiture34 voiture1=new Voiture34();
        voiture1.setName('A');
        
        Voiture34 voiture2=new Voiture34();
        voiture2.setName('B');
        
        System.out.println("Nb voitures : " + Voiture34.getNbVoitures());
        
        for (Voiture34 v : Voiture34.getVoiture34()) {
            System.out.println("\t"+v.getName());
        }
    }
}
