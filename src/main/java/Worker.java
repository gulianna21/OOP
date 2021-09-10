public class Worker {
    private String FIO;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Worker(String FIO, String position, String email, String phone, double salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Worker() {
        this.FIO = "Ivaniv Oleg Gena";
        this.position = "Manager";
        this.email = "ivaniv@oleg.gena";
        this.phone = "+7 999 99 99 999";
        this.salary = 350000.6;
        this.age = 41;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printWorker() {
        System.out.printf("Worker: %s Position: %s Email: %s Phone: %s Salary: %f ru Age: %d", FIO, position, email, phone, salary, age);

    }
}
