package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Accountingentries;

public interface AccountingEntryRepository extends JpaRepository<Accountingentries, Integer> {
}
