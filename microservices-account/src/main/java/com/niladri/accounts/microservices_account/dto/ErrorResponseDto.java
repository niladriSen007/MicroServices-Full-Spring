package com.niladri.accounts.microservices_account.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatusCode;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name = "ErrorResponse", description = "Schema to hold Error Response")
public class ErrorResponseDto {
  @Schema(description = "API path invoked by client")
  private String apiPath;

  @Schema(description = "Error code representing the error happened")
  private HttpStatusCode errorCode;

  @Schema(description = "Error message representing the error happened")
  private String errorMessage;

  @Schema(description = "Time representing when the error happened")
  private LocalDateTime errorTime;
}
