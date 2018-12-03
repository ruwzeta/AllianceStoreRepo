package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel,Integer> {
}
