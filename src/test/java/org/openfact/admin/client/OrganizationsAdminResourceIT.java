package org.openfact.admin.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

public class OrganizationsAdminResourceIT {

    private Client client;
    private WebTarget tut;

    @Before
    public void initClient() {
        this.client = ClientBuilder.newClient();
        this.tut = this.client.target("http://localhost:8081/openfact/admin");
    }

    @Test
    public void organizations() {
        Response response = this.tut.request(MediaType.APPLICATION_JSON).get();
        Assert.assertThat(response.getStatus(), is(200));

        JsonObject result = response.readEntity(JsonObject.class);
        assertNotNull(result);
    }
}
