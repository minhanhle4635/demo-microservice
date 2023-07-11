package com.demo.customer.repositories;

import com.demo.customer.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    @Query(value = "SELECT * from account where id = :id", nativeQuery = true)
    AccountEntity findAllById(Long id);
}
