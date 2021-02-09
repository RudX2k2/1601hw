package app.task4;

public class Device {
    private String Name;
    private int kVt;

    private void setName(String name){
        this.Name = name;
    }
    public String getName(){
        return this.Name;
    }

    private void setKVt(int _kVt){
        if(_kVt > 0)
            this.kVt = _kVt;
    }
    public int getKVt(){
        return this.kVt;
    }

    public Device(String name, int kVt){
        setName(name);
        setKVt(kVt);
    }
}
