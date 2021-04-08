package homeWork_5;

public class Student {
    private int id;
    private String lastName;
    private String firsName;
    private String middleName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(int id, String lastName, String firsName, String middleName, String birthday, String address,
                   String phoneNumber, String faculty, String course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firsName = firsName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setPatronymic(String patronymic) {
        this.middleName = middleName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firsName='" + firsName + '\'' +
                ", patronymic='" + middleName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
