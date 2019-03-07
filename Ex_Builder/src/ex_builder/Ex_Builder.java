

package ex_builder;

/**
 *
 * @author clamascabaleiro
 */
public class Ex_Builder {

 
    public static void main(String[] args) {
       Employee miEmployee;
       miEmployee = new EmployeeBuilder("juan" , 5)
               .setNewBirthYear(1997)
               .setNewLastName("perez")
               .createEmployee();
    }

}
