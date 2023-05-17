package com.bcg.electricityboard.service;

import com.bcg.electricityboard.dto.ElectricityApplicationDto;
import com.bcg.electricityboard.model.ElectricityApplication;

import java.util.Date;
import java.util.List;

public interface IElectricityApplicationService {
    ElectricityApplication getElectricityApplicationByApplicantId (Long applicantId);

    List<ElectricityApplication> getAllApplication(int pageNumber, int pageSize);

    List<ElectricityApplication> getAllApplication(Date startDate, Date endDate);

    ElectricityApplication updateApplication(ElectricityApplicationDto electricityApplicationDto);
}
