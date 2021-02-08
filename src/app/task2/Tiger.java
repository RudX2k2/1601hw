package app.task2;
public class Tiger extends Animal{
    private int CountOfStripes;

    public Tiger(String name, boolean isEatingMeat, int countOfStripes){
        super(name, isEatingMeat);
        this.CountOfStripes = countOfStripes;
    }
    public void setCountOfStripes(int countOfStripes)
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
        System.out.println("Hunting...\n");
    }

}
