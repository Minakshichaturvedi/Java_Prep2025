
import java.util.*;

// to overcome some problem in 1.8 version oracle people introduce Joda -Time API
//java.time
public class API {
    public static void main(String[] args) {
        //two date class in sql and util package
        Date dt = new Date();
        System.out.println(dt);
        System.out.println(dt.getTime());
    }
}
