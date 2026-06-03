public class UPIPayment implements Payment{
    private String upiId;


    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI → " + upiId);
    }

    public String getUPI_ID() {
        return upiId;
    }

    public UPIPayment(String UPI_ID) {
        if(isValid(UPI_ID)) {
            this.upiId = UPI_ID;
        }else{
            throw new IllegalArgumentException("UPI ID IS NOT VALID.PLEASE TRY AGAIN");
        }
    }
    private static final String UPI_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+$";
    private boolean isValid(String Upi_id){
        if(Upi_id == null || Upi_id.isBlank()){
            return false;
        }
        if(!Upi_id.matches(UPI_REGEX)){
            return false;
        }
        return true;
    }
}
