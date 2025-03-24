package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.TherapyProgramsBO;
import lk.ijse.dao.custom.TherapistDAO;
import lk.ijse.dao.custom.TherapistProgramDAO;
import lk.ijse.dao.custom.impl.TherapistDAOImpl;
import lk.ijse.dto.TherapyProgramDTO;
import lk.ijse.entity.Therapist;
import lk.ijse.entity.TherapyProgram;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TherapyProgramsBOImpl implements TherapyProgramsBO {
    TherapistDAO therapistDAO = new TherapistDAOImpl();

    TherapistProgramDAO therapyProgramDAO = new TherapistProgramDAO() {
        @Override
        public boolean save(TherapyProgram entity) {
            return false;
        }

        @Override
        public boolean update(TherapyProgram entity) {
            return false;
        }

        @Override
        public boolean deleteByPK(String id) throws Exception {
            return false;
        }

        @Override
        public List<TherapyProgram> getAll() {
            return List.of();
        }

        @Override
        public String getNextId() {
            return "";
        }

        @Override
        public Therapist getById(String therapyProgramId) {
            return null;
        }
    };

    @Override
    public ArrayList<TherapyProgramDTO> loadAllTherapyPrograms() throws SQLException, ClassNotFoundException {
        ArrayList<TherapyProgramDTO> therapyProgramDTOS = new ArrayList<>();
        List<TherapyProgram> therapyPrograms = therapyProgramDAO.getAll();

        for (TherapyProgram therapyProgram : therapyPrograms) {
            therapyProgramDTOS.add(
                    new TherapyProgramDTO(
                            therapyProgram.getId(),
                            therapyProgram.getName(),
                            therapyProgram.getDuration(),
                            therapyProgram.getFee(),
                            therapyProgram.getTherapist().getId() // Fix: Extract therapist ID
                    )
            );
        }
        return therapyProgramDTOS;
    }

    @Override
    public String getNextTherapyProgramId() {
        return therapyProgramDAO.getNextId();
    }

    @Override
    public boolean saveTherapyPrograms(TherapyProgramDTO therapyProgramDTO) {
        // Retrieve the Therapist entity using the therapist ID
        Therapist therapist = therapistDAO.getById(therapyProgramDTO.getTherapistId());

        if (therapist == null) {
            throw new IllegalArgumentException("Therapist not found for ID: " + therapyProgramDTO.getTherapistId());
        }

        return therapyProgramDAO.save(
                new TherapyProgram(
                        therapyProgramDTO.getId(),
                        therapyProgramDTO.getName(),
                        therapyProgramDTO.getDuration(),
                        therapyProgramDTO.getFee(),
                        therapist // Fix: Pass Therapist entity, not String
                )
        );
    }


    @Override
    public boolean updateTherapyPrograms(TherapyProgramDTO therapyProgramDTO) {
        // Retrieve the Therapist entity using the therapist ID
        Therapist therapist = therapistDAO.getById(therapyProgramDTO.getTherapistId());

        if (therapist == null) {
            throw new IllegalArgumentException("Therapist not found for ID: " + therapyProgramDTO.getTherapistId());
        }

        return therapyProgramDAO.update(
                new TherapyProgram(
                        therapyProgramDTO.getId(),
                        therapyProgramDTO.getName(),
                        therapyProgramDTO.getDuration(),
                        therapyProgramDTO.getFee(),
                        therapist // Fix: Pass Therapist entity, not String
                )
        );
    }

    @Override
    public boolean deleteTherapyPrograms(String id) throws Exception {
        return therapyProgramDAO.deleteByPK(id);
    }


}
