package JavaBasic.CodeFragment1_5;

import java.time.LocalDate;

public final class CreditCard {
    private static final double INTEREST_PERCENT = 0.1;

    private static final LocalDate MONTHLY_DUE_DATE;
    private static final int LATE_FEE = 100;

    private final String number;
    private final String name;
    private final String bank;
    private double balance;
    private final int limit;

    static
    {
        MONTHLY_DUE_DATE = LocalDate.now();
    }

    public CreditCard(
        String no
        , String nm
        , String bk
        , double balance
        , int lim
    ) {
        number = no;
        name = nm;
        bank = bk;
        this.balance = balance;
        this.limit = lim;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public boolean chargeLt(double price) {
        if (price + balance > ((double) limit)) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double payment) {
        var lateFee = LocalDate.now().compareTo(MONTHLY_DUE_DATE) > 0
            ? LATE_FEE
            : 0;
        balance -= payment + payment*INTEREST_PERCENT + lateFee;
    }

    public static void printCard(CreditCard c) {
        System.out.println("Number = " + c.number);
        System.out.println("Name = " + c.name);
        System.out.println("Bank = " + c.bank);
        System.out.println("Balance = " + c.balance);
        System.out.println("Limit = " + c.limit);
    }
}
