import java.util.ArrayList;
import java.util.Collection;


public class LoginAndRegister {
    static Boolean flag = false;
    static Collection<UserInfo> c;


    public void Register(UserInfo u){
        c = new ArrayList<>();
        c.add(u);
    }
    public Boolean login(String name,String pwd) {
        for(UserInfo use:c)
        if (name.equals(use.getName()) && pwd.equals(use.getPwd())) {
            flag = true;
        }
        return flag;
    }


}
