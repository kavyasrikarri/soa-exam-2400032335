
package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.CampingSite;
import com.klef.soa.exam.repository.CampingSiteRepository;

@Service
public class CampingSiteServiceImpl implements CampingSiteService {

    @Autowired
    private CampingSiteRepository repository;

    @Override
    public CampingSite addCampingSite(CampingSite site) {
        return repository.save(site);
    }

    @Override
    public List<CampingSite> getAllCampingSites() {
        return repository.findAll();
    }

    @Override
    public String deleteCampingSite(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Camping site deleted successfully";
        } else {
            return "Camping site not found";
        }
    }
}
