package com.ujjwalgarg.mainserver.dto;

import com.ujjwalgarg.mainserver.entity.user.Role;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.ujjwalgarg.mainserver.entity.user.Doctor}
 */
public record DoctorDto(Long id, String email, String firstName, String lastName, LocalDateTime dob,
                        LocalDateTime createdAt, Role role, Double avgRating,
                        Integer noAppointmentsFailed) implements
    Serializable {

}
