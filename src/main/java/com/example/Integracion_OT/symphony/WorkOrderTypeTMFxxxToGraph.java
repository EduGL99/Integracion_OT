package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.Characteristic;
import com.example.Integracion_OT.model.tmfxxx.CheckList;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class WorkOrderTypeTMFxxxToGraph {

    public WorkOrderTypeTO transform(WorkTicket workTicket) {
        WorkOrderTypeTO workOrderType = new WorkOrderTypeTO();
        workOrderType.setId(workTicket.getId());
        workOrderType.setDescription(workTicket.getDescription());
        workOrderType.setName(workTicket.getName());
        workOrderType.setPropertyTypes(properties(workTicket.getCharacteristic()));
        workOrderType.setCheckListCategoryDefinitions(checkListCategorDefinitions(workTicket.getChecklist()));
        return workOrderType;
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

    private List<CheckListCategoryDefinitionTO> checkListCategorDefinitions(List<CheckList> checks) {
        if (checks != null && checks.size() > 0) {
            List<CheckListCategoryDefinitionTO> clCategories = new ArrayList<>();
            checks.forEach(c -> {
                CheckListCategoryDefinitionTO clc = new CheckListCategoryDefinitionTO();
                clc.setTitle(c.getName());
                clc.setDescription(c.getDescription());
                if (c.getItem() != null && c.getItem().size() > 0) {
                    List<CheckListItemDefinitionTO> items = new ArrayList<>();
                    c.getItem().forEach(i -> {
                        CheckListItemDefinitionTO item = new CheckListItemDefinitionTO();
                        item.setTitle(i.getName());
                        item.setHelpText(i.getDescription());
                        item.setType(CheckListItemTypeTO.fromValue(i.getValueType()));
                        item.setEnumValues(i.getOptions());
                        items.add(item);
                    });
                    clc.setChecklistItemDefinitions(items);
                }
                clCategories.add(clc);
            });
            return clCategories;
        }
        return null;
    }
}
