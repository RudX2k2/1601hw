package app.task2;
public class Tiger extends Animal implements iAction{
    private int CountOfStripes;

    public Tiger(String name, boolean isEatingMeat, int countOfStripes){
        super(name, isEatingMeat);
        this.CountOfStripes = countOfStripes;
    }
    private void setCountOfStripes(int countOfStripes)
    {
        if(countOfStripes > 0)
        {
            this.CountOfStripes = countOfStripes;
        }
    }
    public int getCountOfStripes(){
        return this.CountOfStripes;
    }
    public void Action()
    {
        super.ShowInfo();
        System.out.println("I am strippy tiger, i have " + getCountOfStripes() + " black stripes on my body\n");
    }

}
