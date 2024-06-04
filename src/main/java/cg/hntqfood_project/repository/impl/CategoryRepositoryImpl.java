package cg.hntqfood_project.repository.impl;

import cg.hntqfood_project.model.entity.Category;
import cg.hntqfood_project.repository.CategoryRepository;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int id) {

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
