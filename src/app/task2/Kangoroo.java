package app.task2;

public class Kangoroo extends Animal implements iAction{
    private int VolumeOfBag;

    public Kangoroo(String name, boolean isEatingMeat, int volumeOfBag){
        super(name, isEatingMeat);
        setVolumeOfBag(volumeOfBag);
    }
    private void setVolumeOfBag(int volumeOfBag)
    {
        if(VolumeOfBag > 0)
        {
            this.VolumeOfBag = volumeOfBag;
        }
    }
    public int getVolumeOfBag(){
        return this.VolumeOfBag;
    }
    public void Action()
    {
        super.ShowInfo();
        System.out.println("I have a bag for my baby, it has " + getVolumeOfBag() + " cm3\n");
    }
}
