package lucrare.dizertatie.server.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lucrare.dizertatie.server.model.Pacient;
import lucrare.dizertatie.server.service.PacientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Api(tags = "Pacient")
@RequestMapping("/pacient")
@RequiredArgsConstructor
public class PacientController {

    private final PacientService pacientService;

    @GetMapping
    public ResponseEntity<List<Pacient>> getAll()
    {
        return ResponseEntity.ok(pacientService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Pacient> save(@RequestBody Pacient pacient)
    {
        return ResponseEntity.ok(pacientService.save(pacient));
    }

}
