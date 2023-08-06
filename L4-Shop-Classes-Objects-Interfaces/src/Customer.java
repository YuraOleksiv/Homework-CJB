public class Customer {
    protected String name;
    protected Integer age;
    protected Double balance;

    public Customer() {
    }

    public Customer(String name, Integer age, Double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
