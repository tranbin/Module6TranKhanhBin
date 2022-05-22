package patient_medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import patient_medical.model.Patient;
@Repository
public interface IPatientRepository extends JpaRepository<Patient, Long> {
}
