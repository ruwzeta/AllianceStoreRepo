package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.CardPaymentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardPaymentsRepository extends JpaRepository<CardPaymentsModel,Integer> {
}
