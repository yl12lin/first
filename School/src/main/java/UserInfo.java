public class UserInfo {
    private String name;
    private String pwd;
    private String phonenummber;
    private String time;
    public UserInfo() {

    }
    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.name = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhonenummber() {
        return phonenummber;
    }

    public void setPhonenummber(String phonenummber) {
        this.phonenummber = phonenummber;
    }

    public UserInfo(String name, String pwd, String phonenummber, String time) {
        this.name = name;
        this.pwd = pwd;
        this.phonenummber = phonenummber;
        this.time = time;
    }

    @Override
    public String toString() {
        return "name="+name+","+"phonenummber="+phonenummber+","+"time="+time+",";

    }
}
