package com.nxq.movie.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie")
    private List<Episode> episodes;

    @ManyToMany
    @JoinTable(name = "genre_movie",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres;


}
