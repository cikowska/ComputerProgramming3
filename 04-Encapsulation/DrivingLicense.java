
/*5.	Find an image of a driving license on the Internet. Take a look at what information the driving license contains.
 Then define the DrivingLicense class, containing the following attributes: driver's name and surname, address, postal code,
 city, driving license number, year of issue and driving license category. Use private access modifiers when declaring
 attributes. Then create a driving license and try to assign values to the attributes. What message are you getting?
 After that, change the access modifiers from private to public and try to assign values once again. 
 
 7.	Apply the private access modifier to all attributes of the DriverLicense class. Then create the get and set methods
 for each of the attributes. After that, modify the program and the method displaying the driving license. Replace attributes
 names with get and set methods. 
 */
public class DrivingLicense
{
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int licenseNumber;
    private int yearOfIssue;
    private String category;
    
    
    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getPostalCode(){
        return this.postalCode;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public int getLicenseNumber(){
        return this.licenseNumber;
    }
    
    public int getYearOfIssue(){
        return this.yearOfIssue;
    }
    
    public String getCategory(){
        return this.category;
    }
    
    
    /*10.	Modify the setName() method in the DrivingLicense. Regardless of the given name value,
     * the value of the attribute should begin with a capital letter. Replace the remaining letters with lowercase.
     * Then check the method in action. Tip. Use the methods available in the String class. */
    
    public void setName(String name){
        name = name.toLowerCase();
        String rest = name.substring(1,name.length());
        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        this.name = firstLetter + rest;
    }
    
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPostalCode(String postal){
        this.postalCode = postal;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setLicenseNumber(int license){
        this.licenseNumber = license;
    }
    
    /*9.	In the DrivingLicense class, modify the setter method for the year of issue attribute.
     * The valid value of the attribute should be greater than or equal to 1980 and less than or equal to the current year.
     * If the given value is different, do not change the attribute. */
    
    
    public void setYearOfIssue(int year){
        if (year>= 1980 && year<=2021){
            this.yearOfIssue = year;
        }
        
    }
    
    public void setCategory(String category){
         this.category = category;
    }
    
    /*8.	Add a toString() method in the DrivingLicense class to return driving license information.
     * Use getter methods to get the driving license data. Then check the method in action. */
    
    public void display(){
        System.out.println("Name: "+this.name+"\n"+
        " Surname: "+this.surname+"\n"+
        " Address: "+this.address+"\n"+
        " Postal code: "+this.postalCode+"\n"+
        " City: "+this.city+"\n"+
        " License number: "+this.licenseNumber+"\n"+
        " Year of issue: "+this.yearOfIssue+"\n"+
        " Category: "+this.category);
    }
    
    public String toString(){
        return "Name: "+this.getName()+"\n"+
        "Surname: "+this.getSurname()+"\n"+
        "Address: "+this.getAddress()+"\n"+
        "Postal code: "+this.getPostalCode()+"\n"+
        "City: "+this.getCity()+"\n"+
        "License number: "+this.getLicenseNumber()+"\n"+
        "Year of issue: "+this.getYearOfIssue()+"\n"+
        "Category: "+this.getCategory();
    }
  

 
    }


