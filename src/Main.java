import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by KPS on 7/24/2020.
 */
public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK , Calendar.MONDAY);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(cal.getTime()));
        for (int i = 0 ;i < 6 ; i++){
            cal.add(Calendar.DAY_OF_WEEK , 1);
        }
        System.out.println(simpleDateFormat.format(cal.getTime()));
    }
}
