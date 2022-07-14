package org.acme;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

public class RuntimeExceptionMapper {

  @ServerExceptionMapper
  public RestResponse<?> runtimeException(RuntimeException exception) {
    return ResponseBuilder.create(Response.Status.INTERNAL_SERVER_ERROR).build();
  }

}
