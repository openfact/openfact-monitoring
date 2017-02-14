package org.openfact.admin.client.resource;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/admin/organizations")
@Consumes(MediaType.APPLICATION_JSON)
public interface OrganizationsResource {

    @Path("/{organization}")
    OrganizationResource organization(@PathParam("organization") String organization);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    void create(JsonObject organizationRepresentation);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<JsonObject> findAll();

}
