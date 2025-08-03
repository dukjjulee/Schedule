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
public class Scgedule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
