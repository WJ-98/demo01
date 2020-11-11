package com.rk.core.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Data
@Entity
@Table(name = "appointment")
public class AppointmentEntity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "appointmentTime")
    private Date appointmentTime;

    @Column(name = "number")
    private Integer number;

    @Column(name = "outline")
    private String outline;


}
