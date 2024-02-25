package com.example.TaxiKu.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepository extends JpaRepository<SecurityProperties.Order,Long> {
}
