/**
 * ============================================================
 * Created by  - Pramoj Kumararathna
 * On          - Jan 03, 2021
 * At          - 12:08 AM
 * ============================================================
 */
package com.spacex.starlink.constellationmonitor.controller;

import com.spacex.starlink.constellationmonitor.model.ConstellationAssign;
import com.spacex.starlink.constellationmonitor.service.ConstellationMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/constellationmonitor")
public class ConstellationmonitorController {
//test123
    @Autowired
    ConstellationMonitorService constellationMonitorService;

    @GetMapping (value = "/fetch")
    public List<ConstellationAssign> fetchConstellations() {
        return constellationMonitorService.fetchConstellations();
    }

    @GetMapping(value = "/add")
    public String addConstellations() {
        constellationMonitorService.addSatelliteConstellation();
        return "Successfully added !";
    }

}
