package br.dev.hygino.magalums.service;

import org.springframework.stereotype.Service;

import br.dev.hygino.magalums.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {
    
    private final NotificationRepository notificationRepository;
}
