package com.example.Integracion_OT.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "No se puede procesar la petición.")
public class UnprocessableEntityException extends RuntimeException {
}
