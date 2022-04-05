package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private String formula;
    @javax.validation.constraints.NotNull
    private String startDateTime;
    @javax.validation.constraints.NotNull
    private String endDateTime;
    @javax.validation.constraints.NotNull
    private KqiCategoryTO kqiCategory;
    @javax.validation.constraints.NotNull
    private KqiPerspectiveTO kqiPerspective;
    @javax.validation.constraints.NotNull
    private KqiSourceTO kqiSource;
    @javax.validation.constraints.NotNull
    private KqiTemporalFrequencyTO kqiTemporalFrequency;
    @javax.validation.constraints.NotNull
    private java.util.List<KqiTargetTO> kqiTarget;

    public KqiTO() {
    }

    public KqiTO(String id, String name, String description, String formula, String startDateTime, String endDateTime, KqiCategoryTO kqiCategory, KqiPerspectiveTO kqiPerspective, KqiSourceTO kqiSource, KqiTemporalFrequencyTO kqiTemporalFrequency, java.util.List<KqiTargetTO> kqiTarget) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.formula = formula;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.kqiCategory = kqiCategory;
        this.kqiPerspective = kqiPerspective;
        this.kqiSource = kqiSource;
        this.kqiTemporalFrequency = kqiTemporalFrequency;
        this.kqiTarget = kqiTarget;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public KqiCategoryTO getKqiCategory() {
        return kqiCategory;
    }

    public void setKqiCategory(KqiCategoryTO kqiCategory) {
        this.kqiCategory = kqiCategory;
    }

    public KqiPerspectiveTO getKqiPerspective() {
        return kqiPerspective;
    }

    public void setKqiPerspective(KqiPerspectiveTO kqiPerspective) {
        this.kqiPerspective = kqiPerspective;
    }

    public KqiSourceTO getKqiSource() {
        return kqiSource;
    }

    public void setKqiSource(KqiSourceTO kqiSource) {
        this.kqiSource = kqiSource;
    }

    public KqiTemporalFrequencyTO getKqiTemporalFrequency() {
        return kqiTemporalFrequency;
    }

    public void setKqiTemporalFrequency(KqiTemporalFrequencyTO kqiTemporalFrequency) {
        this.kqiTemporalFrequency = kqiTemporalFrequency;
    }

    public java.util.List<KqiTargetTO> getKqiTarget() {
        return kqiTarget;
    }

    public void setKqiTarget(java.util.List<KqiTargetTO> kqiTarget) {
        this.kqiTarget = kqiTarget;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (formula != null) {
            joiner.add("formula: " + GraphQLRequestSerializer.getEntry(formula));
        }
        if (startDateTime != null) {
            joiner.add("startDateTime: " + GraphQLRequestSerializer.getEntry(startDateTime));
        }
        if (endDateTime != null) {
            joiner.add("endDateTime: " + GraphQLRequestSerializer.getEntry(endDateTime));
        }
        if (kqiCategory != null) {
            joiner.add("kqiCategory: " + GraphQLRequestSerializer.getEntry(kqiCategory));
        }
        if (kqiPerspective != null) {
            joiner.add("kqiPerspective: " + GraphQLRequestSerializer.getEntry(kqiPerspective));
        }
        if (kqiSource != null) {
            joiner.add("kqiSource: " + GraphQLRequestSerializer.getEntry(kqiSource));
        }
        if (kqiTemporalFrequency != null) {
            joiner.add("kqiTemporalFrequency: " + GraphQLRequestSerializer.getEntry(kqiTemporalFrequency));
        }
        if (kqiTarget != null) {
            joiner.add("kqiTarget: " + GraphQLRequestSerializer.getEntry(kqiTarget));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String formula;
        private String startDateTime;
        private String endDateTime;
        private KqiCategoryTO kqiCategory;
        private KqiPerspectiveTO kqiPerspective;
        private KqiSourceTO kqiSource;
        private KqiTemporalFrequencyTO kqiTemporalFrequency;
        private java.util.List<KqiTargetTO> kqiTarget;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFormula(String formula) {
            this.formula = formula;
            return this;
        }

        public Builder setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public Builder setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public Builder setKqiCategory(KqiCategoryTO kqiCategory) {
            this.kqiCategory = kqiCategory;
            return this;
        }

        public Builder setKqiPerspective(KqiPerspectiveTO kqiPerspective) {
            this.kqiPerspective = kqiPerspective;
            return this;
        }

        public Builder setKqiSource(KqiSourceTO kqiSource) {
            this.kqiSource = kqiSource;
            return this;
        }

        public Builder setKqiTemporalFrequency(KqiTemporalFrequencyTO kqiTemporalFrequency) {
            this.kqiTemporalFrequency = kqiTemporalFrequency;
            return this;
        }

        public Builder setKqiTarget(java.util.List<KqiTargetTO> kqiTarget) {
            this.kqiTarget = kqiTarget;
            return this;
        }


        public KqiTO build() {
            return new KqiTO(id, name, description, formula, startDateTime, endDateTime, kqiCategory, kqiPerspective, kqiSource, kqiTemporalFrequency, kqiTarget);
        }

    }
}
