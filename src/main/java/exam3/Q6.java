package exam3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chaialong on 8/6/2016.
 */
public class Q6 {
    static final String species;

    static {
        species = "fish";
    }
    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList();
            list.add(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
