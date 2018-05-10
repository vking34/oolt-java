package read_write_file;

public class students {

    private int id;
    private String name;
    private String dob;

    public students()
    {

    }

    public students(int id, String name, String dob)
    {
        this.id = id;
        this.dob = dob;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString()
    {
        return  new StringBuffer("ID: ").append(this.id).append(", Name: ").append(this.name).append(", DOB: ").append(this.dob).toString();
    }

}
