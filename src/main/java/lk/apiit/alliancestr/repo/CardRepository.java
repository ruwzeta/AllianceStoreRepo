package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.CardModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardModel,Integer> {
}
