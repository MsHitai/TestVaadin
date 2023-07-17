package com.example.test;

import com.example.test.model.MyNumber;
import com.example.test.service.CustomNumberService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.Route;

@Route("main")
public class MainView extends VerticalLayout {

    public MainView(CustomNumberService service) {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        NumberField field = new NumberField("Enter a number here");
        add(field);
        MyNumber number = new MyNumber();
        Button incrementButton = new Button("Increment", e -> field.setValue(field.getValue() + 1));

        add(incrementButton);

        incrementButton.addClickShortcut(Key.ENTER);

        incrementButton.addClickListener(click -> {
            number.setNumValue(field.getValue());
            service.add(number);
        });

        service.update(number);

    }
}
