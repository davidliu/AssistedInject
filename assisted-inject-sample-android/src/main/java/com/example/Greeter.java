package com.example;

import com.squareup.inject.assisted.Assisted;
import com.squareup.inject.assisted.AssistedInject;

public final class Greeter {
  private final String greeting;
  private final String exclamation;

  @AssistedInject
  Greeter(@Assisted String greetg, @Exclamation String exclamation) {
    this.greeting = greetg;
    this.exclamation = exclamation;
  }

  public String sayHi(String name) {
    return greeting + ", " + name + exclamation;
  }

  @AssistedInject.Factory
  public interface Factory {
    Greeter create(String greeting);
  }
}
