public class PaymentCard {
    private String cardNumber;
    private String cardHolder;
    private int expiryMonth;
    private int expiryYear;

    public PaymentCard(){
        cardNumber="";
        cardHolder="";
        expiryMonth=0;
        expiryYear=0;
    }
    public PaymentCard(String cardNumber, String cardHolder, int expiryMonth, int expiryYear){
        setCardNumber(cardNumber);
        setCardHolder(cardHolder);
        setExpiryMonth(expiryMonth);
        setExpiryYear(expiryYear);
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        if (cardNumber!=null && cardNumber.length()==16){
            this.cardNumber=cardNumber;
        }
    }
    public String getCardHolder(){
        return cardHolder;
    }
    public void setCardHolder(String cardHolder){
        if (cardHolder!=null && !cardHolder.isEmpty()){
            this.cardHolder=cardHolder;
        }
    }
    public int getExpiryMonth(){
        return expiryMonth;
    }
    public void setExpiryMonth(int expiryMonth){
        if (expiryMonth>=1 && expiryMonth<=12){
            this.expiryMonth=expiryMonth;
        }
    }
    public int getExpiryYear(){
        return expiryYear;
    }
    public void setExpiryYear(int expiryYear){
        if (expiryYear>=2026){
            this.expiryYear=expiryYear;
        }
    }
    public String toString(){
        return "\nPaymentCard:\ncardNumber = "+cardNumber+", \ncardHolder = "+cardHolder+",\nexpiryMonth = "+expiryMonth+",\nexpiryYear = "+expiryYear;
    }
}
