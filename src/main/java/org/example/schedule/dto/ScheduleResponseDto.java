package org.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String name;
    private final String title;
    private final String contents;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public ScheduleResponseDto(
            Long id,
            String title,
            String contents,
            String name,
            LocalDateTime createdAt,
            LocalDateTime ModifiedAt
    ) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = ModifiedAt;
    }
}
