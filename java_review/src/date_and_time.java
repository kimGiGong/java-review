import java.util.Calendar;
import java.util.Date;

public class date_and_time {
    /*

    Calendr 클래스 :
    추상클래스 이고 OK, getInstance는 구현한 클래스의 인스턴스를 반환한다.
    Calendar.getInstance(); 는  GregorianCalendar 를 리턴한다. 태국은 BuddhistCalendar
       
    */
    public void CalendarPrint(){
        Calendar today = Calendar.getInstance();
        System.out.println("Calendar.YEAR :"+ Calendar.YEAR);
        System.out.println("today.get(Calendar.YEAR) :"+today.get(Calendar.YEAR));
        
    }



    
    //Calendar => Date 변환:
    public void CalendarToDate (){
        Calendar cal = Calendar.getInstance();
        Date date = new Date(cal.getTimeInMillis()+3600000); // +1시간
        System.out.println(date);
    }


    //Date => Calendar 변환:
    public void DateToCalendar (){
        
        Calendar cal = Calendar.getInstance();
        Date date = new Date(cal.getTimeInMillis()+3600000); 

        cal.setTime(date); // 캘린더 시간 설정
        
        System.out.println(cal.getTime());
    }

    public static void main(String[] args) {
        date_and_time dt = new date_and_time();
        dt.CalendarPrint();
        System.out.println("절취선 -----------------------------------------");
        dt.CalendarToDate();
        System.out.println("절취선 -----------------------------------------");
        dt.DateToCalendar();
    }
    
}
