
/*14.	Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit.
 * You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect. Then create a program that calculates
 * and displays the temperature:
a.	25 degrees Celsius in Kelvin and Fahrenheit
b.	100 degrees Fahrenheit in Kelvin and Celsius
c.	0 degrees Kelvin in Celsius and Fahrenheit

 */
public class TempConverter {
float degree;

    public float celciusToKelvin(float degree){
        float kelvin = this.degree + 273.15f;
        return kelvin;
    }
    
    public float celciusToFarenheit(){
        float farenheith = 32+9/5*this.degree;
        return farenheith;
    }
    
    public float farenheitToCelsius(float degree){
        float celsius = 5/9*(this.degree-32);
        return celsius;
    }
    
    public float kelvintoCelsius(float degree){
        float celsius = this.degree - 273.15f;
        return celsius;
    }
    
    public void main(String[] args) {
        celciusToFarenheit();
    }
   }
