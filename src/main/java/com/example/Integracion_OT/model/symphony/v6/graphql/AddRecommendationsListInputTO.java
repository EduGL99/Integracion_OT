package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddRecommendationsListInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<AddRecommendationsInputTO> recommendations;

    public AddRecommendationsListInputTO() {
    }

    public AddRecommendationsListInputTO(java.util.List<AddRecommendationsInputTO> recommendations) {
        this.recommendations = recommendations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<AddRecommendationsInputTO> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(java.util.List<AddRecommendationsInputTO> recommendations) {
        this.recommendations = recommendations;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (recommendations != null) {
            joiner.add("recommendations: " + GraphQLRequestSerializer.getEntry(recommendations));
        }
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<AddRecommendationsInputTO> recommendations;

        public Builder() {
        }

        public Builder setRecommendations(java.util.List<AddRecommendationsInputTO> recommendations) {
            this.recommendations = recommendations;
            return this;
        }


        public AddRecommendationsListInputTO build() {
            return new AddRecommendationsListInputTO(recommendations);
        }

    }
}
