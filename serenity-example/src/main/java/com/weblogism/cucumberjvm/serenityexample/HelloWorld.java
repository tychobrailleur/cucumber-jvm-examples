package com.weblogism.cucumberjvm.serenityexample;

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {
  @Override
  public void init() {
    get("/hello", (req, res) -> "Hello World");
  }    
}
