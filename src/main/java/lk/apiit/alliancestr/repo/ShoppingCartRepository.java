package lk.apiit.alliancestr.repo;


import lk.apiit.alliancestr.model.ShoppingCartModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShoppingCartRepository  extends  JpaRepository<ShoppingCartModel,Integer>{
}
