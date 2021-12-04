
/*15.	Create a library of methods for the calculation of basic statistics:
a.	Number of items within the specified range <x,y>
b.	Sum of numbers in the given range  <x,y>
c.	Arithmetic mean of the numbers in the given range  <x,y>
Then create a program that calculates and displays the basic statistics for
integers in the range <5,10>

 */
public class Statistic {
int x;
int y;
int number;
int sum=0;
double mean;

public Statistic(int x, int y){
    this.x = x;
    this.y = y;
}

    public int numberOfItems(){
      
        /*int[] range = new int[y-x+1];
    
        for (int i=0; i<range.length; i++){
            range[i] = x;
            x++;
            System.out.print(range[i]);
        
    }
    return range.length;*/
    this.number = y-x+1;
    return this.number;

    }
    
    public int sumOfNumber() {
       
        /*int sum = 0;
        for (int i=0; i<x-y; i++){
            sum= sum+1;
        System.out.println(sum); // czemu nic nie wypisuje w terminalu?
        }
        return sum;*/
        int a = x;
        int[] arr = new int[y-a+1];
        int count = y-a;
        for (int i=0; i<=(count); i++){
            arr[i]=a;
            a++;
        }
       
        for(int t: arr){
            this.sum+=t;
        }
        return this.sum;
}

public double arithmeticMean(){

   this.mean = ((double)sumOfNumber())/numberOfItems();
   return this.mean;
    
    
}

public void displayStatistics(){
    System.out.println("Basic statistics for range from "+this.x+" to "+
    this.y+" : number of items: "+this.number+" sum of items: "+this.sum+
    " avarage mean: "+this.mean);
}

public static void main(String[] args) {
    Statistic obj1 = new Statistic(5,10);
    //obj1.numberOfItems();
   //int b = obj1.numberOfItems();
    //System.out.println(b);
    //obj1.sumOfNumber();
    obj1.arithmeticMean();
    obj1.displayStatistics();
    
    
}

}
