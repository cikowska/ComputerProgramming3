
/*17.	The following definition of the StudentGrades class allows the storage
 of a student's grades.
public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
}
Complete the class with methods that:
a.	calculates of the lowest grade
b.	calculates of the highest grade
c.	calculates of the number of grades
d.	calculates of the grade point average
e.	displays student’s record with student’s name, a list of the
student's grades, number of grades, lowest grade, highest grade, and grade
point average

Then, write a program that creates grades for two students:
f.	Amanda: 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5
g.	James: 2.0, 3.0, 2.0, 4.5, 4.5
Tip: pass student's grades to the constructor, as an array, in curly brackets,
 e.g. StudentGrades({5.0, 3.5}).
 
 18.	Add the constructor StudentGrades(String name, int numberOfGrades)
 to the StudentGrade class, which allows you to randomly create the given
 number of student grades. Tip: use the random number generator, which is
 available in the Random class.
 See the manual for more information. 
 
 19.	Add the constructor StudentGrades(String name) that allows you to
 enter student’s grades from the keyboard. Tip: use the Scanner class.
 See the manual for more information. 

     */
    
    import java.util.Random;
    import java.util.Scanner;
    import java.util.Locale;
    public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        double arrGrades[] = new double[]{2.0,2.5,3.0,3.5,4.0,4.5,5.0};
        Random random = new Random();
        double arr[] = new double[numberOfGrades];
        for (int i=0; i < numberOfGrades ;i++){
            int randomIndex = random.nextInt(arrGrades.length);// double od 0.0 do 1.0 - co z tym zrobić?
            arr[i]=arrGrades[randomIndex];
        
        }
        this.grades = arr;
        String sGrades = "";
        for (double g : arr){
            sGrades+=String.valueOf(g)+", ";
    }
    System.out.println(sGrades);
}
    StudentGrades(String name){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("Enter grade (max 10 grades, enter 0 to stop)");
        double[] grades = new double[10];//---> zrobić kiedyś array list
        int i = 0;
        double grade = scan.nextDouble();
        while(grade != 0) {
            grades[i] = grade;
            grade = scan.nextDouble();
            i++;
        }
        
        // jak dużo razy ma się wywołać, jak wprowadzić to do array?
        
        System.out.println(grade);
    }
    public double lowestGrade(){
        double can = grades[0];
        for (double g: grades){
            if (can>g){
                can = g;
            }
            
        }
        System.out.println(can);
    return can;
    }
    
    public double highestGrade(){
        double can = grades[0];
        for (double g: grades){
            if (can<g){
                can = g;
            }
            
        }
        System.out.println(can);
    return can;
    }
    
    public int numberOfGrades(){
        System.out.println("number of grades "+grades.length);
        return grades.length;
    }
    
    public double gpa(){
        double sum = 0;
        for (double s: grades){
            sum+=s;
        }
        double gpa = sum/numberOfGrades();
        System.out.println("gpa "+gpa);
        return gpa;
    }
    
    public static void main(String[] args){
        double kubaGrades[] ={3.5,4.5,4.0,5.0,3.0};
        StudentGrades stud1 =new StudentGrades("Kuba",kubaGrades);
        stud1.lowestGrade();
        stud1.highestGrade();
        stud1.numberOfGrades();
        stud1.gpa();
        System.out.println(kubaGrades);
        StudentGrades stud2 = new StudentGrades("Kama", 5);
        StudentGrades stud3 = new StudentGrades("Adam");
        StudentGrades stud4 = new StudentGrades("Michał", 5);
    }
}