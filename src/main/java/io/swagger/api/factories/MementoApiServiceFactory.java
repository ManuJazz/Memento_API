package io.swagger.api.factories;

import io.swagger.api.MementoApiService;
import io.swagger.api.impl.MementoApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T14:41:06.005Z[GMT]")
public class MementoApiServiceFactory {
    private final static MementoApiService service = new MementoApiServiceImpl();

    public static MementoApiService getMementoApi() {
        return service;
    }
}
