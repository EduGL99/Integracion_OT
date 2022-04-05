package com.example.Integracion_OT.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Faltan argumentos necesarios en la petición.")
public class BadRequestException extends RuntimeException {
}
