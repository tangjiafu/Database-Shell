package org.database.shell.starter;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication
public class SpringShellSample {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringShellSample.class, args);
  }

  @Bean
  public PromptProvider myPromptProvider() {
    return () -> new AttributedString("my-shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
  }
}