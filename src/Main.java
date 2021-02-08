import app.task1.Builder;
import app.task1.Pilot;
import app.task1.Sailor;
import app.task2.Crocodile;
import app.task2.Kangoroo;
import app.task2.Tiger;


public class Main {
    public static void main(String[] args){
       //Task1();
        Task2();
    }
    static void Task1(){
        Builder John = new Builder("John",45,"Senior SSS", "CERN");
        Sailor Ivan= new Sailor("Ivan",24,"Middle SS", "ArcticSudno");
        Pilot Akihiko = new Pilot("Akihiko",17,"Junior S", "Mitsubisi");
        System.out.println(John.showInfo());
        John.Work();
        System.out.println(Ivan.showInfo());
        Ivan.Work();
        System.out.println(Akihiko.showInfo());
        Akihiko.Work();
    }
    static void Task2(){
        Tiger tiger = new Tiger("Roarenko",true,540);
        Crocodile crocodile = new Crocodile("Crockoval", true, 78);
        Kangoroo kangoroo = new Kangoroo("Jumpoo", false, 30);
        tiger.Action();
        crocodile.Action();
        kangoroo.Action();
    }
}
