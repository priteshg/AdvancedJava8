package advanced_java_8.example;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PriceDataBase {

    public static List<Price> getAllPrices()  {
        Date date = new Date();
        Price p1 = new Price(10, 39.00, 100.00);
        Price p2 = new Price(11, 12.00, 100.00);
        Price p3 = new Price(12, 70.00, 100.00);
        Price p4 = new Price(13, 90.00, 100.00);


        Price p1b = new Price(10, 38.00, 105.00);
        Price p2b = new Price(11, 14.00, 105.00);
        Price p3b = new Price(12, 60.00, 105.00);
        Price p4b = new Price(13, 80.00, 105.00);

        Price p1c = new Price(10, 37.00, 103.00);
        Price p2c = new Price(11, 19.00, 103.00);
        Price p3c = new Price(12, 40.00, 103.00);
        Price p4c = new Price(13, 100.00, 103.00);

        Price p1d = new Price(10, 50.00, 104.00);
        Price p2d = new Price(11, 10.00, 104.00);
        Price p3d = new Price(12, 5.00, 104.00);
        Price p4d = new Price(13, 120.00, 104.00);

        return Arrays.asList(p1, p2, p3, p4, p1b, p2b, p3b, p4b, p1c, p2c, p3c, p4c, p1d, p2d, p3d, p4d);

    }

}
