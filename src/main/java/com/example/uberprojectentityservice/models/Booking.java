package com.example.uberprojectentityservice.models;
import com.example.uberprojectentityservice.models.BaseModel;
import com.example.uberprojectentityservice.models.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(indexes = {
        @Index(columnList = "driver_id")
})
public class Booking extends BaseModel {

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;

    @OneToOne
    private ExactLocation startLocation;

    @OneToOne
    private ExactLocation dropLocation;

}
