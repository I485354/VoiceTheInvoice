package org.voicetheinvoice.vti.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.voicetheinvoice.vti.model.Invoices;
import org.voicetheinvoice.vti.repository.InvoiceRepository;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoices> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoices createInvoice(Invoices invoices) {
        return invoiceRepository.save(invoices);
    }

}
