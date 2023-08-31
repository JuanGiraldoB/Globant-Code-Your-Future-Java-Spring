import Entities.Rental;
import Entities.SailBoat;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SailBoat sb = new SailBoat("fmaskd", 5, LocalDate.parse("2023-08-05"), 3);
        Rental rental = new Rental("juan", "4185961a", LocalDate.parse("2023-08-05"), LocalDate.parse("2023-08-15"), "left", sb);

        System.out.println(rental.calculateRentPrice());
        System.out.println(rental);
    }
}
