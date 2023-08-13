package lab2;

public class Person {

    private String idCardNumber;
    private String firstName;
    private String lasttName;
    private String gender;     //true is Men, false is Women
    private Boolean adminId;  //true is admin, false is user

    public Boolean getAdminId() {
        return this.adminId;
    }

    public void setAdminId(Boolean adminId) {
        this.adminId = adminId;
    }

    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return this.lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return (this.firstName + this.lasttName);
    }
}
