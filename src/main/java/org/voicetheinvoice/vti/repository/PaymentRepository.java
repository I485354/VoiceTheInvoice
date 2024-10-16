package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Payments;

public interface PaymentRepository extends JpaRepository<Payments, Integer> {
}
