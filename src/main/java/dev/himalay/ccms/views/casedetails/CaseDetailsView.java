package dev.himalay.ccms.views.casedetails;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import dev.himalay.ccms.views.MainLayout;
import jakarta.annotation.security.PermitAll;
import java.util.ArrayList;
import java.util.List;

@PageTitle(" Case Details")
@Route(value = "casedetails", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class CaseDetailsView extends Composite<VerticalLayout> {

    public CaseDetailsView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H2 h2 = new H2();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        TabSheet tabSheet = new TabSheet();
        Hr hr = new Hr();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H5 h5 = new H5();
        H6 h6 = new H6();
        H6 h62 = new H6();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        H5 h52 = new H5();
        H6 h63 = new H6();
        H6 h64 = new H6();
        Hr hr2 = new Hr();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        H5 h53 = new H5();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        DatePicker datePicker = new DatePicker();
        ComboBox comboBox = new ComboBox();
        MultiSelectComboBox multiSelectComboBox = new MultiSelectComboBox();
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        MultiSelectListBox textItems = new MultiSelectListBox();
        Details details = new Details();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        Button buttonPrimary2 = new Button();
        Button buttonTertiary = new Button();
        Hr hr3 = new Hr();
        getContent().setWidth("100%");
        getContent().setHeight("min-content");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h2.setText("CASE DETAILS");
        h2.setWidth("max-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.CENTER, tabSheet);
        tabSheet.getStyle().set("flex-grow", "1");
        tabSheet.setHeight("100%");
        setTabSheetSampleData(tabSheet);
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.addClassName(Padding.SMALL);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.START);
        layoutColumn2.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeight("min-content");
        h5.setText("RESPONDANT & ADVOCATE");
        h5.setWidth("max-content");
        h6.setText("RESPONDANT name");
        h6.setWidth("max-content");
        h62.setText("Advocate");
        h62.setWidth("max-content");
        layoutColumn3.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutColumn3.setHeight("min-content");
        h52.setText("PETITIONER & ADVOCATE");
        h52.setWidth("max-content");
        h63.setText("Petitioner name");
        h63.setWidth("max-content");
        h64.setText("Advocate");
        h64.setWidth("max-content");
        layoutColumn4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.getStyle().set("flex-grow", "1");
        layoutColumn4.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn4.setAlignItems(Alignment.START);
        layoutRow4.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.addClassName(Padding.SMALL);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.START);
        h53.setText("UPDATE CASE DETAILS:");
        layoutRow4.setAlignSelf(FlexComponent.Alignment.CENTER, h53);
        h53.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        formLayout2Col.getStyle().set("flex-grow", "1");
        textField.setLabel("UPDATE PROGRESS");
        textField.setWidth("min-content");
        datePicker.setLabel("NEXT HEARING DATE");
        datePicker.setWidth("min-content");
        comboBox.setLabel("UPDATE CASE STAGE");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        multiSelectComboBox.setLabel("ADD PARTIES TO CASE");
        multiSelectComboBox.setWidth("min-content");
        setMultiSelectComboBoxSampleData(multiSelectComboBox);
        buttonPrimary.setText("ADD TASK");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow5.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        textItems.getStyle().set("flex-grow", "1");
        setMultiSelectListBoxSampleData(textItems);
        layoutRow5.setAlignSelf(FlexComponent.Alignment.CENTER, details);
       // details.setWidth("100%");
        //setDetailsSampleData(details);
        layoutRow6.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        buttonPrimary2.setText("Save");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonTertiary.setText("Cancel");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutRow2);
        layoutRow2.add(tabSheet);
        getContent().add(hr);
        getContent().add(layoutRow3);
        layoutRow3.add(layoutColumn2);
        layoutColumn2.add(h5);
        layoutColumn2.add(h6);
        layoutColumn2.add(h62);
        layoutRow3.add(layoutColumn3);
        layoutColumn3.add(h52);
        layoutColumn3.add(h63);
        layoutColumn3.add(h64);
        getContent().add(hr2);
        getContent().add(layoutColumn4);
        layoutColumn4.add(layoutRow4);
        layoutRow4.add(h53);
        layoutColumn4.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(comboBox);
        formLayout2Col.add(multiSelectComboBox);
        layoutColumn4.add(buttonPrimary);
        layoutColumn4.add(layoutRow5);
        layoutRow5.add(textItems);
        layoutRow5.add(details);
        layoutColumn4.add(layoutRow6);
        layoutRow6.add(buttonPrimary2);
        layoutRow6.add(buttonTertiary);
        getContent().add(hr3);
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Case Details", new Div(new Text("This is the case details tab content")));
        tabSheet.add("Associated Parties", new Div(new Text("This is the associated parties tab content")));
        tabSheet.add("Case Progress", new Div(new Text("This is the progress tab content")));
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

    private void setMultiSelectListBoxSampleData(MultiSelectListBox multiSelectListBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectListBox.setItems(sampleItems);
        multiSelectListBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
        multiSelectListBox.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }

    private void setDetailsSampleData(Details details) {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");
        VerticalLayout content = new VerticalLayout(name, email, phone);
        content.setSpacing(false);
        content.setPadding(false);
        details.setSummaryText("Contact information");
        details.setOpened(true);
        details.setContent(content);
    }
}
