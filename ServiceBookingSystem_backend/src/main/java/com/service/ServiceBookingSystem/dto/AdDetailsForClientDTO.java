package com.service.ServiceBookingSystem.dto;

import java.util.List;

public class AdDetailsForClientDTO {

    private AdDTO adDTO;
    private List<ReviewDTO> reviewDTO;

    public AdDTO getAdDTO() {
        return adDTO;
    }

    public void setAdDTO(AdDTO adDTO) {
        this.adDTO = adDTO;
    }

    public List<ReviewDTO> getReviewDTO() {
        return reviewDTO;
    }

    public void setReviewDTO(List<ReviewDTO> reviewDTO) {
        this.reviewDTO = reviewDTO;
    }

        
}
