package com.nazifkaraca.cdi;

import com.nazifkaraca.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newTuto")
@ApplicationScoped
public class _04_New {

    @Produces
    public StudentDto produceStudent() {
        return StudentDto.builder()
                .studentId(0L)
                .studentName("Name")
                .build();
    }

    @Produces
    public String produceString() {
        return produceStudent().getStudentName();
    }

    @Getter
    @Inject
    private String consumedData; // Artık `produceString()` metodu tarafından üretilecek
}
