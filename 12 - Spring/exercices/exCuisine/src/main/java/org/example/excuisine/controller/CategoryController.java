package org.example.excuisine.controller;

import jakarta.validation.Valid;
import org.example.excuisine.model.Category;
import org.example.excuisine.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/list")
    public String pageList(Model model){
        model.addAttribute("categories", categoryService.getAll());
        return "category/categoryList";
    }

    @GetMapping("/form")
    public String pageAdd(Model model){
        model.addAttribute("categorie",new Category());
        return "category/categoryForm";
    }



    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("categorie") Category categorie, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "category/categorieForm";
        }
        if (categorie.getId() == null){
            categorie.setId(UUID.randomUUID());
        }
        categoryService.saveOrUpdate(categorie);
        return "redirect:/category/list";
    }

    @GetMapping("/update/{id}")
    public String pageUpdate(@PathVariable("id")UUID id,Model model ){
        model.addAttribute("categorie", categoryService.getById(id));
        return "category/categoryForm";
    }

    @GetMapping("/detail/{id}")
    public String pageDetail(@PathVariable("id") UUID id,Model model){
        model.addAttribute("categorie", categoryService.getById(id));
        return "category/categoryDetail";
    }

    @GetMapping("/delete/{id}")
    public String pageDelete(@PathVariable("id") UUID id){
        categoryService.delete(id);
        return "redirect:/category/list";
    }



}
