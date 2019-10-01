/**
	File name: MyDate.java
	Short description: Displays 2 Dates
	IST 242 Assignment:
	@author Jimmy McGettigan
	@version 1.01  9/30/2019
*/
package mydate;

/**
 *
 * @author jmhaz
 */
public class MyDate {
    //Initialize variables
    final int jan = 0;
    
    private int year;
    private int month;
    private int day;
    
    public MyDate() {
        //No-Arg Constructor
        
        //default values
        year = 1970;
        month = 1;
        day = 1;  
    }
    
    public MyDate(long elapsedTime) {
        //Pass in data
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        
        System.out.println("Date 1: " + d1.getYear() + "/" +  d1.getMonth() + 
                "/" + d1.getDay());
        System.out.println("Date 2: " + d2.getYear() + d2.getMonth() + d2.getDay());
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    
    
}
