package br.dev.hygino.magalums.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.hygino.magalums.service.NotificationService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("notification")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService service;
}
