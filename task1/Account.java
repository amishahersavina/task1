 class Account {


   String accountNumber;
   double getBalance;
   String customerName;
   String email;
   String phoneNumber;

  Account (String accountNumber, double balance,String customerName,
 String email, String phoneNumber) {
  this.accountNumber = accountNumber;
  this.getBalance = balance;
  this.customerName = customerName;
  this.email = email;
  this.phoneNumber = phoneNumber;
}
  

 public void deposit (double amount){
  System.out.println("double amount");
 }

 public void withdraw(double amount){
  System.out.println("double amount");
 }

 
 public double getBalance(double[] values) {
  double totalBalance = 0.0;
  for (double value : values) {
      totalBalance += value;
  }
  return totalBalance;
}
 }