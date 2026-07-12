package com.mianatra.demo.endpoint.rest.controller.health;

import com.mianatra.demo.mail.Email;
import com.mianatra.demo.mail.Mailer;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SendMailController {
  private final Mailer mailer;

  @GetMapping("/mail")
  @SneakyThrows
  public String helloWorld(@RequestParam String to) {
    var email =
        new Email(
            new InternetAddress(to), List.of(), List.of(), "Hello world", "... world!", List.of());
    mailer.accept(email);
    return "Je t'aime !";
  }
}
