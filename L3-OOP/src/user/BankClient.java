package user;

public class BankClient {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private String password;
    private String address;

    public BankClient() {

    }
    public BankClient(Integer id, String name, Integer age, String email,
                      String phone, String password, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client ID: " + this.id + "\n" + "Client name: " + this.name + "\n" +
                "Client age: " + this.age + "\n" +
                "Client email: " + this.email + "\n" +
                "Client phone: " + this.phone + "\n" +
                "Client address: " + this.address;
    }
}
