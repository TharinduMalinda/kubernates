package com.spacex.starlink.constellationmonitor.controller;

import com.spacex.starlink.constellationmonitor.service.ConstellationMonitorService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class ConstellationmonitorControllerTest {


    ConstellationMonitorService constellationMonitorService = Mockito.mock(ConstellationMonitorService.class);

    @Test
    @DisplayName("Test Should Pass When Return Constellations")
    void fetchConstellations() {
        ConstellationMonitorService a = new ConstellationMonitorService();
        Assertions.assertThat(constellationMonitorService.fetchConstellations()).isNotNull();
    }

//    @Test
//    void addConstellations() {
//    }
}