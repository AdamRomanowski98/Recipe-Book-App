package com.spring.recipebook.repositories;


import com.spring.recipebook.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
