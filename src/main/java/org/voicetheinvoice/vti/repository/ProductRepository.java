package org.voicetheinvoice.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voicetheinvoice.vti.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
