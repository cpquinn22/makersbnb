package com.makers.makersbnb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@NoArgsConstructor


@Table(name="team")
public class Team {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String role;

}
