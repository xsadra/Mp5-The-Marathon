package de.sadrab.Mp5TheMarathon.endpoint;

import de.sadrab.Mp5TheMarathon.model.Runner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/winner")
public class Winner {
    private List<Runner> runners= Runners.runners;

    @GetMapping
    Runner displayWinner(){
        Optional<Runner> winner = runners.stream()
                //.min(Comparator.comparing(Runner::getTime))
                .sorted((e1, e2) -> e1.getTime().compareTo(e2.getTime()))
                .findFirst();
        if (winner.isPresent()){
            return winner.get();
        }
        return new Runner("no runner");
    }
}
