
/**
 * Write a description of class Main here.
 * 
 * @author Nadezhda Rusina 
 * @version CSC 142, Fall 2017
 */
public class Main
{
    public static void main(String[] args){
        Student newStud=new Student("Name","LastName","123456789",false,true,false);
        //Check the Student class
        System.out.println(newStud.toString());
        //Check the class department
        Department newDep=new Department();
        for(int i=0;i<98;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"333333333",true,false,false));
        }
        for(int i=0;i<51;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"444444444",false,true,false));
        }
        for(int i=0;i<27;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"555555555",false,false,true));
        }
        System.out.println(newDep.toString());
        
        // System.out.println("How to compare two variables with float point.");
        // double num1 = 10 / 3.0;
        // double num2 = 3.333334;
        // String s1 = String.format("%.2f", num1);
        // String s2 = String.format("%.2f", num2);
        // System.out. println(num1 + " = " + num2 + " is " + (num1 == num2));
        // System.out. println(num1 + " = " + num2 + " is " + s1.equals(s2));
    }
}
