package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.PreorderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreOrderRepository extends JpaRepository <PreorderModel,Integer> {
}
