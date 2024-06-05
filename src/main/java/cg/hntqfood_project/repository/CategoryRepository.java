package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Category;


import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    boolean save(Category category);
    boolean update(Category category);
    boolean delete(int id);
    Category findCategoryById(int id);
    List<Category> findCategoryByName(String categoryName);
}
