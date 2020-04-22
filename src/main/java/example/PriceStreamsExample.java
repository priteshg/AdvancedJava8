package advanced_java_8.example;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class PriceStreamsExample {

    public static void main(String[] args) {
        Map<Integer, Price> priceMap = PriceDataBase.getAllPrices()
                .stream()
                .collect(groupingBy(Price::getProductID,
                        collectingAndThen(
                                maxBy(Comparator.comparing(Price::getTime)), Optional::get)
                        )
                );

        Map<Integer, Price> priceMap2 = PriceDataBase.getAllPrices()
                .stream()
                .collect(toMap(Price::getProductID, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Price::getTime)))
                );

        System.out.println(priceMap);
    }

}
