package com.service.ServiceBookingSystem.services.company;

import java.io.IOException;
import java.util.List;

import com.service.ServiceBookingSystem.dto.AdDTO;
import com.service.ServiceBookingSystem.dto.ReservationDTO;

public interface CompanyService {

    boolean postAd(Long userId, AdDTO adDTO) throws IOException;

    List<AdDTO> getAllAds(Long userId);

    AdDTO getAdById(Long adId);

    boolean updateAd(Long adId, AdDTO adDTO) throws IOException;

    boolean deleteAd(Long adId);

    List<ReservationDTO> getAllAdBookings(Long companyId);

    boolean changeBookingStatus(Long bookingId, String status);
}
