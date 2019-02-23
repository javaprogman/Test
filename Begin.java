package Blinnov.chapter8Exception;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Begin {

    public double  parseFromFrance(String numberStr) throws ParseException {

        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double numFr = nfFr.parse(numberStr).doubleValue();
            return numFr;
        } catch (Exception e) {
            //System.out.println("We catch the Exception in metod!");
            //return 0;
            throw e;
        } finally {
            System.out.println("Output always!");
        }

       // return  Double.valueOf(numberStr);

    }

    public static void main(String[] args) {
        Begin begin = new Begin();

        try {
            System.out.println(begin.parseFromFrance("gh123g.3a"));
        } catch (ParseException e) {
            System.out.println("We call the ParseException! ");
        }

        catch(Exception e) {
            System.out.println("We transmit the Exception in Main!" + e);
        }
    }
}
