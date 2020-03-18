package com.busrayildiz.ecommerce.dao;

import com.busrayildiz.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> /*<EntityType,PKType> */
{

}
