package org.arouabendaya.theresidencehotel.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingResponse {
    private Long BookingId ;
    private LocalDate checkInDate ;
    private LocalDate getCheckInDateDate ;
    private String guestFullName ;
    private String guestEmail ;
    private int NumOfAdults ;
    private int NumOfChildren ;
    private int totalNumOfGuest ;
    private String bookingConfirmationCode ;


    public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate getCheckInDateDate,
                           String bookingConfirmationCode ) {
        BookingId = bookingId;
        this.checkInDate = checkInDate;
        this.getCheckInDateDate = getCheckInDateDate;
        this.bookingConfirmationCode = bookingConfirmationCode;


    }


    //Missing implementation
    public void add(BookingResponse bookingResponse) {
    }
}
