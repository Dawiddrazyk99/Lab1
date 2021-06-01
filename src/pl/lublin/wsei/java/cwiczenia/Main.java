package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Random;

public class StrongPasswordGenerator {
    private int dlugosc = 8;
    private boolean maleLitery = true;
    private boolean wielkieLitery = true;
    private boolean cyfry = true;
    private boolean znakiSpecjalne = true;
    private char[] dozwoloZnakiSpecjalne = {
            '!',
            '@',
            '#',
            '$',
            '%',
            '^',
            '&',
            '*'
    };

    public StrongPasswordGenerator(){}

    public StrongPasswordGenerator(int dlugosc,
                                   boolean maleLitery,
                                   boolean wielkieLitery,
                                   boolean cyfry,
                                   boolean znakiSpecjalne,
                                   char[] dozwoloZnakiSpecjalne){

        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloZnakiSpecjalne = dozwoloZnakiSpecjalne;
    }

    public String generate(){
        StringBuilder builder = new StringBuilder();
        Random random = new Random();

        do{
            int funkcja = random.nextInt(4);

            switch(funkcja){
                case 0:
                    if(maleLitery){
                        char c = (char)(random.nextInt(26) + 'a');
                        builder.append(c);
                    }

                    break;

                case 1:
                    if(wielkieLitery){
                        char c = (char)(random.nextInt(26) + 'A');
                        builder.append(c);
                    }

                    break;

                case 2:
                    if(cyfry){
                        int intiger = random.nextInt(10);
                        builder.append(Integer.toString(intiger));
                    }

                    break;

                case 3:
                    if(znakiSpecjalne){
                        int index = random.nextInt(dozwoloZnakiSpecjalne.length);
                        builder.append(dozwoloZnakiSpecjalne[index]);
                    }

                    break;
            }
        }while(builder.length() < dlugosc);

        return builder.toString();
    }

    public void SetDlugosc(int value){
        dlugosc = value;
    }

    public int GetDlugosc(){
        return dlugosc;
    }

    public void SetMaleLitery(boolean value){
        maleLitery = value;
    }

    public boolean GetMaleLitery(){
        return maleLitery;
    }


    public void SetWielkieLitery(boolean value){
        wielkieLitery = value;
    }

    public boolean GetWielkieLitery(){
        return wielkieLitery;

    }

    public void GetCyfry(boolean value){
        cyfry = value;
    }

    public boolean GetCyfry(){
        return cyfry;
    }

    public void GetZnakiSpecjalne(boolean value){
        znakiSpecjalne = value;
    }

    public boolean GetZnakiSpecjalne(){
        return znakiSpecjalne;
    }

    public void GetDozwoloZnakiSpecjalne(char[] value){
        dozwoloZnakiSpecjalne = value;
    }

    public char[] GetDozwoloZnakiSpecjalne() {
        return dozwoloZnakiSpecjalne;
    }
}