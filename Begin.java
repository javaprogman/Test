package Blinnov.chapter8Exception;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Begin {

    public double  parseFromFrance(String numberStr)  {

        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);

           // double numFr = nfFr.parse(numberStr).doubleValue();
            //return numFr;

            throw new IllegalArgumentException();


       // return  Double.valueOf(numberStr);

    }

    public static void main(String[] args) {
        Begin begin = new Begin();

        try {
            System.out.println(begin.parseFromFrance("gh123g.3a"));
        } catch (IllegalArgumentException e) {
            System.out.println("We call the ParseException! ");
        }

        catch(Exception e) {
            System.out.println("We transmit the Exception in Main!" + e);
        }
    }
}
