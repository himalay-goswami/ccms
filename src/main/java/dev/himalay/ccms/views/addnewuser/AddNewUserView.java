package dev.himalay.ccms.views.addnewuser;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import dev.himalay.ccms.views.MainLayout;
import jakarta.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Add New User")
@Route(value = "adduser", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class AddNewUserView extends Composite<VerticalLayout> {

    public AddNewUserView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout3Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        EmailField emailField = new EmailField();
        TextField textField3 = new TextField();
        ComboBox<SampleItem> comboBox = new ComboBox<>();
        DatePicker datePicker = new DatePicker();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        H3 h32 = new H3();
        FormLayout formLayout3Col2 = new FormLayout();
        ComboBox<SampleItem> comboBox2 = new ComboBox<>();
        ComboBox<SampleItem> comboBox3 = new ComboBox<>();
        TextField textField6 = new TextField();
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        Button buttonTertiary = new Button();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setHeight("min-content");
        h3.setText("BASIC DETAILS:");
        h3.setWidth("max-content");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        textField.setLabel("FIRST NAME");
        textField.setWidth("min-content");
        textField2.setLabel("LAST NAME");
        textField2.setWidth("min-content");
        emailField.setLabel("EMAIL ADDRESS");
        emailField.setWidth("min-content");
        textField3.setLabel("MOBILE NUMBER");
        textField3.setWidth("min-content");
        comboBox.setLabel("ADDRESS");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        datePicker.setLabel("DATE OF BIRTH");
        datePicker.setWidth("min-content");
        textField4.setLabel("CITY");
        textField4.setWidth("min-content");
        textField5.setLabel("STATE");
        textField5.setWidth("min-content");
        layoutColumn3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        h32.setText("PROFESSIONAL DETAILS:");
        h32.setWidth("max-content");
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        comboBox2.setLabel("DEPARTMENT");
        comboBox2.setWidth("min-content");
        setComboBoxSampleData(comboBox2);
        comboBox3.setLabel("DOMAIN");
        comboBox3.setWidth("min-content");
        setComboBoxSampleData(comboBox3);
        textField6.setLabel("POST");
        textField6.setWidth("min-content");
        checkboxGroup.setLabel("SELECT OPTIONS:");
        checkboxGroup.setWidth("min-content");
        checkboxGroup.setItems("Active on Duty", "Suspended", "Senior Citizen", "PWD");
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.addClassName(Padding.XLARGE);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("SAVE");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("RESET");
        buttonSecondary.setWidth("min-content");
        buttonTertiary.setText("Cancel");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.addClassName(Padding.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout3Col);
        formLayout3Col.add(textField);
        formLayout3Col.add(textField2);
        formLayout3Col.add(emailField);
        formLayout3Col.add(textField3);
        formLayout3Col.add(comboBox);
        formLayout3Col.add(datePicker);
        formLayout3Col.add(textField4);
        formLayout3Col.add(textField5);
        getContent().add(layoutColumn3);
        layoutColumn3.add(h32);
        layoutColumn3.add(formLayout3Col2);
        formLayout3Col2.add(comboBox2);
        formLayout3Col2.add(comboBox3);
        formLayout3Col2.add(textField6);
        formLayout3Col2.add(checkboxGroup);
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
        layoutRow.add(buttonTertiary);
        getContent().add(layoutRow2);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("SBM", "SBM", null));
        sampleItems.add(new SampleItem("PMAY", "PMAY", null));
        sampleItems.add(new SampleItem("AMRUT", "AMRUT", Boolean.TRUE));
        sampleItems.add(new SampleItem("DAY LULM", "DAY NULM", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
