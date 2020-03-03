/*
    To compile and execute, run : 
    javac Exercice4.java && java Exercice4
*/

import java.util.ArrayList;

class Voiture{ // non public class to fit in a single file project
    
    private char nom;
    private double vitesse;
    private static int nbVoitures=0;
    private static ArrayList<Voiture> listeVoitures = new ArrayList<Voiture>();
    
    public Voiture(double vitesse){
        this.vitesse=vitesse;
        listeVoitures.add(this);
        nbVoitures++;
    };
    
    public double getVitesse(){
        return vitesse;
    };
    
    public void accelere(double increment){
        vitesse+=increment;
    };
    
    public char getName(){
        return nom;
    };
    public void setName(char nom){
        this.nom=nom;
    };
    
    public static ArrayList<Voiture> getVoitures(){
        return listeVoitures;
    };
}

class VehiculePrioritaire extends Voiture{

    boolean gyrophare=false;
    
    public VehiculePrioritaire(){
        super(2.0);
    };
    
    public void allumeGyrophare(){
        gyrophare=true;
        super.accelere(2.0);
    };
}

class Exercice4{
    public static void main(String[] argv){
    
        Voiture voiture1=new Voiture(1.0);
        voiture1.setName('A');
        
        VehiculePrioritaire vp1=new VehiculePrioritaire();
        vp1.setName('P');
        
        for (Voiture v : Voiture.getVoitures()) {
            System.out.println(v.getName()+" roule a "+v.getVitesse()+" km/h");
        }
        
        System.out.println("\r\nAllumage du gyrophare\r\n");
        vp1.allumeGyrophare();
        
        for (Voiture v : Voiture.getVoitures()) {
            System.out.println(v.getName()+" roule a "+v.getVitesse()+" km/h");
        }
    }
}
