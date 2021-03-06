package com.coffeebeans.springnativeawslambda.model;

import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request implements Serializable {

  @NotBlank
  private String name;

  @NotBlank
  private String pro;

}
