
package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.CampingSite;

public interface CampingSiteService {

    CampingSite addCampingSite(CampingSite site);

    List<CampingSite> getAllCampingSites();

    String deleteCampingSite(Long id);
}
