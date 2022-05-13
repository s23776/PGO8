import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreditCardForm {

    private static List<Integer> availableYears;

    private int cardNumber;
    private int cvc;
    private int expirationYear;

    static {
        availableYears = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();
        for (int counter = 0; counter < 20; counter++)
            availableYears.add(currentYear + counter);
    }

    public CreditCardForm(int cardNumber, int cvc) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        int index = (int)(Math.random() * availableYears.size());
        expirationYear = availableYears.get(index);
    }
}