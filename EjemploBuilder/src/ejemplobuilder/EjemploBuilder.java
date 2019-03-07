

package ejemplobuilder;

/**
 *
 * @author clamascabaleiro
 */
public class EjemploBuilder {

 
    public static void main(String[] args) {
       Pizza miPizzaHawaiana;
       miPizzaHawaiana = new PizzaBuilder(500,350)
               .setGrPinha(150)
               .createPizza();
       
    }

}
