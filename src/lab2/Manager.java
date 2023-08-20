package lab2;

public class Manager extends Person {

    private String userName;
    private String password;

    public Manager() {
    }

    public Manager(String userName, String password, String firstName, String lasttName, String gender, String idCardNumber) {
        super.setIdCardNumber(idCardNumber);
        super.setFirstName(firstName);
        super.setLasttName(lasttName);
        super.setGender(gender);

        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
