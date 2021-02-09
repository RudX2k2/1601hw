package app.task2;

public class Animal {
    private String Name;
    private boolean IsEatingMeat;

    public Animal(String name, boolean isEatingMeat)
    {
        setName(name);
        setIsEatingMeat(isEatingMeat);
    }

    private void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }

    private void setIsEatingMeat(boolean isEatingMeat) {
       this.IsEatingMeat = isEatingMeat;
    }
    public boolean getIsEatingMeat() {
        return this.IsEatingMeat;
    }


    public void ShowInfo()
    {
        if(getIsEatingMeat() == true)
        {
            System.out.println( "This is " + getName() + " and i am eating meat");
        }
        else
        {
            System.out.println("This is " + getName() + " and i am not eating meat");
        }
    }
    public Animal(){

    }
}
