package com.nazifkaraca.aop.stereotype;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.*;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name = "Merhabalar";
    private String trade;
}
