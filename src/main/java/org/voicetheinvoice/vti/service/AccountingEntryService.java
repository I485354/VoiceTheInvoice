package org.voicetheinvoice.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voicetheinvoice.vti.model.Accountingentries;
import org.voicetheinvoice.vti.repository.AccountingEntryRepository;

import java.util.List;

@Service
public class AccountingEntryService {
    @Autowired
    private AccountingEntryRepository accountingEntryRepository;

    public List<Accountingentries>
    getAllEntries() {
        return accountingEntryRepository.findAll();
    }
    public Accountingentries createNewEntries(Accountingentries entries) {
        return accountingEntryRepository.save(entries);  // Gebruik de instantie, niet de klasse
    }
}
