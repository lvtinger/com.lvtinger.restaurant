package com.lvtinger.provider.principal.repository;

import com.lvtinger.restaurant.user.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
