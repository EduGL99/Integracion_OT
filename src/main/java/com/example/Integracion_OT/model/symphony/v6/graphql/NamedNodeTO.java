package com.example.Integracion_OT.model.symphony.v6.graphql;


public interface NamedNodeTO {

    /**
     * The id of the object.
     */
    @javax.validation.constraints.NotNull
    String getId();

    /**
     * The name of the object.
     */
    @javax.validation.constraints.NotNull
    String getName();

}
