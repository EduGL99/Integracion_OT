package com.example.Integracion_OT.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Note {
    @JsonProperty("id")
    private String id;

    @JsonProperty("author")
    private String author;

    @JsonProperty("date")
    private String date;

    @JsonProperty("text")
    private String text;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    public Note(Note element) {
        id = element.getId();
        author = element.getAuthor();
        date = element.getDate();
        text = element.getText();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
    }

    /**
     * Method for merge an old object Note with new object Note.
     * The old data is overwritten with the new data
     *
     * @param newData new object Note type to merge
     * @return Note Object merged
     */
    public Note merge(Note newData) {
        Note note = new Note(this);
        note.setAuthor((newData.getAuthor() != null ? newData.getAuthor() : author));
        note.setDate((newData.getDate() != null ? newData.getDate() : date));
        note.setText((newData.getText() != null ? newData.getText() : text));
        note.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType));
        note.set_atSchemaLocation((newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation));
        note.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        return note;
    }
}
