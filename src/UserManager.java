import java.util.ArrayList;
public class UserManager {
    private static UserManager instance;

    private ArrayList<String> users; // simple list of usernames

    private UserManager() {
        users = new ArrayList<>();
    }

    public static UserManager getInstance() {
       if(instance==null){
          instance=new UserManager();
       }
       return instance;
    }

    public void addUser(String username) {
        users.add(username);
    }

    public void getUsers() {
        for(String e:users){
            System.out.println(e);
        }
    }
}
