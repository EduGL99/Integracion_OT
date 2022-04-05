package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.model.symphony.v6.graphql.ProjectTypeTO;
import com.example.Integracion_OT.model.symphony.v6.graphql.PropertyKindTO;
import com.example.Integracion_OT.model.symphony.v6.graphql.PropertyTypeTO;
import com.example.Integracion_OT.model.tmfxxx.Characteristic;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ProjectTypeTMFxxxToGraph {

    public ProjectTypeTO transform(WorkTicket workTicket) {
        ProjectTypeTO projectType = new ProjectTypeTO();
        projectType.setId(workTicket.getId());
        projectType.setDescription(workTicket.getDescription());
        projectType.setName(workTicket.getName());
        projectType.setProperties(properties(workTicket.getCharacteristic()));
        return projectType;
    }

    private List<PropertyTypeTO> properties(List<Characteristic> props) {
        if (props != null && props.size() > 0) {
            List<PropertyTypeTO> properties = new ArrayList<>();
            props.forEach(p -> {
                PropertyTypeTO prop = new PropertyTypeTO();
                prop.setId(p.getId());
                prop.setType(PropertyKindTO.fromValue(p.getValueType().toLowerCase()));
                prop.setName(p.getName());
                PropertyTypeTO property = propertyDefineValue(prop, p);
                properties.add(property);
            });
            return properties;
        }
        return null;
    }

    private PropertyTypeTO propertyDefineValue(PropertyTypeTO prop, Characteristic characteristic) {
        prop.setStringValue("");
        if (characteristic.getValueType() != null) {
            // TODO - make support for other types (gps, node, etc)
            switch (characteristic.getValueType().toLowerCase()) {
                case "int":
                    prop.setIntValue(characteristic.getValue() != null ? Integer.parseInt(
                            characteristic.getValue()) : null);
                    break;
                case "bool":
                    prop.setBooleanValue(characteristic.getValue() != null ? Boolean.valueOf(
                            characteristic.getValue()) : null);
                    break;
                case "float":
                    prop.setFloatValue(characteristic.getValue() != null ? Double.valueOf(
                            characteristic.getValue()) : null);
                    break;
                default:
                    prop.setStringValue(characteristic.getValue() != null ? characteristic.getValue() : null);
            }
        }
        return prop;
    }
}
