package cg.hntqfood_project.repository;

import cg.hntqfood_project.model.entity.Category;


import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    void save(Category category);
    void update(Category category);
    void delete(int id);
    Category findCategoryById(int id);
    List<Category> findCategoryNameByName(String categoryName);
}
