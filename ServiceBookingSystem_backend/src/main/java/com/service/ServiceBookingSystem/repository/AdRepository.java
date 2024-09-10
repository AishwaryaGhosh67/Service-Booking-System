package com.service.ServiceBookingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.ServiceBookingSystem.entity.Ad;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {

    List<Ad> findAllByuserId(Long userId);

    List<Ad> findAllByServiceNameContaining(String name);

}
