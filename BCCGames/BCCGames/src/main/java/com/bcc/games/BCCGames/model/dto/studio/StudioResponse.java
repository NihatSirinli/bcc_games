package com.bcc.games.BCCGames.model.dto.studio;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudioResponse {
    private Long id;
    private String name;
    private String country;

    public StudioResponse(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
