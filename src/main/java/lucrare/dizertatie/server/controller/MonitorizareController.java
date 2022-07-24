package lucrare.dizertatie.server.controller;

import io.swagger.annotations.Api;
import lucrare.dizertatie.common.exception.MessagingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@CrossOrigin
@RestController
@RequestMapping("/monitorizare")
@Api("Monitorizare pacient")
public class MonitorizareController {

    @GetMapping
    @Transactional(timeout = 1)
    public void receiveEvents(@RequestParam Integer pacientId){
        try {
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(URI.create("http://localhost:3333/simulator/subscribe?pacientId="+pacientId)).GET().build();
            var lines = client.send(request, HttpResponse.BodyHandlers.ofLines()).body();
            lines.forEach(System.out::println);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new MessagingException("Failed to receive event", e);
        }

    }

}
