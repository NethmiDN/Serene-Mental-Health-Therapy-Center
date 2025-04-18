package lk.ijse.bo.custom;

import lk.ijse.dto.PatientDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PatientBO {
    boolean savePatient(PatientDTO patientDTO);
    boolean updatePatient(PatientDTO patientDTO);
    boolean deletePatient(String id) throws Exception;
    ArrayList<PatientDTO> loadAllPatient() throws SQLException, ClassNotFoundException ;
    String getNextPatientID() throws SQLException, ClassNotFoundException;
}
