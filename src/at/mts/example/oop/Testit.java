package at.mts.example.oop;

import java.util.ArrayList;
import java.util.Random;

public class Testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Katze> mKatzenListe = new ArrayList<>();
        Katze katze = new Katze();
        String[] charListe ={"bösartig","gutartig","hinterhältig", "listig", "schmusig","lieblich"};
        String[] oberflListe ={"flauschig","borstig","glatt", "weich", "nass","kurzhaar","struppig","samtig","flauschig"};
        String[] nameListe ={"Lilly","Julia","Elias", "Minzi", "Hansjörg","Franzl",};
        String[] farbListe ={"weiß","schwarz","tiegerle", "dreifärbig", "rosa",};


        for (int i = 1; i<=100;i++){
            //int ci = r.nextInt();
            // int randomNumber = random.nextInt(max + 1 - min) + min;
            int ci = r.nextInt(charListe.length -1 - 0) + 0;
            int ni = r.nextInt(nameListe.length -1 - 0) + 0;
            int oi = r.nextInt(oberflListe.length -1 - 0) + 0;
            int fi = r.nextInt(farbListe.length -1 - 0) + 0;
            int ai = r.nextInt(25 + 1 - 0) + 0;

            mKatzenListe.add(new Katze (charListe[ci],oberflListe[oi],ai,farbListe[fi],nameListe[ni]));
        }
        katze.setAlter(1);
        katze.setCharakter("bösartig");
        katze.setFarbe("karriert");
        katze.setOberflaechenbeschaffenheit("flauschig");
        katze.setName("Lilli");

        Katze katze2 = new Katze ("nette","nackt",5,"rosa","Nackibutz");
        mKatzenListe.add(katze2);

       // System.out.println("Meine Katze "+katze.getName()+" ist " + katze.getAlter() + " alt! ");

        for(Katze k: mKatzenListe){
            System.out.println("Meine Katze "+k.getName()+" ist " + k.getAlter() + " Jahre alt, "+ k.getCharakter()+ " " + k.getFarbe()+" " +k.getOberflaechenbeschaffenheit());

        }
    }
}
