package app.task1;

public class Sailor extends Human implements iWork {
    private final String Occupation = "Sailor";
    private String Degree;
    private String CompanyName;

    public Sailor(String name, int age, String degree, String companyName){
        super(name, age);
        setDegree(degree);
        setCompanyName(companyName);
    }

    private void setDegree(String degree)
    {
        this.Degree = degree;
    }
    private void setCompanyName(String companyName)
    {
        this.CompanyName = companyName;
    }
    public String getCompanyName()
    {
        return this.CompanyName;
    }
    public String getDegree()
    {
        return this.Degree;
    }

    public void Work()
    {
        System.out.println("I am like going into sea!.. Oh no! We crashed into iceberg!!!\n");
    }

    public void showInfo(){
        System.out.println(super.getInfo() + " i am " + getDegree() + " and working in " + getCompanyName());
    }
}
