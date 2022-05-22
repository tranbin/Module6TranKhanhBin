package patient_medical.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patient_medical.model.Hospital;
import patient_medical.repository.IHospitalRepository;
import patient_medical.service.IHospitalService;

import java.util.List;
@Service
public class HospitalServiceImpl implements IHospitalService {
    @Autowired
    private IHospitalRepository hospitalRepository;

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }
}
