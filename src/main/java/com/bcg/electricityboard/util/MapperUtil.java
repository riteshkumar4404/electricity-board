package com.bcg.electricityboard.util;

import com.bcg.electricityboard.dto.ElectricityApplicationDto;
import com.bcg.electricityboard.exception.ElectricityApplicationInvalidNameException;
import com.bcg.electricityboard.model.ElectricityApplication;

import java.util.Date;

public class MapperUtil {

    public static ElectricityApplication mapElectricityApplicationDtoToModal(ElectricityApplicationDto electricityApplicationDto){
        ElectricityApplication electricityApplication = new ElectricityApplication();
//        electricityApplication.setId(electricityApplication.getId());
//        if(!electricityApplicationDto.getApplicantName().matches("[a-zA-Z]+")){
//            throw new ElectricityApplicationInvalidNameException(electricityApplicationDto.getApplicantName());
//        }
        electricityApplication.setApplicantName(electricityApplicationDto.getApplicantName());
        electricityApplication.setCategory(electricityApplicationDto.getCategory());
        electricityApplication.setGovtIdType(electricityApplicationDto.getGovtIdType());
        electricityApplication.setIdNumber(electricityApplicationDto.getIdNumber());
        electricityApplication.setDateOfApplication(electricityApplicationDto.getDateOfApplication());
        electricityApplication.setGender(electricityApplicationDto.getGender());
        electricityApplication.setDistrict(electricityApplicationDto.getDistrict());
        electricityApplication.setDateOfApproval(electricityApplicationDto.getDateOfApproval());
        electricityApplication.setLoadApplied(electricityApplicationDto.getLoadApplied());
        electricityApplication.setOwnership(electricityApplicationDto.getOwnership());
        electricityApplication.setModifiedDate(new Date());
        electricityApplication.setPinCode(electricityApplicationDto.getPinCode());
        electricityApplication.setReviewerComment(electricityApplicationDto.getReviewerComment());
        electricityApplication.setReviewerId(electricityApplicationDto.getReviewerId());
        electricityApplication.setReviewerName(electricityApplicationDto.getReviewerName());
        electricityApplication.setState(electricityApplicationDto.getState());
        electricityApplication.setStatus(electricityApplicationDto.getStatus());
        return electricityApplication;
    }
}
