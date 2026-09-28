public class FinanceTracker {
    private Transaction[] transactions;
    public FinanceTracker(){
        transactions=new Transaction[0];
    }
    public FinanceTracker(Transaction[] transactions){
        setTransactions(transactions);
    }
    public Transaction[] getTransactions(){
        return transactions;
    }
    public void setTransactions(Transaction[] transactions){
        if (transactions!=null){
            this.transactions=transactions;
        }
    }
    public void addTransaction(Transaction transaction){
        if (transaction!=null){
            Transaction[] newTransactions=new Transaction[transactions.length+1];
            for (int i=0;i<transactions.length;i++){
                newTransactions[i]=transactions[i];
            }
            newTransactions[transactions.length]=transaction;
            transactions=newTransactions;
        }
    }
    public void showTransactions(){
        for (int i=0;i<transactions.length;i++){
            System.out.println(transactions[i]);
        }
    }
    public double getTotalIncome(){
        double total=0.0;
        for (int i=0;i<transactions.length;i++){
            if (transactions[i].getType().equals("income")){
                total+=transactions[i].getAmount();
            }
        }
        return total;
    }
    public double getTotalExpense(){
        double total=0.0;
        for (int i=0;i<transactions.length;i++){
            if (transactions[i].getType().equals("expense")){
                total+=transactions[i].getAmount();
            }
        }
        return total;
    }
    public double getBalance(){
        return getTotalIncome()-getTotalExpense();
    }
}
