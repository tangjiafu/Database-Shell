package org.database.shell.starter;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author Lager.Tang
 * create: 2022-06-18 00:18
 **/
@ShellComponent
public class MyCommands {

  @ShellMethod("Add two integers together.")
  public int add(int a, int b) {
    return a + b;
  }
}
