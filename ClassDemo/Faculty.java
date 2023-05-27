
package ClassDemo;


public class Faculty {
    
    String name;
    String fid;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFid() {
        int id = Integer.parseInt(fid);
        return id;
    }

    public void setFid(int fid) {
        this.fid = Integer.toString(fid);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
