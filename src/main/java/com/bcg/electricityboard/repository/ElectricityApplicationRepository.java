package com.bcg.electricityboard.repository;

import com.bcg.electricityboard.model.ElectricityApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ElectricityApplicationRepository extends JpaRepository<ElectricityApplication,Long> {
    ElectricityApplication findById(String applicantId);

    List<ElectricityApplication> findByDateOfApplicationBetween(Date startDate, Date endDate);

    @Query("select ea.id from ElectricityApplication ea where ea.id like ':applicantId"+"%'")
    Long getIdByApplicantId(Long applicantId);

}
