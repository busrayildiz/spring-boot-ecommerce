package com.busrayildiz.ecommerce.dao;

import com.busrayildiz.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

                                                //nameOfJSONEntry
@RepositoryRestResource(collectionResourceRel = "productCategory" , path = "product-category")
public interface IProductCategoryRepository extends JpaRepository<ProductCategory,Long>
{

}
