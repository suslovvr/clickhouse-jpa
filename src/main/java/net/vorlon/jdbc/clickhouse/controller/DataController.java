package net.vorlon.jdbc.clickhouse.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.vorlon.jdbc.clickhouse.entity.EventEntity;
import net.vorlon.jdbc.clickhouse.repository.EventRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
@Tag(name = "Events", description = "Работа с таблицей events в ClickHouse")
public class DataController {

    private final EventRepository eventRepository;

    public DataController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Operation(summary = "Получить последние 100 событий")
    @GetMapping
    public List<EventEntity> getLastEvents() {
        return eventRepository.findTop100ByOrderByCreatedAtDesc();
    }
}
