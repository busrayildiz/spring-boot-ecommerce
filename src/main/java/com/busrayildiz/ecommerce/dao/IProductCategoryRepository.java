package com.busrayildiz.ecommerce.dao;

import com.busrayildiz.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//nameOfJSONEntry
@RepositoryRestResource(collectionResourceRel = "productCategory" , path = "product-category")
@CrossOrigin("http://localhost:4200")
public interface IProductCategoryRepository extends JpaRepository<ProductCategory,Long>
{

}
