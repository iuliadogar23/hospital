package lucrare.dizertatie.server.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lucrare.dizertatie.server.model.FisaMedicala;
import lucrare.dizertatie.server.service.FisaMedicalaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Api(tags = "Fisa Medicala")
@RequestMapping("/fisa-medicala")
@RequiredArgsConstructor
public class FisaMedicalaController {

    private final FisaMedicalaService fisaMedicalaService;

    @GetMapping
    public ResponseEntity<List<FisaMedicala>> getAll() {
        return ResponseEntity.ok(fisaMedicalaService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<FisaMedicala> save(@RequestBody FisaMedicala fisaMedicala) {
        return ResponseEntity.ok(fisaMedicalaService.save(fisaMedicala));
    }

}
