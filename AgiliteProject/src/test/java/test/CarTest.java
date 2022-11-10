package test;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Car;
import src.NumberPlate;

/**
 * Classe-test VoitureTest.
 *
 * @Sarfati_Cohen
 * @05/10/2022
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class CarTest
{
    private Car car1;
    private NumberPlate numberPlate1;

    

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    
    

    /**
     * Constructeur de la classe-test VoitureTest
     */
    public CarTest()
    {
        Car v = new Car();
    }


    @Test
    public void ValeurTest(){
        double actuelle = this.car1.getValeur()*Math.pow((1.0-0.05),this.car1.getAge());
        assertEquals(this.car1.calculValeurActuelle(),actuelle);
    }
    
    @Test
    public void DetailTest(){
        assertEquals("Le numero de la voiture est : " + car1.getPlate() 
        + ", et elle vaut " + 9025.0,this.numberPlate1.detail());
    }
    
    @Test
    public void AddPieceTest() {
    	car1.addPiece("pneu");
    	assertEquals("pneu",car1.getPiece().get(0));
    }
    
    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        car1 = new Car();
        numberPlate1 = new NumberPlate(car1);
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

}

