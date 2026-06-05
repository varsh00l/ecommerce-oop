public class SmsNotification implements Notification{
    private String phoneNumber;
    @Override
    public void update(String message) {
        System.out.println("SMS sent to"+phoneNumber+"Order Placed");
    }

    public SmsNotification(String phoneNumber) {
       setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber==null||phoneNumber.isBlank()){
            throw new IllegalArgumentException("Phone Number is Invalid.Try Again");
        }
        this.phoneNumber = phoneNumber;
    }
}
