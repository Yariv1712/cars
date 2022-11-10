package src;


/**
 * @Sarfati_Cohen 
 * @05/10/2022
 */
public class NumberPlate
{
    
    private static int number = 0;
    private Car v; 

    /**
     * Constructeur d'objets de classe PlaqueImmat
     */
    public NumberPlate(Car v)
    {
        // initialisation des variables d'instance
        number++;
        this.v = v;
        v.setPlate(this);
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setCar(Car v){
        this.v = v;
        v.setPlate(this);
    }
    
    public String detail(){
        double valeur = this.v.calculValeurActuelle();
        return("Le numero de la voiture est : " + this.number 
        + ", et elle vaut " + valeur);
    }
}
