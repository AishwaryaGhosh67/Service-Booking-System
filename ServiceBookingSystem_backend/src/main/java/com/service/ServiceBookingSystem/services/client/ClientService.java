package com.service.ServiceBookingSystem.services.client;

import java.util.List;

import com.service.ServiceBookingSystem.dto.AdDTO;
import com.service.ServiceBookingSystem.dto.AdDetailsForClientDTO;
import com.service.ServiceBookingSystem.dto.ReservationDTO;
import com.service.ServiceBookingSystem.dto.ReviewDTO;

public interface ClientService {

    List<AdDTO> getAllAds();

    List<AdDTO> searchAdByName(String name);

    boolean bookService(ReservationDTO reservationDTO);

    AdDetailsForClientDTO getAdDetailsByAdId(Long adId);

    List<ReservationDTO> getAllBookingsByUserId(Long userId);

    boolean giveReview(ReviewDTO reviewDTO);
}
