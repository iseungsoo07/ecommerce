package com.zerobase.userapi.repository;

import com.zerobase.userapi.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
