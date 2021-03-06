package com.coffeebeans.springnativeawslambda.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response implements Serializable {

  @NotBlank
  @JsonProperty(access = Access.READ_ONLY)
  private String rank;

  @NotNull
  @JsonProperty(access = Access.READ_ONLY)
  private String saved;

  @NotNull
  @JsonProperty(access = Access.READ_ONLY)
  private List<String> janList;
}
