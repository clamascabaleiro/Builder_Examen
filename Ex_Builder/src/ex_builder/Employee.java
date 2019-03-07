package ex_builder;

/**
 *
 * @author clamascabaleiro
 */
public class Employee {
   private String lastName;
   private String middleName;
   private String firstName;
   private long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;
/* Constructor por defecto
   
   */
    public Employee() {
    }

   /* Constructor con todos los parametros
    
    */
   public Employee(
      final String newLastName,
      final String newMiddleName,
      final String newFirstName,
      final long newId,
      final int newBirthYear,
      final int newBirthMonth,
      final int newBirthDate,
      final int newHireYear,
      final int newHireMonth,
      final int newHireDate)
   {
      this.lastName = newLastName;
      this.middleName = newMiddleName;
      this.firstName = newFirstName;
      this.id = newId;
      this.birthYear = newBirthYear;
      this.birthMonth = newBirthMonth;
      this.birthDate = newBirthDate;
      this.hireYear = newHireYear;
      this.hireMonth = newHireMonth;
      this.hireDate = newHireDate;
   }
/* Setters
   
   */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }
/* Getters
    
    */
    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int getHireMonth() {
        return hireMonth;
    }

    public int getHireDate() {
        return hireDate;
    }
   
    
}
