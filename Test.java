public class Test {
    public static void main(String[] args) {
        Transaction t1=new Transaction("income",5000000,"Salary");
        Transaction t2=new Transaction("expense",500000,"Food");
        Transaction t3=new Transaction("expense",300000,"Transport");
        FinanceTracker tracker=new FinanceTracker();
        tracker.addTransaction(t1);
        tracker.addTransaction(t2);
        tracker.addTransaction(t3);
        tracker.showTransactions();
        System.out.println("Total income = "+tracker.getTotalIncome());
        System.out.println("Total expense = "+tracker.getTotalExpense());
        System.out.println("Balance = "+tracker.getBalance());
    }
}