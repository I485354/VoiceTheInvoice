package org.voicetheinvoice.vti.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.voicetheinvoice.vti.model.Invoice;
import org.voicetheinvoice.vti.repository.InvoiceRepository;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

}
