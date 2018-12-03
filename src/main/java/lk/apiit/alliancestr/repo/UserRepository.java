package lk.apiit.alliancestr.repo;

import lk.apiit.alliancestr.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<UserModel, String> {
}
