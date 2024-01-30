package dev.himalay.ccms.views.addtask;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import dev.himalay.ccms.views.MainLayout;
import jakarta.annotation.security.PermitAll;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Add Task")
@Route(value = "addtask", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class AddTaskView extends Composite<VerticalLayout> {

    public AddTaskView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        TextField textField = new TextField();
        DatePicker datePicker = new DatePicker();
        DatePicker datePicker2 = new DatePicker();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        ComboBox comboBox = new ComboBox();
        ComboBox comboBox2 = new ComboBox();
        MultiSelectComboBox multiSelectComboBox = new MultiSelectComboBox();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        TextArea textArea = new TextArea();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonTertiary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.getStyle().set("flex-grow", "1");
        h3.setText("ADD TASK");
        h3.setWidth("max-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.addClassName(Padding.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        textField.setLabel("SUBJECT");
        textField.getStyle().set("flex-grow", "1");
        datePicker.setLabel("START DATE");
        datePicker.getStyle().set("flex-grow", "1");
        datePicker2.setLabel("DEADLINE");
        datePicker2.getStyle().set("flex-grow", "1");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.addClassName(Padding.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("min-content");
        comboBox.setLabel("STATUS");
        comboBox.getStyle().set("flex-grow", "1");
        setComboBoxSampleData(comboBox);
        comboBox2.setLabel("PRIORITY");
        comboBox2.getStyle().set("flex-grow", "1");
        setComboBoxSampleData(comboBox2);
        multiSelectComboBox.setLabel("ASSIGN TO");
        multiSelectComboBox.getStyle().set("flex-grow", "1");
        setMultiSelectComboBoxSampleData(multiSelectComboBox);
        layoutRow5.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.addClassName(Padding.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.setHeight("min-content");
        textArea.setLabel("DESCRIPTION");
        textArea.setWidth("100%");
        layoutRow6.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        layoutRow6.setAlignItems(Alignment.CENTER);
        layoutRow6.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("SAVE");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonTertiary.setText("Cancel");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        getContent().add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow2.add(h3);
        getContent().add(layoutRow3);
        layoutRow3.add(textField);
        layoutRow3.add(datePicker);
        layoutRow3.add(datePicker2);
        getContent().add(layoutRow4);
        layoutRow4.add(comboBox);
        layoutRow4.add(comboBox2);
        layoutRow4.add(multiSelectComboBox);
        getContent().add(layoutRow5);
        layoutRow5.add(textArea);
        getContent().add(layoutRow6);
        layoutRow6.add(buttonPrimary);
        layoutRow6.add(buttonTertiary);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }

    private void setMultiSelectComboBoxSampleData(MultiSelectComboBox multiSelectComboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectComboBox.setItems(sampleItems);
        multiSelectComboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
