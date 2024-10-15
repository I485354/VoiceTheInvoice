package org.voicetheinvoice.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.voicetheinvoice.vti.model.Invoices;
import org.voicetheinvoice.vti.service.InvoiceService;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<Invoices> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @PostMapping
    public Invoices createInvoice(@RequestBody Invoices invoices) {
        return invoiceService.createInvoice(invoices);
    }
}
