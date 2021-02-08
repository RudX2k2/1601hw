package app.task2;

public class Crocodile extends Animal{
    private int countOfTearsPerDay;

    public Crocodile(String name, boolean isEatingMeat, int countOfTearsPerDay){
        super(name, isEatingMeat);
        setCountOfTearsPerDay(countOfTearsPerDay);
    }
    public void setCountOfTearsPerDay(int countOfTearsPerDay)
    {
        if(countOfTearsPerDay > 0)
        {
            this.countOfTearsPerDay = countOfTearsPerDay;
        }
    }
    public int getCountOfTearsPerDay(){
        return this.countOfTearsPerDay;
    }
    public void Action()
    {
        super.ShowInfo();
        System.out.println("Waiting...\n");
    }
}
