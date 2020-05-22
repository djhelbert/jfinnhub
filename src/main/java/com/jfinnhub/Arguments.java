package com.jfinnhub;

import java.util.ArrayList;
import java.util.List;
import com.beust.jcommander.Parameter;

public class Arguments {
  @Parameter
  private List<String> parameters = new ArrayList<>();

  @Parameter(names = "-symbol", description = "Symbol")
  private String symbol;
}
