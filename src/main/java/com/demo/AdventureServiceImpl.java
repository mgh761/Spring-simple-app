package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdventureServiceImpl implements AdventureService {

    @Autowired
    AdventureRepo adventureRepo;

    @Override
    public Adventure findAdventureById(Long id) {
        return adventureRepo.findById(id).get();
    }

    @Override
    public List<Adventure> findAll() {

        return (List<Adventure>) adventureRepo.findAll();
    }

    @Override
    public Adventure saveAdventure(Adventure adventure) {
        return adventureRepo.save(adventure);
    }

    @Override
    public void deleteAllAdventures() {
        adventureRepo.deleteAll();
    }

    @Override
    public void deleteAdventureById(long id) {
        adventureRepo.deleteById(id);
    }

    @Override
    public void modifyAdventure(long id, Adventure adventure) {
        Adventure newAdventure = adventureRepo.findById(id).get();
        newAdventure.setTara(adventure.getTara());
        newAdventure.setRegiune(adventure.getRegiune());
        newAdventure.setLocalitate(adventure.getLocalitate());
        newAdventure.setTipSport(adventure.getTipSport());
        newAdventure.setCost(adventure.getCost());
        newAdventure.setPerioada(adventure.getPerioada());
        adventureRepo.save(newAdventure);
    }
}
