package com.bcg.electricityboard.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ElectricityApplicationDto {
    Long id;
    @NotNull
    String applicantName;
    String gender;
    String district;
    String state;
    String pinCode;
    String ownership;
    String govtIdType;
    String idNumber;
    String category;

    @Max(200)
    Integer loadApplied;
    Date dateOfApplication;
    Date dateOfApproval;
    Date modifiedDate;
    String status;
    String reviewerId;
    String reviewerName;
    String reviewerComment;
}
