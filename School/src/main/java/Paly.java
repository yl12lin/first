import java.text.SimpleDateFormat;
import java.util.Date;


public class Paly {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        System.out.println(format.format(date));

    }
}
