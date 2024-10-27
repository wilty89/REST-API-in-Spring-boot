package com.wilber.Spring.Initializr.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KeyDto<T> {
    private String id;
    private String name;
    private OffsetDateTime createdAt;

    public String getKey() {
        return name;
    }
}
