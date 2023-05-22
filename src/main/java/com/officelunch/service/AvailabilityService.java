package com.officelunch.service;

import com.officelunch.model.Availability;

import java.util.List;

public interface AvailabilityService {

    Availability getExistedAval(int userId);
    Availability saveEmployeeStatus(Availability availability,int userId);

    String totalPresent();

}
