package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.CartItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository <CartItemModel,Integer> {
}
