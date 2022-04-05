package com.example.Integracion_OT.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckList {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("item")
    private List<Item> item;

    public CheckList(CheckList element) {
        id = element.getId();
        name = element.getName();
        description = element.getDescription();
        item = element.getItem();
    }

    /**
     * Method for merge an old object Checklist with new object CheckList.
     * The old data is overwritten with the new data
     *
     * @param newData new object CheckList type to merge
     * @return CheckList Object merged
     */
    public CheckList merge(CheckList newData) {
        CheckList checkList = new CheckList(this);
        checkList.setId((newData.getId() != null ? newData.getId() : id));
        checkList.setName((newData.getName() != null ? newData.getName() : name));
        checkList.setDescription((newData.getDescription() != null ? newData.getDescription() : description));
        checkList.setItem(mergeListItem(newData.getItem()));
        return checkList;
    }

    /**
     * Method for merge a list of old object Items with new list objects Item.
     *
     * @param newListItem List objects Item type with new data
     * @return List<Item> List merged
     */
    private List<Item> mergeListItem(List<Item> newListItem) {
        List<Item> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getItem() != null) {
            this.getItem().forEach(item -> {
                Item itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getItem().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

}
