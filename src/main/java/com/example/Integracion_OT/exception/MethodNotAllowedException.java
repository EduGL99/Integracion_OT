package com.example.Integracion_OT.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "El método aún no es permitido.")
public class MethodNotAllowedException extends RuntimeException {
}
