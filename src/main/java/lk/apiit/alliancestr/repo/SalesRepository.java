package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.SaleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<SaleModel,Integer> {
}
