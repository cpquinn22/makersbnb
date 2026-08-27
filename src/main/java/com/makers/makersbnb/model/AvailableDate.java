package com.makers.makersbnb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity

@Table(name = "available_dates")
@Getter
@Setter
@NoArgsConstructor
public class AvailableDate {

    // the following field (id) is the primary key for this Entity
    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @ManyToOne

    @JoinColumn(name = "space_id")
    private Space space;

}
