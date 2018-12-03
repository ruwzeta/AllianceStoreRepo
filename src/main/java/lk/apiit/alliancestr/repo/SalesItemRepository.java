package lk.apiit.alliancestr.repo;


import lk.apiit.alliancestr.model.SalesItemModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SalesItemRepository extends JpaRepository <SalesItemModel,Integer> {
}
