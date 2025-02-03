import java.util.Date;

public class Transaction extends Account{
    private int transactionId;
    private TransactionStatus status;
    private Date creationDate;
    private Account account;
    private Atm atm;

    public Transaction(String accountNumber, double availablebalance, double totalbalance) {
        super(accountNumber, availablebalance, totalbalance);
    }

    public boolean saveTransaction() {
        return false;
    }
}