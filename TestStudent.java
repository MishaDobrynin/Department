/**
 * Write a description of class TestStudent here.
 *
 * @author Misha Dobrynin
 * @version March 6, 2022
 */
public class TestStudent
{
    public static void main(String[] args){
        Student anonymous = new Student("Anonymously", "Anonymous", "172717271");
        Student doug = new Student("Doug", "Jones", "123456789", false, false, true);
        Student onetwo = new Student("one", "two", "123456789", true, true, false);
        System.out.println(anonymous);
        System.out.println(doug);
        System.out.println(onetwo);
    }
}
