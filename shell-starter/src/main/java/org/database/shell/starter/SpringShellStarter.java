package org.database.shell.starter;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;

@SpringBootApplication(scanBasePackages = "org.database.shell")
public class SpringShellStarter {

  @Bean
  public PromptProvider myPromptProvider() {
    return () -> new AttributedString("shell:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringShellStarter.class, args);
  }

}