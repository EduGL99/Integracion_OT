package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private DomainTO domainFk;

    public TechTO() {
    }

    public TechTO(String id, String name, DomainTO domainFk) {
        this.id = id;
        this.name = name;
        this.domainFk = domainFk;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DomainTO getDomainFk() {
        return domainFk;
    }

    public void setDomainFk(DomainTO domainFk) {
        this.domainFk = domainFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (domainFk != null) {
            joiner.add("domainFk: " + GraphQLRequestSerializer.getEntry(domainFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private DomainTO domainFk;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDomainFk(DomainTO domainFk) {
            this.domainFk = domainFk;
            return this;
        }


        public TechTO build() {
            return new TechTO(id, name, domainFk);
        }

    }
}
