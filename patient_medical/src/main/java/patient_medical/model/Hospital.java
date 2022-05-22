package patient_medical.model;

import javax.persistence.*;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_project;
    private String patient_date_go;
    private String patient_date_out;
    private String reason_go;
    private String method_treatment;
    private String name_doctor;

    public Hospital() {
    }

    @ManyToOne(targetEntity = Patient.class)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Long getId_project() {
        return id_project;
    }

    public void setId_project(Long id_project) {
        this.id_project = id_project;
    }

    public String getPatient_date_go() {
        return patient_date_go;
    }

    public void setPatient_date_go(String patient_date_go) {
        this.patient_date_go = patient_date_go;
    }

    public String getPatient_date_out() {
        return patient_date_out;
    }

    public void setPatient_date_out(String patient_date_out) {
        this.patient_date_out = patient_date_out;
    }

    public String getReason_go() {
        return reason_go;
    }

    public void setReason_go(String reason_go) {
        this.reason_go = reason_go;
    }

    public String getMethod_treatment() {
        return method_treatment;
    }

    public void setMethod_treatment(String method_treatment) {
        this.method_treatment = method_treatment;
    }

    public String getName_doctor() {
        return name_doctor;
    }

    public void setName_doctor(String name_doctor) {
        this.name_doctor = name_doctor;
    }
}
