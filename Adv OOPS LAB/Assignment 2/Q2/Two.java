package Q2;
//Q2. For every person in an institute details like name, address(consists of street name, -state, city etc), 
//phone number , email id are maintained. A person is either a student or a faculty, For students roll number 
//and course of Study are also maintained. For faculty employee id, department , specialization are to be stored. 
//One should be able to view the object details, and set the attributes. 
//For address one may change it partially depending upon the choice. Design and implement classes in Java
class Address {
    private String street,city,pin,state;
    public Address(String street, String city, String pin, String state) {
        this.street = street; this.city = city; this.pin = pin; this.state = state;
    }
    public void display() {
        System.out.println("Street Name: " + street);
        System.out.println("City: " + city);
        System.out.println("Pin: " + pin);
        System.out.println("State: " + state);
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public void setState(String state) {
        this.state = state;
    }
}

class Person {
    private String name, phoneNumber, email;
    private Address address;

    public Person(String name, Address address, String phoneNumber, String email) {
        this.name = name; this.address = address; this.phoneNumber = phoneNumber; this.email = email;
    }
    public void viewDetails() {
        System.out.println("Name: " + name);
        address.display();
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class Student extends Person {
    private int rollNumber;
    private String course;

    public Student(String name, Address address, String phoneNumber, String email, int rollNumber, String course) {
        super(name, address, phoneNumber, email);
        this.rollNumber = rollNumber; this.course = course;
    }
    public void viewDetails() {
        super.viewDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}

class Faculty extends Person {
    private String employeeId, department, specialization;

    public Faculty(String name, Address address, String phoneNumber, String email, String employeeId, String department, String specialization) {
        super(name, address, phoneNumber, email);
        this.employeeId = employeeId;
        this.department = department;
        this.specialization = specialization;
    }
    public void viewDetails() {
        super.viewDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

public class Two{
    public static void main(String[] args) {
        Address address = new Address("8B", "Kolkata", "700032", "WB");
        Student student = new Student("Arka", address, "1234567890", "arka@example.com", 4378437, "BCSE");
            // Changing the address partially
    address.setStreet("9A");
    address.setCity("Baruipur");
    address.setPin("700144");

    student.setAddress(address);

    // Updating phone number and email
    student.setPhoneNumber("9876543210");
    student.setEmail("arka.updated@example.com");

    System.out.println("\nAfter Address and Contact Details Update:");
    student.viewDetails();

    // Creating a faculty object
    Address facultyAddress = new Address("22B Street", "City", "123456", "State");
    Faculty faculty = new Faculty("Holmes", facultyAddress, "9876543210", "john@example.com", "F123", "Computer Science", "AI");

    System.out.println("\nFaculty Details:");
    faculty.viewDetails();

    // Changing the specialization
    faculty.setSpecialization("Machine Learning");

    System.out.println("\nAfter Specialization Update:");
    faculty.viewDetails();
}
}
       
