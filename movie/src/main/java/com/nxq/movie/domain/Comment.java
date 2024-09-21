package com.nxq.movie.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comment extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
