package app.task2;

public class Crocodile extends Animal implements iAction{
    private int countOfTearsPerDay;

    public Crocodile(String name, boolean isEatingMeat, int countOfTearsPerDay){
        super(name, isEatingMeat);
        setCountOfTearsPerDay(countOfTearsPerDay);
    }
    private void setCountOfTearsPerDay(int countOfTearsPerDay)
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
        System.out.println("I am always crying, avarage i have " + getCountOfTearsPerDay() + " TearsPerDay\n");
    }
}
