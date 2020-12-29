package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    private final boolean verified;
    private final int sentCount;
    private final String feedback;

    public Status(
            @JsonProperty("verified") boolean verified,
            @JsonProperty("sentCount") int sentCount,
            @JsonProperty("feedback") String feedback
    ) {
        this.verified = verified;
        this.sentCount = sentCount;
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return  "{verified=" + verified +
                ", sentCount=" + sentCount +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
