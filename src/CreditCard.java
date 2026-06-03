import java.time.YearMonth;

public class CreditCard implements Payment{
    private String cardHolderName;
    private String cardNumber;
    private String cvv;
    private YearMonth expiry;


    public CreditCard(String cardHolderName, String cardNumber, String cvv, YearMonth expiry) {
        setCardHolderName(cardHolderName);
        setCardNumber(cardNumber);
         setCvv(cvv);
         setExpiry(expiry);
    }

    public void setCardHolderName(String cardHolderName) {
        if(cardHolderName==null||cardHolderName.isBlank()){
            throw new IllegalArgumentException("Invalid Name");
        }
        this.cardHolderName=cardHolderName;
    }

    public String getCardNumber() {

        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        if(cardNumber.replaceAll(" ","").length()!=16)
            throw new IllegalArgumentException("Invalid CardNumber");
        this.cardNumber = cardNumber;
    }

    public void setCvv(String cvv) {
        if(cvv.length()!=3){
            throw new IllegalArgumentException("Invalid CVV");
        }
        this.cvv=cvv;
    }

    public void setExpiry(YearMonth expiry) {
        if(expiry.isBefore(YearMonth.now())){
            throw new IllegalArgumentException("Invalid Date.Please Try Again");
        }
        this.expiry=expiry;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCvv() {
        return cvv;
    }

    public YearMonth getExpiry() {
        return expiry;
    }

    @Override
    public void pay(double amount) {
        String last=cardNumber.substring(cardNumber.length()-4);
        System.out.println("Paid ₹" + amount + " via Credit Card"+last);
    }

}
