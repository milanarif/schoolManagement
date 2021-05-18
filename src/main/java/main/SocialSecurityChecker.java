package main;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SocialSecurityChecker {

    public static boolean socialSecurityValidator(String socialSecurity) {
        if (socialSecurity == null) {
            return false;
        }

        String cleanSocialSecurity = socialSecurity.replaceAll("[^0-9]","");

        if (cleanSocialSecurity.length() != 12) {
            return false;
        }

        String onlyDate = cleanSocialSecurity.substring(0, cleanSocialSecurity.length() - 4);

        try {
            LocalDate date = LocalDate.parse(onlyDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
            if (Period.between(date, LocalDate.now()).getYears() <= 0){
                return false;
            }
        }
        catch (DateTimeParseException e) {
            return false;
        }

        cleanSocialSecurity = cleanSocialSecurity.substring(2);
        int nSum = 0;
        boolean multiply = true;
        for (int i = 0; i < 10; i++) {
            int nbr = (cleanSocialSecurity.charAt(i) - '0');
            if (multiply) {
                nbr *= 2;
            }
            if(nbr >= 10) {
                nSum += 1;
                nSum += nbr % 10;
            } else {
                nSum += nbr;
            }
            multiply = !multiply;
        }
        return nSum % 10 == 0;
    }

    public static String getGender(String socialSecurity) {
        socialSecurity = socialSecurity.replaceAll("[^0-9]","");
        if (socialSecurity.length() == 12) {
            try {
                int number = (socialSecurity.charAt(10) - '0');
                if (number % 2 == 0) {
                    return "Female";
                }
                else {
                    return  "Male";
                }
            }
            catch (StringIndexOutOfBoundsException e) {
                return null;
            }
        }
        return null;
    }
}

