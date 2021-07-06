package br.com.marvelapi.marvelapi.controller;

import br.com.marvelapi.marvelapi.dao.CharacterDao;
import br.com.marvelapi.marvelapi.entity.Character;
import br.com.marvelapi.marvelapi.worker.MarvelIntegration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CharacterController.class)
class CharacterControllerTest {

    @MockBean
    private CharacterController characterController;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCharacterById() throws Exception {
        List<Character> result = getCharacters();
        Mockito.when(characterController.getAllCharacters()).thenReturn(result);
        this.mockMvc.perform(get("/v1/public/characters/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().string(containsString("Hulk")));
    }

    @Test
    void findComicsByCharacterId() throws Exception {
        List<Character> result = getCharacters();
        Mockito.when(characterController.getAllCharacters()).thenReturn(result);
        this.mockMvc.perform(get("/v1/public/characters/1/comics"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    private List<Character> getCharacters() {
        List<Character> result = new ArrayList<>();
        Character character = new Character();
        character.setName("Hulk");
        result.add(character);
        return result;
    }

    @Test
    void findEventsByCharacterId() throws Exception {
        List<Character> result = getCharacters();
        Mockito.when(characterController.getAllCharacters()).thenReturn(result);
        this.mockMvc.perform(get("/v1/public/characters/1/events"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findSeriesByCharacterId() throws Exception {
        List<Character> result = getCharacters();
        Mockito.when(characterController.getAllCharacters()).thenReturn(result);
        this.mockMvc.perform(get("/v1/public/characters/1/series"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findStoriesByCharacterId() throws Exception {
        List<Character> result = getCharacters();
        Mockito.when(characterController.getAllCharacters()).thenReturn(result);
        this.mockMvc.perform(get("/v1/public/characters/stories"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void findAndSaveByCustomCharacterId() throws Exception {
        List<Character> result = getCharacters();
        Mockito.when(characterController.getAllCharacters()).thenReturn(result);
        this.mockMvc.perform(get("/v1/public/characters/1/save"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}