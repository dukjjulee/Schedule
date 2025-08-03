package org.example.schedule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class Schedule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String contents;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modugiedAt;

    public Schedule(String title, String contents, String name, String password, LocalDateTime createdAt, LocalDateTime modugiedAt) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.password = password;
        this.createdAt = createdAt;
        this.modugiedAt = modugiedAt;
    }
    public void updateName(String title, String contents, String name, String password, LocalDateTime createdAt, LocalDateTime modugiedAt) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.password = password;
        this.createdAt = createdAt;
        this.modugiedAt = modugiedAt;
    }


}
