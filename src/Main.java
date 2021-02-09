import app.task1.*;
import app.task2.*;
import app.task3.*;
import app.task4.*;

public class Main {
    public static void main(String[] args){
       //Task1();
        //Task2();
        //Task3();
        //Task4();
    }
    static void Task1(){
        Builder John = new Builder("John",45,"Senior SSS", "CERN");
        Sailor Ivan= new Sailor("Ivan",24,"Middle SS", "ArcticSudno");
        Pilot Akihiko = new Pilot("Akihiko",17,"Junior S", "Mitsubisi");
        John.showInfo();
        John.Work();

        Ivan.showInfo();
        Ivan.Work();

        Akihiko.showInfo();
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
    static void Task3(){
        Product yogurt = new Product("Йогурт Смаколик","Гривні",35,"Копійки",42);
        yogurt.showInfo();
        yogurt.decreaseValue();
    }
    static void Task4(){
        Steamer st = new Steamer("Sibir", 4800);
        Microwave mw = new Microwave("Roaster3000", 115);
        Kettle kt = new Kettle("FingerFlame", 25);
        st.Show();
        mw.Desc();
        kt.Sound();
    }
    static void Task6(){

    }
}
