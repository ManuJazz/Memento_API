package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.MementoItem;
import io.swagger.model.ModelApiResponse;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T14:41:06.005Z[GMT]")

public abstract class MementoApiService {
    
    public abstract Response addmemento(MementoItem body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response deleteMemento(Long mementoId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getMementoById(Long mementoId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getallmementos(SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response updateMemento(MementoItem body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response uploadRecordedVoice(Long mementoId,Object body,SecurityContext securityContext) throws NotFoundException;
    
}

