public class studentinfo {

    //declaration of variables used in the Student Personal Information class
    private int studentID;
    private String firstName;
    private String lastName;
    private String birthdate; //we are using a string here, as the input looks cleaner as dd/mm/yyyy compared to ddmmyy
    private String phoneNumber; //using a string here, as we would need to use a long in order to store a phone number
    private String email; 
    private String gender;
    private String address;

    /*set methods for each method so we can individually set them, aside from the constructor class. 
    or if we need to change one or two values in specific */
    public void setStudentID(int STUDENTID) {
        studentID = STUDENTID;
    }

    public void setfirstName(String FIRSTNAME) {
        firstName = FIRSTNAME;
    }

    public void setlastName(String LASTNAME) {
        lastName = LASTNAME;
    }

    public void setbirthdate(String BIRTHDATE) {
        birthdate = BIRTHDATE;
    }

    public void setphoneNumber(String PHONENUMBER) {
        phoneNumber = PHONENUMBER;
    }

    public void setemail(String EMAIL) {
        email = EMAIL;
    }

    public void setgender(String GENDER) {
        gender = GENDER;
    }

    public void setaddress(String ADDRESS) {
        address = ADDRESS;
    }

    //get methods for each value, so we can call them individually
    public int getstudentId() {
        return studentID;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getbirthdate() {
        return birthdate;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getemail() {
        return email;
    }

    public String getgender() {
        return gender;
    }

    public String getaddress() {
        return address;
    }

   //constructor class just because
    public studentinfo (int STUDENTID, String FIRSTNAME, String LASTNAME, String BIRTHDATE, String PHONENUMBER, String EMAIL, String GENDER, String ADDRESS) {
        studentID = STUDENTID;
        firstName = FIRSTNAME;
        lastName = LASTNAME;
        birthdate = BIRTHDATE;
        phoneNumber = PHONENUMBER;
        email = EMAIL;
        gender = GENDER;
        address = ADDRESS;
    }






}

