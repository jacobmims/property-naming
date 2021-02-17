package com.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmailController {

    @Post("send")
    @Operation(
            summary = "Sends an email.",
            description = "This resource sends an email to the provided recipient(s).")
    public void sendEmails(@Body EmailMessage emailMessage) {
        log.info("{}", emailMessage);
    }
}
