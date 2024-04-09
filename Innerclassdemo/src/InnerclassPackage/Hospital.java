package InnerclassPackage;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

class Hospital {
    private String hospitalCode;
    private String name;
    private List<String> treatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    // Parameterless constructor
    public Hospital() {
        // Initialize fields as needed
    }

    // Parameterized constructor
    public Hospital(String hospitalCode, String name, List<String> treatments,
                    String contactPerson, String contactNumber, String location) {
        this.hospitalCode = hospitalCode;
        this.name = name;
        this.treatments = treatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    // Getter and setter methods for all fields
    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<String> treatments) {
        this.treatments = treatments;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalCode='" + hospitalCode + '\'' +
                ", name='" + name + '\'' +
                ", treatments=" + treatments +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

