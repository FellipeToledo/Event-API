package com.toledo.eventapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "id_cor")
    private String idCor;

    @Column(name = "starting_date_time")
    private LocalDateTime startingDateTime;

    @Column(name = "end_date_time")
    private LocalDateTime endDateTime;

    private String location;

    private String description;

    @Column(name = "impacted_lines")
    private Integer impactedLines;

    //private CimuReport cimuReport;

}
