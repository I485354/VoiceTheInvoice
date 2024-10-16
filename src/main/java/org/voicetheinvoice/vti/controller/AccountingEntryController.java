package org.voicetheinvoice.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.voicetheinvoice.vti.model.Accountingentries;
import org.voicetheinvoice.vti.service.AccountingEntryService;

import java.util.List;

@RestController
@RequestMapping("/api/accountingentries")
public class AccountingEntryController {
    @Autowired
    private AccountingEntryService accountingEntryService;

    @GetMapping
    public List<Accountingentries> getAllEntries() {
        return accountingEntryService.getAllEntries();
    }
    @PostMapping
    public Accountingentries createEntries(@RequestBody Accountingentries accountingEntries) {
        return accountingEntryService.createNewEntries(accountingEntries);
    }


}
