package com.embarkx.ecommerce.repository;


import com.embarkx.ecommerce.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories,Integer> {
    Categories findByCategoryName(String categoryName);
}
