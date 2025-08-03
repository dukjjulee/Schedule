package org.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String name;
    private final String password;
    private final String title;
    private final String contents;
    private final LocalDateTime createdAt;
    private final LocalDateTime modugiedAt;


    public ScheduleResponseDto(
            Long id,
            String title,
            String contents,
            String name,
            String password,
            LocalDateTime createdAt,
            LocalDateTime modugiedAt
    ) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.password = password;
        this.createdAt = createdAt;
        this.modugiedAt = modugiedAt;
    }
}
