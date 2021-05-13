package main;

import java.util.ArrayList;
import java.util.Arrays;
    public class SocialSecurity {
        static Integer [] months31 = {1,3,5,7,8,10,12};
        static ArrayList<Integer> trettioEtt = new ArrayList<>(Arrays.asList(months31));
        static Integer [] months30 = {4,6,9,11};
        static ArrayList<Integer>trettio = new ArrayList<>(Arrays.asList(months30));
        static Integer feb = 28;


        public static String socialSecurity(String socialSecurity) {

            socialSecurity = socialSecurity.replace("-", "");
            int month = Integer.parseInt(socialSecurity.substring(2,4));
            int day = Integer.parseInt(socialSecurity.substring(4,6));

            String gender = null;
            if (socialSecurity.length() == 10 && month<13){

                if((trettioEtt.contains(month) && day <= 31) || (trettio.contains(month) && day <= 30) || (day <= feb && month == 2)) {
                    int number = Integer.parseInt(socialSecurity.substring(8,9));
                    gender = maleOrFemale(number);
                }else
                    System.out.println("date dont match up with the month.");

            }else
                System.out.println("Invallid social security number!");

            return gender;
        }
        public static String maleOrFemale(int number) {
            String gender;
            if (number % 2 == 0)
                gender = "Female";
            else
                gender = "Male";
            return gender;
        }

}
