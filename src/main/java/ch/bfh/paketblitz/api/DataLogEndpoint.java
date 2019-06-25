package ch.bfh.paketblitz.api;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class DataLogEndpoint {

    private final List<DataLogEntry> entries = new ArrayList<>();

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/entries", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("get all DataLog entries")
    public List<DataLogEntry> getEntries() {
        return entries;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/entries")
    @ApiOperation("create a DataLog entry")
    public void addEntry(@RequestBody DataLogEntry entry) {
        this.entries.add(entry);
    }
}
