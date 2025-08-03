package org.example.schedule.dto;

import lombok.Getter;
import org.example.schedule.entity.Schedule;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String title;
    private final String contents;
    private final LocalDateTime createdAt;
    private final LocalDateTime modugiedA;
    public ScheduleResponseDto(
            Long id,
            String title,
            String contents,
            String name,
            String password,
            LocalDateTime createdAt,
            LocalDateTime modugiedAt, Long id1, String title1, String contents1, LocalDateTime createdAt1, LocalDateTime modugiedA
    ) {
        this.id = id1;
        this.title = title1;
        this.contents = contents1;
        this.createdAt = createdAt1;
        this.modugiedA = modugiedA;
    }
}
