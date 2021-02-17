package com.example;

import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Introspected
@Schema
public class EmailMessage {

    @Schema(description = "Unique identifier of the email being sent.")
    @Min(0)
    @NotNull
    private Long emailId;

    @Schema(description = "The sender of the email.")
    @NotNull
    private EmailContact from;

    @Schema(description = "The recipient of the email.")
    @NotNull
    private EmailContact to;

    @Schema(description = "List of recipients to receive a carbon copy")
    @Size(max = 100)
    private List<EmailContact> cc;

    @Schema(description = "List of recipients to receive a blind carbon copy")
    @Size(max = 100)
    private List<EmailContact> bcc;

    @Schema(description = "Map of headers for the email message.")
    @Size(max = 100)
    private Map<String, List<String>> headers;

    @Schema(description = "Subject of the email.")
    @Size(max = 255)
    @NotNull
    private String subject;

    @Schema(description = "Plain text content of the email.")
    private String textContent;

    @Schema(description = "HTML content of the email.")
    private String htmlContent;
}
