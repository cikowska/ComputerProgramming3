
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    
      
    public static void main(String[] args){
        DrivingLicense driv1 = new DrivingLicense();
        driv1.setName("kUBA");
        driv1.setSurname("Nowak");
        driv1.setAddress("Kowalska 7");
        driv1.setPostalCode("17-100");
        driv1.setCity("Bielsk Podlaski");
        driv1.setLicenseNumber(12345);
        driv1.setYearOfIssue(2025);
        driv1.setCategory("B");
        System.out.println(driv1);
        
        Product prod1 = new Product();
        prod1.setName("Ser");
        prod1.setVege(true);
        System.out.println(prod1);
        
        
    }
}
