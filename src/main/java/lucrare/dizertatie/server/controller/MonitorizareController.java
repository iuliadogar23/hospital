package lucrare.dizertatie.server.controller;

import io.swagger.annotations.Api;
import lucrare.dizertatie.common.exception.MessagingException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/monitorizare")
@Api("Monitorizare pacient")
public class MonitorizareController {

    @PostMapping
    @Transactional(timeout = 1)
    public ResponseEntity receiveEvents(@RequestBody String nrFisa){
        try {
            JSONObject jsonObject = new JSONObject(nrFisa);
            Integer fisa = (Integer) jsonObject.get("pacientId");
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(URI.create("http://localhost:3333/simulator/subscribe?pacientId="+ fisa.toString())).GET().build();
            var lines = client.send(request, HttpResponse.BodyHandlers.ofLines()).body();
            lines.forEach(System.out::println);
            System.out.println(lines.collect(Collectors.joining("\n")));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new MessagingException("Failed to receive event", e);
        }
        return ResponseEntity.ok().build();
    }

}
