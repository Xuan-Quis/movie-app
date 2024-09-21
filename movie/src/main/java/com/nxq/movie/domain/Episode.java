package com.nxq.movie.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "episode")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Episode extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @OneToMany
    @JoinColumn(name = "episode_id")
    private List<Comment> episodes;

}
