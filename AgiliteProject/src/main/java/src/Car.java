package src;

import java.util.ArrayList;

/**
 * Décrivez votre classe Voiture ici.
 *
 * @author (Sarfati_Cohen)
 * @version (29/09/2022)
 */
public class Car 
{
    private int age;
    private double initialValue;
    private NumberPlate plaque;
    private ArrayList<String> piece;

    /**
     * Constructeur d'objets de classe Voiture
     */
    public Car()
    {
        // initialisation des variables d'instance
        this.age = 2;
        this.initialValue = 10000;
        this.plaque = new NumberPlate(this);
        this.setPiece(new ArrayList<String>());
    }

    /**
     * Méthode qui décrémente la valeur selon l'âge de la voiture
     *
     * @return la valeur de la voiture selon l'age
     */
    public double calculValeurActuelle()
    {
        return(this.initialValue*Math.pow((1.0-0.05),this.age));
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getValeur(){
        return this.initialValue;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public void setValeur(double v){
        this.initialValue = v;
    }
    
    public void setPlate(NumberPlate p){
        this.plaque = p;
    }
    
    public int getPlate(){
        return plaque.getNumber();
    }

	public ArrayList<String> getPiece() {
		return piece;
	}

	public void setPiece(ArrayList<String> piece) {
		this.piece = piece;
	}
    
	public void addPiece(String s) {
		this.piece.add(s);
	}
}
