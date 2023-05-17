package com.bcg.electricityboard.controller;

import com.bcg.electricityboard.dto.ElectricityApplicationDto;
import com.bcg.electricityboard.model.ElectricityApplication;
import com.bcg.electricityboard.service.IElectricityApplicationService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/electricity_application")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ElectricityApplicationController {

    @Autowired
    IElectricityApplicationService electricityApplicationService;
    @GetMapping("/{applicantId}")
    public ElectricityApplication getApplicationByApplicantId(@PathVariable Long applicantId){
        return electricityApplicationService.getElectricityApplicationByApplicantId(applicantId);
    }

    @GetMapping("/fetch-all")
    public List<ElectricityApplication> getAllApplication(@RequestParam(defaultValue = "0") int pageNumber,
                                                          @RequestParam(defaultValue = "50") int pageSize){
        return electricityApplicationService.getAllApplication(pageNumber,pageSize);
    }

    @GetMapping("/fetch-all/date")
    public List<ElectricityApplication> getAllApplicationByDateRange(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
                                                          @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate){
        return electricityApplicationService.getAllApplication(startDate,endDate);
    }

    @PutMapping
    public ElectricityApplication updateApplication(@RequestBody @Valid ElectricityApplicationDto electricityApplicationDto){
        return electricityApplicationService.updateApplication(electricityApplicationDto);
    }
}
