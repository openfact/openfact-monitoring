package org.openfact.admin.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openfact.admin.Openfact;
import org.openfact.admin.OpenfactBuilder;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

public class OrganizationsAdminResourceIT {

    private Openfact openfact = null;

    @Test
    public void organizations() {
        Response response = this.openfact.organizations().findAll();
        Assert.assertThat(response.getStatus(), is(200));

        JsonObject result = response.readEntity(JsonObject.class);
        assertNotNull(result);
    }
}
