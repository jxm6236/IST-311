/*
/***************************************
* Filename: MyDate.java
* Short description: This class displays two dates
* @author James McGettigan
* @version  9/30/2019
***************************************/
package mydate;

/**
 *
 * @author jmhaz
 */
public class MyDate {
    
    private int year;
    private int month;
    private int day;
    
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;  
    }
    
    public MyDate() {
        year = 1970;
        month = 0;
        day = 1;
        

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

    
    public MyDate(long elapsedTime) {
        
    }
    
    public void setDate(long elapsedTime) {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        
        System.out.println("Date 1: yyyy/mm/dd" + d1.getYear() + d1.getMonth() + 
                d1.getDay());
        System.out.println("Date 2: yyyy/mm/dd" + "1970" + "January" + 
                "1");
    }
    
}
