package com.example.Integracion_OT.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Ha ocurrido un error interno en el servicio.")
public class InternalErrorException extends RuntimeException {
}
