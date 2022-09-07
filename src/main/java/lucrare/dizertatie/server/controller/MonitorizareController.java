package lucrare.dizertatie.server.controller;

import io.swagger.annotations.Api;
import lucrare.dizertatie.common.exception.MessagingException;
import lucrare.dizertatie.server.model.FisaMedicala;
import lucrare.dizertatie.server.service.FisaMedicalaService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    FisaMedicalaService fisaMedicalaService;

    @PostMapping
    @Transactional(timeout = 3)
    public ResponseEntity receiveEvents(@RequestBody String nrFisa){
            JSONObject jsonObject = new JSONObject(nrFisa);
            Integer fisa = (Integer) jsonObject.get("pacientId");
            FisaMedicala fisaMedicala = fisaMedicalaService.findById(fisa);
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);


            try {

                restTemplate.getForEntity("http://localhost:3333/simulator/subscribe?pacientId="+ fisa.toString(), ResponseEntity.class);
            } catch (Exception e) {

            }
        return ResponseEntity.ok().build();
    }

}
