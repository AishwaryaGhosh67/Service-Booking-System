package com.service.ServiceBookingSystem.services.authentication;

import com.service.ServiceBookingSystem.dto.SignupRequestDTO;
import com.service.ServiceBookingSystem.dto.UserDto;

public interface AuthService {

     UserDto signupClient(SignupRequestDTO signupRequestDTO);

     Boolean presentByEmail(String email);

     UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
