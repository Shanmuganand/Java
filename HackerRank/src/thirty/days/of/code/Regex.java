package thirty.days.of.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        List<String> set = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < rows; i++){
            String temp = sc.nextLine();
            String tempArray[] = temp.split(" ");
            if(validate(tempArray[1])){
                set.add(tempArray[0]);
            }
        }
        sc.close();
        Collections.sort(set);
        
        for(String setValue : set){
            System.out.println(setValue);
        }
    }
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@gmail.com", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
}
