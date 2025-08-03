package org.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleRequestDto {

    private String title;
    private String contents;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modugiedAt;
}
