package com.spring.recipebook.controllers;


import com.spring.recipebook.model.Category;
import com.spring.recipebook.model.Recipe;
import com.spring.recipebook.model.UnitOfMeasure;
import com.spring.recipebook.repositories.CategoryRepository;
import com.spring.recipebook.repositories.UnitOfMeasureRepository;
import com.spring.recipebook.services.RecipeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String getIndexPage(Model model){
        log.debug("Getting Index page");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }


}
