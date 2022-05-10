
/**
 * Write a description of class Student here.
 *
 * @author Misha Dobrynin
 * @version March 6, 2022
 */
public class Student
{
    private String FirstName;
    private String LastName;
    private String ID;
    private boolean CSC110;
    private boolean CSC142;
    private boolean CSC143;
    private final double CREDIT_TO_DOLLAR = 110.00;
    private final int CREDIT = 5;
    /**
     * Half constructor - just first name, last name, and 9-digit numerical id
     */
    public Student(String one, String two, String id){
        this(one, two, id, false, false, false);
    }
    /**
     * Full constructor. Sets first and last names, id and what classes the person is taking
     */
    public Student(String one, String two, String id, boolean c110, boolean c142, boolean c143){
        setFirstName(one);
        setLastName(two);
        setID(id);
        setCSC110(c110);
        setCSC142(c142);
        setCSC143(c143);
        if(c110 && c142 || c110 && c143 || c142 && c143) throw new IllegalArgumentException("Can't take two classes at once");
    }
    /**
     * Sets the new first name
     * @param String The new last name
     */
    public void setFirstName(String y){
        if(y.isEmpty()) throw new IllegalArgumentException("Name can't be empty");
        this.FirstName = y;
    }
    /**
     * Sets the new last name
     * @param String The new last name
     */
    public void setLastName(String y){
        if(y.isEmpty()) throw new IllegalArgumentException("Last name can't be empty");
        this.LastName = y;
    }
    /**
     * Sets the new 9-digit numerical ID
     * @param String the new ID
     */
    public void setID(String y){
        if(!y.matches("[0-9]{9}")) throw new IllegalArgumentException("9-digit id all numbers, please!");
        this.ID = y;
    }
    /**
     * Sets the new boolean condition on the CSC110 class
     * @param boolean The new condition
     */
    public void setCSC110(boolean y){
        this.CSC110 = y;
        if(y){
            this.CSC142 = false;
            this.CSC143 = false;
        }
    }
    /**
     * Sets the new boolean condition on the CSC142 class
     * @param boolean The new condition
     */
    public void setCSC142(boolean y){
        this.CSC142 = y;
        if(y){
            this.CSC110 = false;
            this.CSC143 = false;
        }
    }
    /**
     * Sets the new boolean condition on the CSC143 class
     * @param boolean The new condition
     */
    public void setCSC143(boolean y){
        this.CSC143 = y;
        if(y){
            this.CSC142 = false;
            this.CSC110 = false;
        }
    }
    /**
     * Returns the first name
     * @return String The first name
     */
    public String getFirstName(){
        return FirstName;
    }
    /**
     * Returns the last name
     * @return String the last name
     */
    public String getLastName(){
        return LastName;
    }
    /**
     * Returns the ID
     * @return String ID
     */
    public String getID(){
        return ID;
    }
    /**
     * Returns whether or not the student is signed up for the csc110 class
     * @return boolean Whether or not the student is signed up for CSC110
     */
    public boolean getCSC110(){
        return CSC110;
    }
    /**
     * Returns whether or not the student is signed up for the csc142 class
     * @return boolean Whether or not the student is signed up for CSC142
     */
    public boolean getCSC142(){
        return CSC142;
    }
    /**
     * Returns whether or not the student is signed up for the csc143 class
     * @return boolean Whether or not the student is signed up for CSC143
     */
    public boolean getCSC143(){
        return CSC143;
    }
    /**
     * Returns how many dollars the student is credited
     * @return int How many dollars they have credited
     */
    public double getBalance(){
        return CREDIT*CREDIT_TO_DOLLAR;
    }
    public String toString(){
        String r = "";
        r += "First Name: " + FirstName;
        r += "\nLast Name: " + LastName;
        r += "\nID: " + ID;
        r += "\nClass: ";
        if(this.CSC110) r += "CSC110";
        else if(this.CSC142) r += "CSC142";
        else r += "CSC143";
        r += "\nBalance: " + this.getBalance();
        return r;
    }
    }