package com.nxq.movie.api.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Paging implements Serializable {

    private int currentPage;
    private int pageSize;
    private long total;
}
