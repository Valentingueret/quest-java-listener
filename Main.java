public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);

        // TODO : create and use a TransactionListener interface with onComplete method
         TransactionListener listener = new TransactionListener() {

            @Override
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }
        };
        Transactions.withdraw(account, 100, listener);
    }
}
