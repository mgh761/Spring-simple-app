package com.demo.app;

import org.springframework.data.repository.CrudRepository;

public interface AdventureRepo extends CrudRepository<Adventure, Long> {
}
