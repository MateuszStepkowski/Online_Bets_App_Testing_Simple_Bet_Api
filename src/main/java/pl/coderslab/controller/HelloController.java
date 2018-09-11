package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.dto.GameDTO;

@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);



    @RequestMapping("/get-games")
    public String getCountriesAction() {
        String url = "http://localhost:8080/api/fake-today-games";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GameDTO[]> responseGames = restTemplate.getForEntity(
                url, GameDTO[].class);
        GameDTO[] games = responseGames.getBody();
        for (GameDTO game: games) {logger.info("games {}", game);}
        return "some result";
    }


}