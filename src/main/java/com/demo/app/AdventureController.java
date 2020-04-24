package com.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(path = AdventureController.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class AdventureController {

    public static final String BASE_URL = "api/vl/adventures";

    @Autowired
    AdventureService adventureService;

    @GetMapping(value = "/all")
    public ModelAndView getAllAdventures()  {
        ModelAndView modelAndView = new ModelAndView("all");
        modelAndView.addObject("adventures",adventureService.findAll());
        System.out.println("Roses are #ff0000");
        return modelAndView;
    }

    @GetMapping(value = "/get/{id}")
    public Adventure getAdventureById(@PathVariable long id) {
        System.out.println("Violets are #0000ff");
        return adventureService.findAdventureById(id);
    }

    @DeleteMapping(path = "/delete/{id}")

    public void deleteAdventureById(@PathVariable long id) {
        System.out.println("Why my code's working");
        adventureService.deleteAdventureById(id);
    }

    @DeleteMapping(value = "/delete/all")
    public void deleteAllAdventures() {
        System.out.println("I haven't a clue.");
        adventureService.deleteAllAdventures();
    }

    @RequestMapping("/add")

    public ModelAndView saveAdventure(@NotNull @Valid Adventure adventure) {
        ModelAndView modelAndView = new ModelAndView("add");
        adventureService.saveAdventure(adventure);
        modelAndView.addObject("adventures", adventureService.findAll());
        return modelAndView;
    }

    @PatchMapping("/edit/{id}")

    public void modifyAdventure(@PathVariable long id, @RequestBody Adventure adventure) {
        adventureService.modifyAdventure(id, adventure);
    }

}
