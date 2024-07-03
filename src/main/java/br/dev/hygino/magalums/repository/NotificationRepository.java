package br.dev.hygino.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.hygino.magalums.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
