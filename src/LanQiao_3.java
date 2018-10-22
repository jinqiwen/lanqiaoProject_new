import java.util.Scanner;

public class LanQiao_3 {
  public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    String day = sr.nextLine();
    String[] n = day.split("/");
    int year = Integer.parseInt(n[0]);
    int month = Integer.parseInt(n[1]);
    int sum=0;
    boolean isLeapMonth=false;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      isLeapMonth=true;
    }
    for(int i=1;i<month;i++){
       if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
         sum+=31;
       }else if(i==2){
         sum+=isLeapMonth==true?29:28;
       }else {
         sum+=30;
       }
    }
    sum += Integer.parseInt(n[2]);
    System.out.println(sum);
  }

}
