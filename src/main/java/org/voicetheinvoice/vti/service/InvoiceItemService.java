package org.voicetheinvoice.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voicetheinvoice.vti.model.Invoiceitems;
import org.voicetheinvoice.vti.repository.InvoiceitemRepository;

import java.util.List;

@Service
public class InvoiceItemService {
    @Autowired
    private InvoiceitemRepository invoiceitemRepository;

    public List<Invoiceitems> getAllItems(){
        return invoiceitemRepository.findAll();
    }

    public Invoiceitems createItems(Invoiceitems item){
        return invoiceitemRepository.save(item);
    }

}
