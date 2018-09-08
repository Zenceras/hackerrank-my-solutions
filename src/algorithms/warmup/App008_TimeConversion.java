package algorithms.warmup;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 *
 * Created by vlad on 31.08.17.
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class App008_TimeConversion {
    public static void main(String[] args) {

        // Results from hackerrank tests:
        System.out.println(timeConversion("12:40:22AM")); //00:40:22
        System.out.println(timeConversion("12:45:54PM")); //12:45:54

    }

    static String timeConversion(String s) {
        if (s.endsWith("AM")) { //if time is AM - just return what time without 'AM'
            if (s.startsWith("12")) { //change 12 AM to 00 AM
                return ("00" + s.substring(2, s.length() - 2));
            } else {
                return (s.substring(0, s.length() - 2));
            }
        }
        if (s.endsWith("PM")) { //if time is AM - add 12 to hours and return
            String[] x = s.split(":");
//        System.out.println(Arrays.toString(x));
            int hoursInt = Integer.parseInt(x[0]);
            hoursInt = hoursInt + 12;
            String hoursString;
            if (hoursInt == 24) { // 12:45PM its 12:45 in 24h format, but not 24:45
                hoursString = "12";
            } else {
                hoursString = String.valueOf(hoursInt);
            }

            String resultString = hoursString + s.substring(2, s.length() - 2); //concatenate new string with +12 hours and without 'PM'
            return resultString;
        } else {
            throw new IllegalArgumentException("Illegal String");
        }
    }


}
