package dateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
        String currentDate = dateFormat.format(date);
        
        System.out.println(currentDate);

    }
}
