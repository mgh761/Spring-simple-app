package com.demo.app;

import java.util.List;

public interface AdventureService {

    boolean existById(Long id);

    Adventure findAdventureById(Long id);

    List<Adventure> findAll();

    void saveAdventure(Adventure adventure);

    void deleteAllAdventures();

    void deleteAdventureById(long id);

    void modifyAdventure(long id, Adventure adventure);
}
