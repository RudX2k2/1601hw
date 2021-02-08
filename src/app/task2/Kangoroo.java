package app.task2;

public class Kangoroo extends Animal{
    private int VolumeOfBag;

    public Kangoroo(String name, boolean isEatingMeat, int volumeOfBag){
        super(name, isEatingMeat);
        setVolumeOfBag(volumeOfBag);
    }
    public void setVolumeOfBag(int volumeOfBag)
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
        System.out.println("Jumpoooo poweeeer\n");
    }
}
