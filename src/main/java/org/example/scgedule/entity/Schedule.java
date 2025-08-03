package org.example.scgedule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Schedule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titly;
    private String contents;
    private String name;
    private String password;

    public Schedule(String titly, String contents, String name, String password) {
        this.titly = titly;
        this.contents = contents;
        this.name = name;
        this.password = password;
    }
    public void updateName(String titly, String contents, String name, String password) {
        this.titly = titly;
        this.contents = contents;
        this.name = name;
        this.password = password;
    }
}
