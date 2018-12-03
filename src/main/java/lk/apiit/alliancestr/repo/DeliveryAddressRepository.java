package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.DeliveryAdderssModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryAddressRepository extends JpaRepository<DeliveryAdderssModel,Integer> {
}
