package iset.bizerte.elearning.contoller;


import iset.bizerte.elearning.Dto.NiveauDto;
import iset.bizerte.elearning.Service.NiveauService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/Niveau")
@RequiredArgsConstructor
public class NiveauController {


    private final NiveauService niveauService;

@GetMapping("/listall")
    public List<NiveauDto> findAll() {
        return niveauService.findAll();
    }

    @GetMapping("/getbyid/{id}")

    public NiveauDto findById(@PathVariable("id") Long id) {
        return niveauService.findById(id);
    }


    @PostMapping("/save")
    public NiveauDto save(@RequestBody   NiveauDto request) {
        return niveauService.save(request);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        niveauService.deleteById(id);
    }


    @PostMapping("/update")
    public NiveauDto uppdate(@RequestBody  NiveauDto request) {
        return niveauService.uppdate(request);
    }

    @GetMapping("/search/{kye}")
    public List<NiveauDto> findbyobjet(@PathVariable("kye")  String kye) {
        return niveauService.findbyobjet(kye);
    }

    public List<NiveauDto> findDate(Date start, Date end) {
        return niveauService.findDate(start, end);
    }
}
