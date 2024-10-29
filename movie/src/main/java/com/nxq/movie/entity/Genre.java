package com.nxq.movie.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "genre")
@Entity
public class Genre extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
