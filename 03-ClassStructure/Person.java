
/**
 13.	Define a class Person for person’s record. The class should contain the attributes: name, weight (kg) and height (cm).
 Add constructors:
a.	Person(name)
b.	Person(name,weight,height)
Then add methods that represents the object's behaviors:
c.	setWeightAndHeight(weight,height)
d.	calculateBMI() – calculates Body Mass Index 
e.	displayRecord() – displays full info (name, weight, height, and BMI)
The correct BMI value is 18.5 to 24.9. When displaying a person’s record, if the BMI is too low, display the message: "BMI too low".
 When the index is too high, display the message: "BMI too high". Write a program, create three persons and display their records.

 */
public class Person
{
   String name;
   float weight;
   float height;
  
    public Person(String name)
    {
       this.name = name;
    }
    public Person(String name, float weight, float height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

   public void setWeightAndHeight(float weight,float height){
       this.weight = weight;
       this.height = height;
   }
   
    public float calculateBMI()
    {
        float bmi = this.weight/((this.height/100)*(this.height/100));
        return bmi;
    }
    public void displayRecord() {
        float bmi = calculateBMI();
        String message = "";
        if (bmi<18.5f) {
            message = "BMI is too low";
        }
        else if (bmi>24.9f) {
            message = "BMI is to high";
        }
        else{
            message = message;
        }
        System.out.println(name+" "+"weight "+weight+" kg "+"height "+height+" cm "+"BMI "+bmi+" "+message);
    }
    
    public static void main(String[] args) {
        Person person1 = new Person("Kuba",95.3f, 175.0f);
        person1.displayRecord();
        
        Person person2 = new Person("Magda",56.4f, 165.0f);
        person2.displayRecord();
        
        Person person3 = new Person("Adam",56.4f, 180.0f);
        person3.displayRecord();
    }
}
