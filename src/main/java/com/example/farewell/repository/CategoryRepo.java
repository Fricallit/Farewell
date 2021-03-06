package com.example.farewell.repository;

import com.example.farewell.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
    Category findByName(String name);
}
