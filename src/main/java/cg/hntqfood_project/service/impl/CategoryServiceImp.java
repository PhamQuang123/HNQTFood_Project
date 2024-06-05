package cg.hntqfood_project.service.impl;

import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.service.CategoryService;

import java.util.List;

public class CategoryServiceImp implements CategoryService {
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public boolean save(Category category) {
        return false;
    }

    @Override
    public boolean update(Category category) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;

    }

    @Override
    public Category findCategoryById(int id) {
        return null;
    }

    @Override
    public List<Category> findCategoryNameByName(String categoryName) {
        return null;
    }
}
