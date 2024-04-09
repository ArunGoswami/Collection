package InnerclassPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class HospitalService {
    private List<Hospital> hospitals;

    
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