package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Invoiceitems;

public interface InvoiceitemRepository extends JpaRepository<Invoiceitems, Integer> {
}
