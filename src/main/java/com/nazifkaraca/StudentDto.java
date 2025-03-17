package com.nazifkaraca;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

// Data Transfer Object (DTO)
// Data transfer between objects
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;
}
