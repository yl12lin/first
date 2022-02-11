import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Text {
    static String name1;
    static String pwd1;
    static String type;

    public static void main(String[] args) {
        String name;
        String pwd;
        String phonenummber;
        UserInfo userInfo = null;
        LoginAndRegister loginAndRegister;


        while (true){
            System.out.println("*********欢迎使用新冠疫苗接种系统**********");
            System.out.println("请选择    1.用户注册     2.用户登录     0.退出系统");
            System.out.print("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            Date date = new Date();
            int i = sc.nextInt();
            switch (i){
                case 1: //注册
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
                    System.out.print("请输入用户名：");
                    name = sc.next();
                    System.out.print("请输入密码：");
                    pwd = sc.next();
                    System.out.print("请输入电话号码：");
                    phonenummber = sc.next();
                    userInfo = new UserInfo(name,pwd,phonenummber,formatter.format(date));
                    loginAndRegister = new LoginAndRegister();
                    loginAndRegister.Register(userInfo);
                    System.out.println(userInfo);
                    break;
                case 2: //登录
                    System.out.print("请输入您的用户名：");
                    name1 = sc.next();
                    System.out.print("请输入你的密码：");
                    pwd1 = sc.next();
                    loginAndRegister = new LoginAndRegister();
                    if(name1.equals("yl") && pwd1.equals("123456")){
                        System.out.println("欢迎管理员");
                        System.out.println("请选择: 1.查看接种用户的基本信息  2.查看已接种用户");
                        System.out.print("请输入您的选择：");
                        int choice = sc.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("已预约用户列表\n用户名\t联系方式\t接种疫苗\t预约日期");
                                System.out.println(userInfo+"type="+type);
                                break;
                            case 2:
                                for (int j = 0; j < userInfo.getName().length(); j++) {
                                    System.out.println(userInfo.getName());
                                }break;
                        }
                    }else{
                        Boolean flag = loginAndRegister.login(name1,pwd1);
                        if (flag){
                            System.out.println("请选择接种疫苗种类：1.灭活疫苗 2.腺病毒载体疫苗 3.重组蛋白疫苗");
                            System.out.print("请输入你的选择：");
                            int num = sc.nextInt();
                            if(num == 1){
                                type = "灭活疫苗";
                            }else if (num == 2){
                                type = "腺病毒载体疫苗";
                            }else if (num == 3){
                                type = "重组蛋白疫苗";
                            }
                            System.out.println("感谢使用疫苗接种系统，你已成功接种");
                        }else{
                            System.out.println("密码或账号错误，请重新输入");
                        }
                    }
                case 0:
                    System.exit(0);
            }
        }

    }

}
