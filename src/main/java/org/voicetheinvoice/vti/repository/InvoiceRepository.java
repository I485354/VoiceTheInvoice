package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
