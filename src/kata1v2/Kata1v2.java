package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2  {  
    
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996,4,9);
        
        Person person = new Person("Leandro", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
                
    }
    
}
