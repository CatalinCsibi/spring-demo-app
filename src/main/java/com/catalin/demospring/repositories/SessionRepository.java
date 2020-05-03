package com.catalin.demospring.repositories;

import com.catalin.demospring.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
