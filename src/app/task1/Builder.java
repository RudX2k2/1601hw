package app.task1;

public class Builder extends Human implements iWork {
    private final String Occupation = "Builder";
    private String Degree;
    private String CompanyName;

    public Builder(String name, int age, String degree, String companyName){
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
        System.out.println("Who is not works - that eats!\n");
    }

    public void showInfo(){
        System.out.println(super.getInfo() + " i am " + getDegree() + " and working in " + getCompanyName());
    }
}
