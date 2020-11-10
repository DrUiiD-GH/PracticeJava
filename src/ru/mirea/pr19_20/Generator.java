package ru.mirea.pr19_20;

import java.util.ArrayList;

public class Generator {
    private ArrayList<String> list;
    private String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    public Generator(){}
    public void generate(){
        list = new ArrayList<String>();
        for (int region=1; region<200; region++){
            for (int num=0; num<10; num++){
             for (int l_1 = 0; l_1<letter.length;l_1++){
                 for (int l_2 = 0; l_2<letter.length;l_2++){
                     for (int l_3 = 0; l_3<letter.length;l_3++){
                         String number =letter[l_1]+num+num+num+letter[l_2]+letter[l_3];
                         if((region>0)&(region<10)) number=number+0+region;
                         else number+=region;
                         list.add(number);
                     }
                 }
             }
            }
        }
    }

    public ArrayList<String> getList() {
        return list;
    }
}
