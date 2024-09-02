package com.devsuperior.CRUD.repositories;

import com.devsuperior.CRUD.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
