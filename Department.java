
/**
 * Write a description of class Department here.
 *
 * @author Misha Dobrynin
 * @version March 6, 2022
 */
public class Department
{
    private int csc110;
    private int csc142;
    private int csc143;
    private double totalBal;
    private final int STUD_PER_GP = 28;
    /**
     * Empty constructor
     * Sets student counts to 0
     */
    public Department(){
        this(0, 0, 0, 0);
    }
    /**
     * Full constructor
     * Accepts students in CSC110, 142, and 143, as well as how many credits threre are in total
     */
    public Department(int c110, int c142, int c143, double totalBal){
        if(c110 < 0 || c142 < 0 || c143 < 0 || totalBal < 0){
            throw new IllegalArgumentException("Can't be less than 0 people/credits");
        }
        this.csc110 = c110;
        this.csc142 = c142;
        this.csc143 = c143;
        this.totalBal = totalBal;
    }
    /**
     * Returns how many students there are in CSC110
     * @return int How many students in CSC110 class
     */
    public int getTotalGr110(){
        int x = csc110/STUD_PER_GP;
        if(csc110%STUD_PER_GP != 0) x++;
        return x;
    }
    /**
     * Returns how many students are in CSC142
     * @return int How many students in CSC142 class
     */
    public int getTotalGr142(){
        int x = csc110/STUD_PER_GP;
        if(csc142%STUD_PER_GP != 0) x++;
        return x;
    }
    /**
     * Returns how many students are in CSC143
     * @return int How many students in CSC143 class
     */
    public int getTotalGr143(){
        int x = csc110/STUD_PER_GP;
        if(csc143%STUD_PER_GP != 0) x++;
        return x;
    }
    /**
     * Adds a student to the department
     * @param Student A student who is added to the department
     */
    public void addStudent(Student s){
        totalBal += s.getBalance();
        if(s.getCSC143()){
            csc143 ++;
        }
        else if(s.getCSC110()){
            csc110 ++;
        }
        else if(s.getCSC142()){
            csc142 ++;
        }
    }
    /**
     * Returns the total balance
     * @return double The total balance
     */
    public double getTotalBal(){
        return totalBal;
    }
    /**
     * Returns how many students in department
     * @return int Student count in department
     */
    public int getTotalStud(){
        return this.csc110 + this.csc142 + this.csc143;
    }
    public String toString(){
        String r = "CSC110: " + csc110;
        r += "\nCSC142: " + csc142;
        r += "\nCSC143: " + csc143;
        r += "\nTotal Students: " + this.getTotalStud();
        return r + "\nTotal balance: " + totalBal; 
    }
}
