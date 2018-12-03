package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.ProductReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReviewModel,Integer> {
}
