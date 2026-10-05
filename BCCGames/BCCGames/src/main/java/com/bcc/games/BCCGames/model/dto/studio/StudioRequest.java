package com.bcc.games.BCCGames.model.dto.studio;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudioRequest {
    @NotBlank(message = "Title is required") // **, "  ", null x "Minecraft
    @Size(
            min = 2,
            max = 100,
            message = "Name must contain 2-100 characters"
    )
    private String name;
    @NotBlank(message = "Title is required") // **, "  ", null x "Minecraft
    @Size(
            min = 2,
            max = 100,
            message = "Country must contain 2-100 characters"
    )
    private String country;

    public StudioRequest(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
