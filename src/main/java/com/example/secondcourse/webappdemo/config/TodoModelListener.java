package com.example.secondcourse.webappdemo.config;


import com.example.secondcourse.webappdemo.model.Todo;
import com.example.secondcourse.webappdemo.services.SequenceGeneratorService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class TodoModelListener extends AbstractMongoEventListener<Todo> {

    private SequenceGeneratorService sequenceGenerator;

    public TodoModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Todo> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(Todo.SEQUENCE_NAME));
        }
    }


}
