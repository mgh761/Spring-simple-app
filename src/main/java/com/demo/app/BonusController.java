
package com.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = BonusController.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class BonusController {
    public static final String BASE_URL = "api/vl/bonus";

    @Autowired
    AdventureService adventureService;

    @GetMapping
    public List<Adventure> searchBestOptions(@RequestParam(name = "sport") String tipSport) {
        List<Adventure> allOpstions = adventureService.findAll();
        List<Adventure> bestOptions = new ArrayList<>();

        for (Adventure allOpstion : allOpstions) {
            if (allOpstion.getTipSport().equals(tipSport)) {
                bestOptions.add(allOpstion);
            }
        }

        if(bestOptions.isEmpty())
            return null;
        else
            return bestOptions;
    }
}

