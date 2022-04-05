package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationsCategoryTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<RecommendationsTO> recommendations;

    public RecommendationsCategoryTO() {
    }

    public RecommendationsCategoryTO(String id, String name, java.util.List<RecommendationsTO> recommendations) {
        this.id = id;
        this.name = name;
        this.recommendations = recommendations;
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

    public java.util.List<RecommendationsTO> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(java.util.List<RecommendationsTO> recommendations) {
        this.recommendations = recommendations;
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
        if (recommendations != null) {
            joiner.add("recommendations: " + GraphQLRequestSerializer.getEntry(recommendations));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<RecommendationsTO> recommendations;

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

        public Builder setRecommendations(java.util.List<RecommendationsTO> recommendations) {
            this.recommendations = recommendations;
            return this;
        }


        public RecommendationsCategoryTO build() {
            return new RecommendationsCategoryTO(id, name, recommendations);
        }

    }
}
