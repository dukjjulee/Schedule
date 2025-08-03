package org.example.schedule.service;

import lombok.RequiredArgsConstructor;
import org.example.schedule.dto.ScheduleRequestDto;
import org.example.schedule.dto.ScheduleResponseDto;
import org.example.schedule.entity.Schedule;
import org.example.schedule.repository.ScheduleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Transactional
    public ScheduleResponseDto save(ScheduleRequestDto scheduleRequestDto) {
        Schedule saveSchedule = new Schedule(
                scheduleRequestDto.getTitle(),
                scheduleRequestDto.getContents(),
                scheduleRequestDto.getName(),
                scheduleRequestDto.getPassword(),
                scheduleRequestDto.getCreatedAt(),
                scheduleRequestDto.getModugiedAt()
        );

        Schedule savedSchedule = scheduleRepository.save(saveSchedule);

        return new ScheduleResponseDto(savedSchedule);
    }

    @Transactional(readOnly = true)
    public List<ScheduleResponseDto> findSchedule() {
        List<Schedule> schedules = scheduleRepository.findAll();
        List<ScheduleResponseDto> dtos = new ArrayList<>();

        for (Schedule schedule : schedules) {
            ScheduleResponseDto scheduleResponseDto = new ScheduleResponseDto (
                    schedule.getId(),
                    schedule.getTitle(),
                    schedule.getContents(),
                    schedule.getName(),
                    schedule.getCreatedAt(),
                    schedule.getModugiedAt()
            );
            dtos.add(scheduleResponseDto);
        }
        return dtos;
    }
}
