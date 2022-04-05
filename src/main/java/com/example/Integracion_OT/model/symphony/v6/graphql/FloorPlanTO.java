package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String locationID;
    @javax.validation.constraints.NotNull
    private FileTO image;
    @javax.validation.constraints.NotNull
    private FloorPlanReferencePointTO referencePoint;
    @javax.validation.constraints.NotNull
    private FloorPlanScaleTO scale;

    public FloorPlanTO() {
    }

    public FloorPlanTO(String id, String name, String locationID, FileTO image, FloorPlanReferencePointTO referencePoint, FloorPlanScaleTO scale) {
        this.id = id;
        this.name = name;
        this.locationID = locationID;
        this.image = image;
        this.referencePoint = referencePoint;
        this.scale = scale;
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

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public FileTO getImage() {
        return image;
    }

    public void setImage(FileTO image) {
        this.image = image;
    }

    public FloorPlanReferencePointTO getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(FloorPlanReferencePointTO referencePoint) {
        this.referencePoint = referencePoint;
    }

    public FloorPlanScaleTO getScale() {
        return scale;
    }

    public void setScale(FloorPlanScaleTO scale) {
        this.scale = scale;
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
        if (locationID != null) {
            joiner.add("locationID: " + GraphQLRequestSerializer.getEntry(locationID));
        }
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        if (referencePoint != null) {
            joiner.add("referencePoint: " + GraphQLRequestSerializer.getEntry(referencePoint));
        }
        if (scale != null) {
            joiner.add("scale: " + GraphQLRequestSerializer.getEntry(scale));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String locationID;
        private FileTO image;
        private FloorPlanReferencePointTO referencePoint;
        private FloorPlanScaleTO scale;

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

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setImage(FileTO image) {
            this.image = image;
            return this;
        }

        public Builder setReferencePoint(FloorPlanReferencePointTO referencePoint) {
            this.referencePoint = referencePoint;
            return this;
        }

        public Builder setScale(FloorPlanScaleTO scale) {
            this.scale = scale;
            return this;
        }


        public FloorPlanTO build() {
            return new FloorPlanTO(id, name, locationID, image, referencePoint, scale);
        }

    }
}
