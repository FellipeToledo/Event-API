package com.toledo.eventapi.entity;

import com.toledo.eventapi.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * @author Fellipe Toledo
 * @created 12/06/2022
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Event")
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime registerDateTime = LocalDateTime.now();

    @Column(name = "event_type")
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name = "id_source")
    private String source;

    @Column(name = "starting_date_time")
    private LocalDateTime startingDateTime;

    @Column(name = "end_date_time")
    private LocalDateTime endDateTime;
    
    private String location;

    private String description;

    @Column(name = "blocked_roads")
    private String blockedRoads;

    @Column(name = "impacted_lines")
    private String impactedLines;

    //private CimuReport cimuReport;

}
