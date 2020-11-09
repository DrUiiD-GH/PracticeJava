package ru.mirea.pr18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]){
        String latter="Price: 123.00 USD, 12.00 USD, 231.31 EU, 62.3 RUR, 321.42 USD, 641.000 EU";
        Pattern p1 = Pattern.compile("[0-9]+[.][0-9]{1,2} (USD|RUR|EU)");
        Matcher m1 = p1.matcher(latter);
        while (m1.find()){
            System.out.println(m1.group());
        }
    }
}
