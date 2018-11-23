package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MementoApiService;
import io.swagger.api.factories.MementoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.MementoItem;
import io.swagger.model.ModelApiResponse;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/memento")


@io.swagger.annotations.Api(description = "the memento API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T14:41:06.005Z[GMT]")

public class MementoApi  {
   private final MementoApiService delegate;

   public MementoApi(@Context ServletConfig servletContext) {
      MementoApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MementoApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MementoApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MementoApiServiceFactory.getMementoApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "add a new memento in system", notes = "add a new memento in system", response = Void.class, tags={ "Memento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Memento created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Memento Input", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Memento already exist", response = Void.class) })
    public Response addmemento(@ApiParam(value = "Destination to store" ,required=true) MementoItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addmemento(body,securityContext);
    }

    @DELETE
    @Path("/{mementoId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a memento", notes = "", response = Void.class, tags={ "Memento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Memento not found", response = Void.class) })
    public Response deleteMemento(@ApiParam(value = "Memento id to delete",required=true) @PathParam("mementoId") Long mementoId
,@ApiParam(value = "" )@HeaderParam("api_key") String apiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteMemento(mementoId,apiKey,securityContext);
    }

    @GET
    @Path("/{mementoId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find memento by ID", notes = "Returns a single memento", response = MementoItem.class, tags={ "Memento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MementoItem.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Memento not found", response = Void.class) })
    public Response getMementoById(@ApiParam(value = "ID of memento to return",required=true) @PathParam("mementoId") Long mementoId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMementoById(mementoId,securityContext);
    }

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns all registried mementos.", notes = "returns all registried mementos.", response = MementoItem.class, responseContainer = "List", tags={ "Memento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MementoItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getallmementos(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getallmementos(securityContext);
    }

    @PUT
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Update an existing memento", notes = "", response = Void.class, tags={ "Memento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Memento not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateMemento(@ApiParam(value = "memento object that needs to be added to the store" ,required=true) MementoItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateMemento(body,securityContext);
    }

    @POST
    @Path("/{mementoId}/uploadRecordedVoice")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "uploads a voice recorded", notes = "", response = ModelApiResponse.class, tags={ "Memento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    public Response uploadRecordedVoice(@ApiParam(value = "ID of memento to update",required=true) @PathParam("mementoId") Long mementoId
,@ApiParam(value = "" ) Object body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadRecordedVoice(mementoId,body,securityContext);
    }

}

