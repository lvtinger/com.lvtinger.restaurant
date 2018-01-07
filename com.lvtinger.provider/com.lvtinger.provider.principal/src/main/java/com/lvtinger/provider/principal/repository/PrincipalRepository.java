package com.lvtinger.provider.principal.repository;

import com.lvtinger.restaurant.user.entities.Principal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincipalRepository extends JpaRepository<Principal, Long> {
}
