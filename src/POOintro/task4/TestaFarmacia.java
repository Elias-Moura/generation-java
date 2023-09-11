package POOintro.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaFarmacia {
    public static void main(String[] args) {
        var farmacia1 = new Farmacia("Raia", "Rua 1", 1,1,1);
        var farmacia2 = new Farmacia("Riego", "Rua 2", 2,2,2);

        var farmacias =  new ArrayList<>(Arrays.asList(farmacia1, farmacia2));

        for (var farmacia : farmacias) {
            System.out.println(farmacia.vizualizar());
        }
    }
}
