package com.rk.core.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "meetingroom")
public class MeetingroomEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "location")
    private String location;

    @Column(name = "value")
    private Integer value;

    @Column(name = "projection")
    private String projection;

}
