public class Account {
    private String accountNumber;
    private double totalbalance;
    private  double availablebalance;

    public Account(String accountNumber, double availablebalance, double totalbalance) {
        this.accountNumber = accountNumber;
        this.availablebalance = availablebalance;
        this.totalbalance = totalbalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTotalbalance() {
        return totalbalance;
    }

    public void setTotalbalance(double totalbalance) {
        this.totalbalance = totalbalance;
    }

    public double getAvailablebalance() {
        return availablebalance;
    }

}
