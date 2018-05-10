package theory;

public class Employee {
    private String name;
    private double basicSalary;
    private double coefficient;
    public double MAX_SALARY;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getMAX_SALARY() {
        return MAX_SALARY;
    }

    public void setMAX_SALARY(double MAX_SALARY) {
        this.MAX_SALARY = MAX_SALARY;
    }

    public double getSalary()
    {
        return basicSalary*coefficient;
    }

    public void printInformation()
    {
        System.out.println("Employee: " + this.name + "\nBasic salary: " + this.basicSalary + "\nCoefficient: " + this.coefficient + "\n");
    }

    public boolean raiseSalary(double coef)
    {
        if(basicSalary*coef > MAX_SALARY)
        {
            this.coefficient = coef;
            return true;
        }
        else {
            return false;
        }
    }
}
