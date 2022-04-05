package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.model.symphony.v6.graphql.ProjectTypeTO;
import com.example.Integracion_OT.model.symphony.v6.graphql.PropertyTypeTO;
import com.example.Integracion_OT.model.tmfxxx.Characteristic;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class ProjectTypeGraphToTMFxxx {

    public WorkTicket transform(ProjectTypeTO projectType) {
        WorkTicket workTicket = new WorkTicket();
        workTicket.setId(projectType.getId());
        workTicket.setDescription(projectType.getDescription());
        workTicket.setName(projectType.getName());
        workTicket.setHref("/tmf-api/workTicketManagement/v1/workTicket/" + projectType.getId()
                + "?@baseType=projectType");
        workTicket.setCharacteristic(characteristics(projectType.getProperties()));
        workTicket.set_atBaseType("projectType");
        workTicket.set_atType(projectType.getName());
        return workTicket;
    }

    private List<Characteristic> characteristics(List<PropertyTypeTO> props) {
        if (props != null && props.size() > 0) {
            List<Characteristic> characteristics = new ArrayList<>();
            props = props.stream().filter(p -> !p.getIsDeleted()).collect(Collectors.toList());
            props.forEach(p -> {
                Characteristic characteristic = new Characteristic();
                characteristic.setId(p.getId());
                characteristic.setName(p.getName());
                characteristic.setValueType(p.getType().toString().toLowerCase());
                characteristic.setValue(propertyDefineValue(p));
                characteristic.set_atBaseType("propertyType");
                characteristics.add(characteristic);
            });
            return characteristics;
        }
        return null;
    }

    private String propertyDefineValue(PropertyTypeTO prop) {
        String value;
        // TODO - make support for other types (gps, range, etc)
        switch (prop.getType().toString().toLowerCase()) {
            case "int":
                value = (prop.getIntValue() != null ? String.valueOf(prop.getIntValue()) : null);
                break;
            case "bool":
                value = (prop.getBooleanValue() != null ? String.valueOf(prop.getBooleanValue()) : null);
                break;
            case "float":
                value = (prop.getFloatValue() != null ? String.valueOf(prop.getFloatValue()) : null);
                break;
            default:
                value = (prop.getStringValue() != null ? prop.getStringValue() : null);
        }
        return value;
    }
}
