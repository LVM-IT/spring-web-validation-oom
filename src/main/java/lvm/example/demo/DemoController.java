package lvm.example.demo;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
public class DemoController {
    private static final Logger logger = getLogger(DemoController.class);

    @PostMapping(value = "/mails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> dispatchMail(@Valid @RequestBody EmailAttachement attachement) {
        logger.info("Attachement-Size {}", attachement.getAttachement().length);
        return ResponseEntity.ok().build();
    }
}
