package app.task1;
public class Human {
    private String Name;
    private int Age;

    public Human(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }



    public void setAge(int age) {
        if(age >0 && age < 200)
            this.Age = age;

    }
    public int getAge() {
        return this.Age;
    }


    public String ShowInfo()
    {
        return "Hello from " + getName() + ", i am " + getAge() + " years old";
    }
    public Human(){

    }


}
