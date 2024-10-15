package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Invoices;

public interface InvoiceRepository extends JpaRepository<Invoices, Integer> {
}
