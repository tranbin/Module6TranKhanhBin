package patient_medical.service;

import patient_medical.model.Hospital;

import java.util.List;

public interface IHospitalService {
    List<Hospital> findAll();
}
