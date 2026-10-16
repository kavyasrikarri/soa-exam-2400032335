
package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.CampingSite;
import com.klef.soa.exam.service.CampingSiteService;

@RestController
@RequestMapping("/campingsite")
@CrossOrigin
public class CampingSiteController {

    @Autowired
    private CampingSiteService service;

    
    @GetMapping("/")
    public String home() {
        return "Camping Site Service is running";
    }

    // Add
    @PostMapping("/add")
    public CampingSite addCampingSite(@RequestBody CampingSite site) {
        return service.addCampingSite(site);
    }

    
    @GetMapping("/displayall")
    public List<CampingSite> displayAll() {
        return service.getAllCampingSites();
    }

    
    @DeleteMapping("/delete/{id}")
    public String deleteCampingSite(@PathVariable Long id) {
        return service.deleteCampingSite(id);
    }
}
