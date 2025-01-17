package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.internal.CharacterResponseDto;

public interface CharacterService {
    CharacterResponseDto getRandom();

    List<CharacterResponseDto> findAllByNamePart(String namePart);
}
