import java.math.BigDecimal;
import java.util.List;

public final class RandomNumbers {

    private static int nextIntFromRange(int startNumber, int endNumber){
        return (int)(Math.random()* (endNumber - startNumber + 1) + startNumber);
    }

    private static int nextEvenIntFromRange(int startNumber, int endNumber){
        int result = (int)(Math.random()* (endNumber - startNumber + 1) + startNumber);
        while (result % 2 != 0)
            result = (int)(Math.random()* (endNumber - startNumber + 1) + startNumber);
        return result;
    }

    private static BigDecimal randomElement(List<BigDecimal> listOfNumbers){
        int index = (int)(Math.random()* listOfNumbers.size());
        return listOfNumbers.get(index);
    }
}