import java.sql.SQLOutput;
import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {

        
        ArrayList<Integer> multiples = new ArrayList<>();

        for (int j = 999; j > 0; j--) {

            if (j % 3 == 0 || j % 5 == 0) {
                multiples.add(j);
            }
        }

        System.out.println(multiples.size());


    }
}
