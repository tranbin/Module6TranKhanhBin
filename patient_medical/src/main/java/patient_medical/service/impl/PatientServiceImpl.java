package patient_medical.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patient_medical.model.Patient;
import patient_medical.repository.IPatientRepository;
import patient_medical.service.IPatientService;

import java.util.List;
@Service
public class PatientServiceImpl implements IPatientService {
    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}
