package org.example.schedule.service;

import lombok.RequiredArgsConstructor;
import org.example.schedule.dto.ScheduleRequestDto;
import org.example.schedule.dto.ScheduleResponseDto;
import org.example.schedule.entity.Schedule;
import org.example.schedule.repository.ScheduleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private ScheduleRepository scheduleRepository;

    @Transactional
    public ScheduleResponseDto save(ScheduleRequestDto scheduleRequestDto) {
        Schedule saveSchedule = new Schedule(
                scheduleRequestDto.getTitle(),
                scheduleRequestDto.getContents(),
                scheduleRequestDto.getName(),
                scheduleRequestDto.getPassword()
        );

        Schedule savedSchedule = scheduleRepository.save(saveSchedule);

        return new ScheduleResponseDto(savedSchedule);
    }
}
