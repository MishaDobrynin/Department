
/**
 * Write a description of class SeattleCollege here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeattleCollege
{
    public static void main(String[] args){
        Department North = new Department(28, 10, 30, 1);
        Student add_me = new Student("Doug", "Dougerson", "123456789", true, false, false);
        System.out.println(North.getTotalGr110());
        System.out.println(North.getTotalGr142());
        System.out.println(North.getTotalGr143());
        North.addStudent(add_me);
        System.out.println("Added student!");
        System.out.println(add_me.toString());
        System.out.println(North.getTotalGr110());
        System.out.println(North.getTotalGr142());
        System.out.println(North.getTotalGr143());
    }
}
