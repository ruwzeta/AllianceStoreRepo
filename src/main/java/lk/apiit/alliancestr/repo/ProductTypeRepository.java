package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.ProductTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductTypeModel,Integer> {
}
