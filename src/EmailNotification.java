public class EmailNotification implements Notification{
    private String email;

    public String getEmail() {
        return email;
    }

    public EmailNotification(String email) {
        setEmail(email);
    }

    public void setEmail(String email) {
        if(email==null||email.isBlank()){
            throw new IllegalArgumentException("Invalid Email");
        }
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email Sent to"+email+"Order Placed");
    }
}
