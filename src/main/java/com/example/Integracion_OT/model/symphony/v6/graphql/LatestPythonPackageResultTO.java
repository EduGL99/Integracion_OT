package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LatestPythonPackageResultTO implements java.io.Serializable {

    private PythonPackageTO lastPythonPackage;
    private PythonPackageTO lastBreakingPythonPackage;

    public LatestPythonPackageResultTO() {
    }

    public LatestPythonPackageResultTO(PythonPackageTO lastPythonPackage, PythonPackageTO lastBreakingPythonPackage) {
        this.lastPythonPackage = lastPythonPackage;
        this.lastBreakingPythonPackage = lastBreakingPythonPackage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PythonPackageTO getLastPythonPackage() {
        return lastPythonPackage;
    }

    public void setLastPythonPackage(PythonPackageTO lastPythonPackage) {
        this.lastPythonPackage = lastPythonPackage;
    }

    public PythonPackageTO getLastBreakingPythonPackage() {
        return lastBreakingPythonPackage;
    }

    public void setLastBreakingPythonPackage(PythonPackageTO lastBreakingPythonPackage) {
        this.lastBreakingPythonPackage = lastBreakingPythonPackage;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (lastPythonPackage != null) {
            joiner.add("lastPythonPackage: " + GraphQLRequestSerializer.getEntry(lastPythonPackage));
        }
        if (lastBreakingPythonPackage != null) {
            joiner.add("lastBreakingPythonPackage: " + GraphQLRequestSerializer.getEntry(lastBreakingPythonPackage));
        }
        return joiner.toString();
    }

    public static class Builder {

        private PythonPackageTO lastPythonPackage;
        private PythonPackageTO lastBreakingPythonPackage;

        public Builder() {
        }

        public Builder setLastPythonPackage(PythonPackageTO lastPythonPackage) {
            this.lastPythonPackage = lastPythonPackage;
            return this;
        }

        public Builder setLastBreakingPythonPackage(PythonPackageTO lastBreakingPythonPackage) {
            this.lastBreakingPythonPackage = lastBreakingPythonPackage;
            return this;
        }


        public LatestPythonPackageResultTO build() {
            return new LatestPythonPackageResultTO(lastPythonPackage, lastBreakingPythonPackage);
        }

    }
}
