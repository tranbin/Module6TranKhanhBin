package patient_medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import patient_medical.model.Hospital;
import patient_medical.service.impl.HospitalServiceImpl;
import patient_medical.service.impl.PatientServiceImpl;

import java.util.List;

@RestController
public class HospitalController {
    @Autowired
    private HospitalServiceImpl hospitalService;

    @Autowired
    private PatientServiceImpl patientService;


}
