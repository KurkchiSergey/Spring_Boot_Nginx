package ru.netology.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * {@code @ResponseStatus(NOT_FOUND)} — это то, что раньше делал вручную блок
 * {@code catch (NotFoundException e) { resp.setStatus(SC_NOT_FOUND); }} в
 * MainServlet. В Spring MVC для этого не нужен свой try/catch: если
 * исключение с такой аннотацией долетает из контроллера необработанным,
 * DispatcherServlet сам конвертирует его в ответ с соответствующим HTTP-статусом.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
  public NotFoundException() {
  }

  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public NotFoundException(Throwable cause) {
    super(cause);
  }

  public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
