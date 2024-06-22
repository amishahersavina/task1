public class AccountApp {
    public static void main(String[] args) throws Exception {
        Account myAccount = new Account("12345", 0, "amisha", "shashauji@gmail.com", "08988888888");

        myAccount.deposit(1000000);
        System.out.println("Jumlah balance: " + myAccount.getBalance);
        myAccount.withdraw(1000000);
        myAccount.withdraw(1000000);
        myAccount.deposit(1000000);
        myAccount.withdraw(50000);
        System.out.println("Jumlah balance: " + myAccount.getBalance);
    }
}
