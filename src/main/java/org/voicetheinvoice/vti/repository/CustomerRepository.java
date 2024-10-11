package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {
}
