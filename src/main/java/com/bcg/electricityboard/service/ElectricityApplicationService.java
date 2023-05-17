package com.bcg.electricityboard.service;

import com.bcg.electricityboard.dto.ElectricityApplicationDto;
import com.bcg.electricityboard.exception.ElectricityApplicationNotFoundException;
import com.bcg.electricityboard.model.ElectricityApplication;
import com.bcg.electricityboard.repository.ElectricityApplicationRepository;
import com.bcg.electricityboard.util.MapperUtil;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ElectricityApplicationService implements IElectricityApplicationService {

    @Autowired
    ElectricityApplicationRepository electricityApplicationRepository;
    public ElectricityApplication getElectricityApplicationByApplicantId (Long applicantId){
        return electricityApplicationRepository.findById(applicantId).orElseThrow(()-> new ElectricityApplicationNotFoundException(applicantId));
    }

    @Override
    public List<ElectricityApplication> getAllApplication(int pageNumber, int pageSize) {
        return electricityApplicationRepository.findAll(PageRequest.of(pageNumber,pageSize)).getContent();
    }

    @Override
    public List<ElectricityApplication> getAllApplication(Date startDate, Date endDate) {
        return electricityApplicationRepository.findByDateOfApplicationBetween(startDate,endDate);
    }

    @Override
    public ElectricityApplication updateApplication(ElectricityApplicationDto electricityApplicationDto) {
        Long id= electricityApplicationRepository.getIdByApplicantId(electricityApplicationDto.getId());
        if(id != null){
            ElectricityApplication electricityApplication = MapperUtil.mapElectricityApplicationDtoToModal(electricityApplicationDto);
            electricityApplication.setId(id);
            return electricityApplicationRepository.save(electricityApplication);
        }
        return null;
    }
}
