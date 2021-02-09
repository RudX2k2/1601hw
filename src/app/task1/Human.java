package app.task1;
public class Human {
    private String Name;
    private int Age;

    public Human(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }



    private void setAge(int age) {
        if(age >0 && age < 200)
            this.Age = age;

    }
    public int getAge() {
        return this.Age;
    }

    public String getInfo()
    {
        return "Hello from " + getName() + ", i am " + getAge() + " years old";
    }
    public Human(){

    }


}
