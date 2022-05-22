package patient_medical.service;

import patient_medical.model.Patient;

import java.util.List;

public interface IPatientService {
    List<Patient> findAll();
}
