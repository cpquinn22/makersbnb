package com.makers.makersbnb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// @Entity - instances of this class map to database records
@Entity

// @Table - those records can be found in the spaces table
@Table(name = "SPACES")
@Getter @Setter @NoArgsConstructor

public class Space {

    // the following field (id) is the primary key for this Entity
    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // a second field that holds the name of each space
    private String name;

    private String description;

    private Integer price;

    private String rules;

}

//    // a one-argument constructor
//    public Space(String name, String description, Integer price) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//    }

    // methods that get and set name
//    public String getName() {
//        return this.name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription(){
//        return this.description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Integer getPrice() {
//        return this.price;
//    }
//    public void setPrice(Integer price) {
//        this.price = price;
//    }



