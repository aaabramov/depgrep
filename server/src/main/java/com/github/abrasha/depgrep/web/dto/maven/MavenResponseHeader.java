package com.github.abrasha.depgrep.web.dto.maven;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Andrii Abramov on 3/11/17.
 */
@Data
public class MavenResponseHeader {
    
    private Integer status;
    
    @JsonProperty("QTime")
    private Integer queryTime;
    
    @JsonProperty("params")
    private MavenSearchParams mavenSearchParams;
    
    @Override
    public String toString() {
        return "MavenResponseHeader{" +
                "status=" + status +
                ", queryTime=" + queryTime +
                ", mavenSearchParams=" + mavenSearchParams +
                '}';
    }
}
