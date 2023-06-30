package ch.bfh.paketblitz.api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataLogEndpoint {

    private final List<DataLogEntry> entries = new ArrayList<>();

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/entries", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "get all DataLog entries")
    public List<DataLogEntry> getEntries() {
        return entries;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/entries")
    @Operation(summary = "create a DataLog entry")
    public void addEntry(@RequestBody DataLogEntry entry) {
        this.entries.add(entry);
    }
}
