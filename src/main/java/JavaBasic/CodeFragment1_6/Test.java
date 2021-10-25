package JavaBasic.CodeFragment1_6;

import JavaBasic.CodeFragment1_5.CreditCard;

public class Test {
    public static void main(String[] args) {
        var wallets = new CreditCard[10];
        wallets[0] = new CreditCard(
            "5391 0375 9387 5309"
            , "John Bowman"
            , "California Savings"
            , 0.0
            , 2500
        );
        wallets[1] = new CreditCard(
            "3485 0399 3395 1954"
            , "John Federal"
            , "California Savings"
            , 0.0
            , 3500
        );
        wallets[2] = new CreditCard(
            "6011 4902 3294 2994"
            , "John Bowman"
            , "California Finance"
            , 0.0
            , 5000
        );

        for (var i = 0; i <= 16; i++) {
            chargeAndCheckOverLimit(wallets[0], i * 100);
            chargeAndCheckOverLimit(wallets[1], 2.0 * i);
            chargeAndCheckOverLimit(wallets[2], 3 * i);
        }

        for (var wallet : wallets) {
            if (wallet == null) {
                continue;
            }

            CreditCard.printCard(wallet);
            while (wallet.getBalance() > 100.0) {
                wallet.makePayment(100.0);
                System.out.println("New balance = " + wallet.getBalance());
            }
        }
    }

    private static void chargeAndCheckOverLimit(final CreditCard creditCard, double price) {
        if (!creditCard.chargeLt(price)) {
            System.out.println(creditCard.getNumber() + " OverLimit!!");
        }
    }
}
