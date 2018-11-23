package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T14:41:06.005Z[GMT]")

public class MementoApiServiceImpl extends MementoApiService {
    List<MementoItem> lm= new ArrayList<MementoItem>();
    @Override
    public Response addmemento(MementoItem body, SecurityContext securityContext) throws NotFoundException {
        MementoItem mi= new MementoItem();
        mi.setIdMemento(body.getIdMemento());
        mi.setTitle(body.getTitle());
        mi.setUrlRecordedVoice(body.getUrlRecordedVoice());
        mi.setXCoordinate(body.getXCoordinate());
        mi.setYCoordinate(body.getYCoordinate());
        lm.add(mi);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Memento Added!")).build();
    }
    
    @Override
    public Response deleteMemento(Long mementoId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        
        for (int i = 0; i < lm.size(); i++) {
            if(lm.get(i).getIdMemento()==mementoId)
                lm.remove(lm.get(i));
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "All Mementos Deleted!")).build();
    }
    
    @Override
    public Response getMementoById(Long mementoId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        MementoItem mi= new MementoItem();
        for (int i = 0; i < lm.size(); i++) {
            if(lm.get(i).getIdMemento()==mementoId)
            mi=lm.get(i);
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, mi.toString())).build();
    }
    
    @Override
    public Response getallmementos(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, lm.toString())).build();
    }
    
    @Override
    public Response updateMemento(MementoItem body, SecurityContext securityContext) throws NotFoundException {
        MementoItem mi= new MementoItem();
        for (int i = 0; i < lm.size(); i++) {
            if(lm.get(i).getIdMemento()==body.getIdMemento()){
                mi= lm.get(i);
                mi.setIdMemento(body.getIdMemento());
                mi.setTitle(body.getTitle());
                mi.setUrlRecordedVoice(body.getUrlRecordedVoice());
                mi.setXCoordinate(body.getXCoordinate());
                mi.setYCoordinate(body.getYCoordinate());
            }
            
        }        
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Memento Updated!")).build();
    }
    
    @Override
    public Response uploadRecordedVoice(Long mementoId, Object body, SecurityContext securityContext) throws NotFoundException {
MementoItem mi= new MementoItem();
        for (int i = 0; i < lm.size(); i++) {
            if(lm.get(i).getIdMemento()==mementoId){
                mi= lm.get(i);
                
                mi.setUrlRecordedVoice(body.toString());
            }
            
        }        
        
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "RecordedVoice!")).build();
    }
    
}

