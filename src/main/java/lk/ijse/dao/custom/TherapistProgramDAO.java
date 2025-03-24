package lk.ijse.dao.custom;

import lk.ijse.entity.Therapist;
import lk.ijse.entity.TherapyProgram;

public interface TherapistProgramDAO extends CrudDAO <TherapyProgram>{
    Therapist getById(String therapyProgramId);

}
