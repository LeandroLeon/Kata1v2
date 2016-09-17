package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
    private final String name;
    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Calendar today;
        today = GregorianCalendar.getInstance();
        return (int) (millisecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long millisecondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
}
