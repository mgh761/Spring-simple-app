package com.demo;

import java.util.List;

public interface AdventureService {
    Adventure findAdventureById(Long id);

    List<Adventure> findAll();

    Adventure saveAdventure(Adventure adventure);

    void deleteAllAdventures();

    void deleteAdventureById(long id);

    void modifyAdventure(long id, Adventure adventure);
}
