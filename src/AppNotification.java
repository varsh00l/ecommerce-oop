public class AppNotification implements Notification{
    private String userName;
    @Override
    public void update(String message) {
        System.out.println("SMS Sent to"+userName+": "+message);
    }

    public AppNotification(String userName) {
        setUserName(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName==null||userName.isBlank()){
            throw new IllegalArgumentException("The UserName is Invalid");
        }
        this.userName = userName;
    }
}
