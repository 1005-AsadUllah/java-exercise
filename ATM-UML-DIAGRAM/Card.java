
import java.util.Date;

public class Card {
    private String cardNumber;
    private String customerName;
    private Date cardExpiry;
    private int pin;

    public Card(Date cardExpiry, String cardNumber, String customerName, int pin) {
        this.cardExpiry = cardExpiry;
        this.cardNumber = cardNumber;
        this.customerName = customerName;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(Date cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
