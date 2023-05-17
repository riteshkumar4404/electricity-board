package com.bcg.electricityboard.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "electricity_application")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ElectricityApplication {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
     String applicantName;
     String gender;
     String district;
     String state;
     String pinCode;
     String ownership;
     String govtIdType;
     String idNumber;
     String category;
     Integer loadApplied;
     Date dateOfApplication;
     Date dateOfApproval;
     Date modifiedDate;
     String status;
     String reviewerId;
     String reviewerName;
     String reviewerComment;
}
