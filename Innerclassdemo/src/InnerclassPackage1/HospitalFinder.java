package InnerclassPackage1;

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

class HospitalService {
    private List<Hospital> hospitals;

    // Constructor to load hospital data from a properties file
    public HospitalService() {
        hospitals = new ArrayList<>();
        loadHospitalDataFromProperties();
    }

    // Load hospital data from the properties file into the ArrayList
    private void loadHospitalDataFromProperties() {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("hospital.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String key : properties.stringPropertyNames()) {
            String[] values = properties.getProperty(key).split(",");
            List<String> treatments = Arrays.asList(values[2].split(";"));

            Hospital hospital = new Hospital(
                    key,
                    values[0],
                    treatments,
                    values[1],
                    values[3],
                    values[4]
            );

            hospitals.add(hospital);
        }
    }

    // Returns a map of hospital codes and names
    public Map<String, String> getHospitals() {
        Map<String, String> hospitalsMap = new HashMap<>();
        for (Hospital hospital : hospitals) {
            hospitalsMap.put(hospital.getHospitalCode(), hospital.getName());
        }
        return hospitalsMap;
    }

    // Returns details of the hospital corresponding to the given hospital code
    public Hospital getHospitalDetails(String hospitalCode) {
        for (Hospital hospital : hospitals) {
            if (hospital.getHospitalCode().equals(hospitalCode)) {
                return hospital;
            }
        }
        return null; // Hospital not found
    }
}

public class HospitalFinder {
    public static void main(String[] args) {
        HospitalService hospitalService = new HospitalService();

        // Display hospitals and their codes
        Map<String, String> hospitalsMap = hospitalService.getHospitals();
        System.out.println("Hospitals and their codes:");
        for (Map.Entry<String, String> entry : hospitalsMap.entrySet()) {
            System.out.println("Hospital Code: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieve and display details of sample hospitals using their codes
        System.out.println("\nDetails of Sample Hospitals:");
        String sampleHospitalCode1 = "H001";
        Hospital sampleHospital1 = hospitalService.getHospitalDetails(sampleHospitalCode1);
        if (sampleHospital1 != null) {
            System.out.println(sampleHospital1);
        } else {
            System.out.println("Hospital with code " + sampleHospitalCode1 + " not found.");
        }

        String sampleHospitalCode2 = "H002";
        Hospital sampleHospital2 = hospitalService.getHospitalDetails(sampleHospitalCode2);
        if (sampleHospital2 != null) {
            System.out.println(sampleHospital2);
        } else {
            System.out.println("Hospital with code " + sampleHospitalCode2 + " not found.");
        }
    }
}

