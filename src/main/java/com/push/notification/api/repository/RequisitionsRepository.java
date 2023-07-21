package com.push.notification.api.repository;

import com.push.notification.api.model.Requisitions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitionsRepository extends JpaRepository<Requisitions, Long> {
}
