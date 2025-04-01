package me.dio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
}
