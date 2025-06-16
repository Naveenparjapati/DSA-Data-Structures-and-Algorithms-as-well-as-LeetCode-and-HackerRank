package predrive;
import java.util.Arrays;
public class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;
    public Employee(int id,String name, double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString() {
        return id+" "+name+" "+ salary;
    }
    public int compareTo(Employee emp) {

        return this.id-emp.id;
    }
    public static void main(String[] args) {
        Employee e1= new Employee(112,"A",8000);
        Employee e2= new Employee(121,"B",900000);
        Employee e3= new Employee(29,"C",50000);
        Employee arr[]= {e1,e2,e3};
        Arrays.sort(arr);
        for(Employee a:arr) {
            System.out.println(a);
        }

    }
}
