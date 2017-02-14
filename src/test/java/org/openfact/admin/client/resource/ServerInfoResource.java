package org.openfact.admin.client.resource;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/admin/serverinfo")
public interface ServerInfoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    JsonObject getInfo();

}
