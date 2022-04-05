package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.model.symphony.v6.graphql.CheckListCategoryDefinitionTO;
import com.example.Integracion_OT.model.symphony.v6.graphql.PropertyTypeTO;
import com.example.Integracion_OT.model.symphony.v6.graphql.WorkOrderTypeTO;
import com.example.Integracion_OT.model.tmfxxx.Characteristic;
import com.example.Integracion_OT.model.tmfxxx.CheckList;
import com.example.Integracion_OT.model.tmfxxx.Item;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class WorkOrderTypeGraphToTMFxxx {


    public WorkTicket transform(WorkOrderTypeTO workOrderType) {
        WorkTicket workTicket = new WorkTicket();
        workTicket.setId(workOrderType.getId());
        workTicket.setDescription(workOrderType.getDescription());
        workTicket.setName(workOrderType.getName());
        workTicket.setHref("/tmf-api/workTicketManagement/v1/workTicket/" + workOrderType.getId()
                + "?@baseType=workOrderType");
        workTicket.setCharacteristic(characteristics(workOrderType.getPropertyTypes()));
        workTicket.setChecklist(checkList(workOrderType.getCheckListCategoryDefinitions()));
        workTicket.set_atBaseType("workOrderType");
        workTicket.set_atType(workOrderType.getName());
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
        // TODO - make support for other types (gps, node, etc)
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

    private List<CheckList> checkList(List<CheckListCategoryDefinitionTO> checkListCategories) {
        if (checkListCategories != null && checkListCategories.size() > 0) {
            List<CheckList> checks = new ArrayList<>();
            checkListCategories.forEach(c -> {
                CheckList cl = new CheckList();
                cl.setId(c.getId());
                cl.setName(c.getTitle());
                cl.setDescription(c.getDescription());
                if (c.getChecklistItemDefinitions() != null && c.getChecklistItemDefinitions().size() > 0) {
                    List<Item> items = new ArrayList<>();
                    c.getChecklistItemDefinitions().forEach(i -> {
                        Item item = new Item();
                        item.setId(i.getId());
                        item.setName(i.getTitle());
                        item.setDescription(i.getHelpText());
                        item.setValueType(i.getType().toString());
                        item.setOptions(i.getEnumValues());
                        item.setValue("");
                        items.add(item);
                    });
                    cl.setItem(items);
                }
                checks.add(cl);
            });
            return checks;
        }
        return null;
    }
}
