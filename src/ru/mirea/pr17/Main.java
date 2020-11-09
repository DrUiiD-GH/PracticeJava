package ru.mirea.pr17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]){
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String str_1 ="abcdefghijklmnopqrstuv18340", str_2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        Matcher m1 = p1.matcher(str_1);
        System.out.printf("Строка \"%s\" сооответствует \"abcdefghijklmnopqrstuv18340\": %b\n", str_1, m1.matches());
        m1 = p1.matcher(str_2);
        System.out.printf("Строка \"%s\" сооответствует \"abcdefghijklmnopqrstuv18340\": %b\n\n", str_2, m1.matches());


        Pattern p2 = Pattern.compile("[0-9|a-fA-F]{2}(:[0-9|a-fA-F]{2}){5}");
        str_1 = "aE:dC:cA:56:76:54";
        str_2 = "01:23:45:67:89:Az";
        Matcher m2 = p2.matcher(str_1);
        System.out.printf("Строка \"%s\" правильный MAC-адресс: %b\n", str_1, m2.matches());
        m2 = p2.matcher(str_2);
        System.out.printf("Строка \"%s\" правильный MAC-адресс: %b\n", str_2, m2.matches());




        



    }
}
