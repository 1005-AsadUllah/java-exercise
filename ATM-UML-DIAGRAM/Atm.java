public class Atm extends Bank {
    private int atmID;
    private Address address;
    private Bank bank;
    private CashDispenser cashdispenser;
    private KeyPad keypad;
    private Screen screen;
    private Printer printer;
    private Cardreader cardreader;
    private Depositsolt depositsolt;
    private Transaction transaction;

    public boolean authenticateUser(){
        return false;
    }
   
}
