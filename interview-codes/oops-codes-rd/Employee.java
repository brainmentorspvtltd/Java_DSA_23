/*
 * PascalCase
 */
/*
 * 
 * Static vs instance
 * Static things bind with class
 * when  class load then static things will be load.
 * 
 * Instance - When object is created then instance things
 * comes in a memory .
 * So it comes Lazy 
 */
class Employee{
    // Data Members (camelCase)
    // Instance Members
    static int count;
    private int id;
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }






    private String name;
    private double salary;
    int counter;
    static {
        count = 100;
    }
    {
        System.out.println("Pre Constructor Call (init block");
        System.out.println(id + " "+name + " "+salary);
    }
    {
        System.out.println("Init Block 2");
    }
    // Default Constructor
    Employee(){
        count++;
        System.out.println("Default Cons Call "+count);

    }
    // Local 
    Employee(int id, String name, double salary){
        // Local Var and Instance Var (Shadow Problem)
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    

    

    void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}