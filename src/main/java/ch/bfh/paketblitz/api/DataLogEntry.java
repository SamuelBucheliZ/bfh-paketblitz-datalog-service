package ch.bfh.paketblitz.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataLogEntry {

    private final String applicationName;
    private final ZonedDateTime start;
    private final ZonedDateTime end;
    private final String accountName;
    private final String generatedBarcode;

    @JsonCreator
    public DataLogEntry(
            @JsonProperty("applicationName") String applicationName,
            @JsonProperty("start") ZonedDateTime start,
            @JsonProperty("end") ZonedDateTime end,
            @JsonProperty("accountName") String accountName,
            @JsonProperty("generatedBarcode") String generatedBarcode) {
        this.applicationName = applicationName;
        this.start = start;
        this.end = end;
        this.accountName = accountName;
        this.generatedBarcode = generatedBarcode;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public ZonedDateTime getStart() {
        return start;
    }

    public ZonedDateTime getEnd() {
        return end;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getGeneratedBarcode() {
        return generatedBarcode;
    }
}
