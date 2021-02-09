package app.task3;

import java.util.Scanner;

public class Product extends Money{
    private String Name;
    public Product(String nameOfProduct, String nameIntValue, int intValue, String nameFractValue, int fractValue){
        super(nameIntValue,intValue,nameFractValue,fractValue);
        setName(nameOfProduct);
    }
    private void setName(String name)
    {
        this.Name = name;
    }
    public String getName(){
        return this.Name;
    }
    public void decreaseValue(){
        super.EditInt();
        super.EditFract();
        showInfo();
    }
    public void showInfo(){
        System.out.println("Name: " + getName()
                + "\nCost: " + super.getAmountInt() + " " + super.getNameInt()
                + " " + super.getAmountFract() + " " + super.getNameFract());
    }
}
