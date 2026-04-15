package br.com.agenda.api.endpoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("teste")
public class TesteEndPoint {
    @GET
    public Response teste() {
        return Response.ok("Teste bem sucedido").build();
    }
}