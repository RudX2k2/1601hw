package app.task4;

public class Steamer extends Device implements iFunctional{
    private final String Type = "Steamer";

    public Steamer(String name, int kVt){
        super(name, kVt);
    }

    public String getType(){
        return this.Type;
    }

    @Override
    public void Sound() {
        System.out.println(getName() + " makes Tuuuu tuuu chuh chuh chuh cuh\n");
    }

    @Override
    public void Show() {
        System.out.println(getType() + " " + getName() + " is spending " + getKVt() + " kVt per hour\n");
    }

    @Override
    public void Desc() {
        System.out.println(getName() + " description:\nLorem ipsum dolor sit amet, consectetur adipiscing elit, \nsed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. \nDuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \nExcepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n");
    }
}
