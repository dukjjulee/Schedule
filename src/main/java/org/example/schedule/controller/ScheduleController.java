package org.example.schedule.controller;

import lombok.RequiredArgsConstructor;
import org.example.schedule.dto.ScheduleRequestDto;
import org.example.schedule.dto.ScheduleResponseDto;
import org.example.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ScheduleResponseDto createSchedule(
            @RequestBody ScheduleRequestDto scheduleRequestDto
    ) {
        return scheduleService.save(scheduleRequestDto);
    }

    @GetMapping("/schedules")
    public List<ScheduleResponseDto> getSchedule(){return scheduleService.findSchedule();}

    @GetMapping("/schedules/{scheduleId}")
    public ScheduleResponseDto getSchedule(@PathVariable Long scheduleId) {
        return scheduleService.findSchedule(scheduleId);
    }

    @PutMapping("/schedule/{scheduleId}")
    public ScheduleResponseDto updateSchedule(
            @PathVariable Long scheduleId,
            @RequestBody ScheduleRequestDto scheduleRequestDto
    ) {
        return scheduleService.update(scheduleId,scheduleRequestDto);
    }

    @DeleteMapping("/schedules/{schedule")
    public String deleteSchedule(
            @PathVariable Long scheduleId,
            @RequestBody ScheduleRequestDto dto)
    {
        scheduleService.deleteSchedule(scheduleId, dto);
        return "일정이 삭제 되었습니다.";
    }
}

