package com.senso.management.dto;

import java.time.LocalDate;

public interface ProjectShowDTO {

    public Long getId();

    public String getName();

    public LocalDate getKickOffDate();

    public LocalDate getDeliveryDate();

    public String getCategory();
}
