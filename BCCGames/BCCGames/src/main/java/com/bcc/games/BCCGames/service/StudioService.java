package com.bcc.games.BCCGames.service;

import com.bcc.games.BCCGames.model.entity.Studio;
import com.bcc.games.BCCGames.repository.StudioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudioService {

    private final StudioRepository studioRepository;
    private Long id;

    public List<Studio> getAllStudios() {
        return studioRepository.findAll();
    }

    public Studio getStudioById(){
        return studioRepository.findById(id)
                .orElseThrow();
    }

    public Studio createStudio(Studio studio) {
        return studioRepository.save(studio);
    }

    public void delete(Long id){
        studioRepository.deleteById(id);
    }
}
