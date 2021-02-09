package app.task3;

import java.util.Scanner;

public class Money {
    private String NameInt;
    private int AmountInt;
    private String NameFract;
    private int AmountFract;

    public Money(String nameInt, int amountInt, String nameFract, int amountFract) {
        setNameInt(nameInt);
        setNameFract(nameFract);
        setAmountInt(amountInt);
        setAmountFract(amountFract);
    }
    public Money(){}

    private void setNameInt(String nameInt){
            this.NameInt = nameInt;
    }
    public String getNameInt(){
        return this.NameInt;
    }

    private void setNameFract(String nameFract){
        this.NameFract = nameFract;
    }
    public String getNameFract(){
        return this.NameFract;
    }

    private void setAmountInt(int amountInt){
        if(amountInt > 0){
            this.AmountInt = amountInt;
        }
    }
    public int getAmountInt(){
        return this.AmountInt;
    }

    private void setAmountFract(int amountFract){
        if(amountFract > 0){
            if(amountFract > 99){
                int temp = amountFract;
                for(int i = 0; i < temp/100; i++)
                {
                    setAmountInt(getAmountInt()+1);
                    amountFract-=100;
                }
                this.AmountFract = amountFract;
            }
            else{
                this.AmountFract = amountFract;
            }
        }
    }
    public int getAmountFract(){
        return this.AmountFract;
    }

    public void EditInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer amount of money:");
        int amountInt = sc.nextInt();
        if(amountInt > 0)
            setAmountInt(amountInt);
        else{
            System.out.println("Wrong value!");
        }
    }
    public void EditFract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fractal amount of money:");
        int amountFract = sc.nextInt();
        if(amountFract > 0)
            setAmountFract(amountFract);
        else{
            System.out.println("Wrong value!");
        }
    }

    public void ShowAmount(){
        System.out.println("Name of integer currency: " + getNameInt()
                + "\nName of fractal currency: " + getNameFract()
        + "\nAmount of money: " + getAmountInt() + "." + getAmountFract());
    }

}
