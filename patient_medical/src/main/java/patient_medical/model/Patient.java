package patient_medical.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patient_id;
    private String patient_name;

    @OneToMany(mappedBy = "patient")
    private Set<Hospital> hospitals;

    public Set<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(Set<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public Patient() {
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    /*
*   id : number,
  idProduct : string,
  idPatient : string,
  namePatient : string,
  dateGo : string,
  dateOut : string,
  reasonGo : string,
  methodDoctor : string,
  doctor : string*/

}
