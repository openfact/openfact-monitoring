package org.openfact.admin.client;

import org.junit.Test;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ServerInfoAdminResourceIT extends AbstractResourceIT {

    @Test
    public void testServerInfo() {
        Response response = jaxrsClient.serverInfo().getInfo();
        assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
        JsonObject serverInfo = response.readEntity(JsonObject.class);
        assertNotNull(serverInfo);
    }

}
