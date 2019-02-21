import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入格式為24小時制, 例如: 23:45 = 2345");
        System.out.println("請輸入上班時間:");
        String loginTime = input.next();
        System.out.println("請輸入下班時間:");
        String logoutTime = input.next();

        String loginSecond = loginTime.substring(2);
        String loginHour = loginTime.substring(0,2);
        String logoutSecond = logoutTime.substring(2);
        String logoutHour = logoutTime.substring(0,2);


//        if(loginSecond.equals("00")) {
//            loginSecond = "60";
//            loginHour = Integer.parseInt(loginHour) - 1+"";
//            loginTime = loginHour + loginSecond;
//            System.out.println(loginHour);
//        }

//        if(logoutSecond.equals("00")) {
//            logoutSecond = "60";
//            logoutHour = Integer.parseInt(logoutHour) - 1+"";
//            logoutTime = logoutHour + logoutSecond;
//            System.out.println(logoutHour);
//        }
        int workTime = Integer.parseInt(logoutTime) - Integer.parseInt(loginTime);
        System.out.println("總上班時數為:" + workTime);
    }
}
