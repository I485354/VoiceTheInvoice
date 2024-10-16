package org.voicetheinvoice.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voicetheinvoice.vti.model.Payments;
import org.voicetheinvoice.vti.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payments> GetALlPayments() {
        return paymentRepository.findAll();
    }
    public Payments createPayment(Payments payment) {
        return paymentRepository.save(payment);
    }
}
