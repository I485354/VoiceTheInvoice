package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}
