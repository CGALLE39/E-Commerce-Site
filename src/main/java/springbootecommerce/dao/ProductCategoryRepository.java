package springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootecommerce.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
