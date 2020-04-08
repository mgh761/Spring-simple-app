package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = AdventureController.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class AdventureController {

    public static final String BASE_URL = "api/vl/adventures";

    @Autowired
    AdventureService adventureService;

    @GetMapping(value = "all")
    List<Adventure> getAllAdventures() {
        System.out.println("Roses are #ff0000");
       return adventureService.findAll();
    }

    @GetMapping("/{id}")
    Adventure getAdventureById(@PathVariable long id) {
        System.out.println("Violets are #0000ff");
        return adventureService.findAdventureById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteAdventureById(@PathVariable long id) {
        System.out.println("Why my code's working");
        adventureService.deleteAdventureById(id);
    }

    @DeleteMapping(value = "all")
    public void deleteAllAdventures() {
        System.out.println("I haven't a clue.");
        adventureService.deleteAllAdventures();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Adventure saveAdventure(@RequestBody Adventure adventure) {
        return adventureService.saveAdventure(adventure);
    }

    @PatchMapping("/{id}")
    public void modifyAdventure(@PathVariable long id, @RequestBody Adventure adventure) {
        adventureService.modifyAdventure(id, adventure);
    }

}
