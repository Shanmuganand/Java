package thirty.days.of.code;

//import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateCalculation {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc = new Scanner (System.in);
        String endDate = "9 6 2015";
        String startDate = "6 6 2015";
        
        Calendar returnDate = Calendar.getInstance();
        Calendar expectedReturnDate = Calendar.getInstance();
        //cal.DAY_OF_MONTH = Integer.parseInt(endDate.split(" ")[0]);
        //cal.MONTH = Integer.parseInt(endDate.split(" ")[1]);
        //cal.MONTH = Integer.parseInt(endDate.split(" ")[1]);
        returnDate.set(Integer.parseInt(endDate.split(" ")[2]), Integer.parseInt(endDate.split(" ")[1]), Integer.parseInt(endDate.split(" ")[0]));
        expectedReturnDate.set(Integer.parseInt(startDate.split(" ")[2]), Integer.parseInt(startDate.split(" ")[1]), Integer.parseInt(startDate.split(" ")[0]));
        
        //long daysBetween = ChronoUnit.DAYS.between(returnDate.toInstant(), expectedReturnDate.toInstant());
        
        int endDay = Integer.parseInt(endDate.split(" ")[0]);
        int startDay = Integer.parseInt(startDate.split(" ")[0]);
        int endMonth = Integer.parseInt(endDate.split(" ")[1]);
        int startMonth = Integer.parseInt(startDate.split(" ")[1]);
        int endYear = Integer.parseInt(endDate.split(" ")[2]);
        int startYear = Integer.parseInt(startDate.split(" ")[2]);

        if((endDay<=startDay && endMonth==startMonth && endYear==startYear)
           || (endMonth<startMonth && endYear==startYear)
           || (endYear<startYear)){
            System.out.println("0");
        }else if(endDay>startDay && endMonth<=startMonth && endYear<=startYear){
            System.out.println((endDay - startDay) * 15);
        }else if(endMonth>startMonth && endYear<=startYear){
            System.out.println((endMonth - startMonth) * 500);
        }else if(endYear>startYear){
            System.out.println("10000");
        }
    }

}
