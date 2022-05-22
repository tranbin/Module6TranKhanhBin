package patient_medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import patient_medical.model.Hospital;
@Repository
public interface IHospitalRepository extends JpaRepository<Hospital, Long> {
}
