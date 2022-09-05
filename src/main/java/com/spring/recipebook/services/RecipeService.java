package com.spring.recipebook.services;

import com.spring.recipebook.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
