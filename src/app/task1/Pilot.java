package app.task1;
import app.task1.Human;

public class Pilot extends Human{
    private final String Occupation = "Pilot";
    private String Degree;
    private String CompanyName;

    public Pilot(String name, int age, String degree, String companyName){
        super(name, age);
        setDegree(degree);
        setCompanyName(companyName);
    }

    public void setDegree(String degree)
    {
        this.Degree = degree;
    }
    public void setCompanyName(String companyName)
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
        System.out.println("How is good there, above the ground! For the honor of our Impertor! Banzaaayyy!!!\n");
    }

    public String showInfo(){
        return super.ShowInfo() + " i am " + Occupation + " and working in " + getCompanyName();
    }
}
