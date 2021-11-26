
/*15.	Create a library of methods for the calculation of basic statistics:
a.	Number of items within the specified range <x,y>
b.	Sum of numbers in the given range  <x,y>
c.	Arithmetic mean of the numbers in the given range  <x,y>
Then create a program that calculates and displays the basic statistics for integers in the range <5,10>

 */
public class Statistic

{
    static int numberOfItems(int x, int y){
    
        /*int[] range = new int[y-x+1];
    
        for (int i=0; i<range.length; i++){
            range[i] = x;
            x++;
            System.out.print(range[i]);
        
    }
    return range.length;*/
    
    return y-x+1;

    }
    
    static int sumOfNumber(int x, int y) {
        /*int sum = 0;
        for (int i=0; i<x-y; i++){
            sum= sum+1;
        System.out.println(sum); // czemu nic nie wypisuje w terminalu?
        }
        return sum;*/
        
        int[] arr = new int[y-x+1];
        int count = y-x;
        for (int i=0; i<=(count); i++){
            arr[i]=x;
            x++;
            System.out.println(arr[i]);
        }
        int sum =0;
        for(int t: arr){
            sum+=t;
        }
        return sum;
}


}
