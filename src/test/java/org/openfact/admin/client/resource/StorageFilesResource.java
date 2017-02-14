package org.openfact.admin.client.resource;

import org.jboss.resteasy.annotations.cache.NoCache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface StorageFilesResource {

    @GET
    @Path("{idFile}")
    @NoCache
    Response getFile(@PathParam("idFile") String idFile);

}
