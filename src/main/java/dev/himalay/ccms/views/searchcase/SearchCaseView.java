package dev.himalay.ccms.views.searchcase;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import dev.himalay.ccms.data.SamplePerson;
import dev.himalay.ccms.services.SamplePersonService;
import dev.himalay.ccms.views.MainLayout;
import jakarta.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Search Case")
@Route(value = "searchcase", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class SearchCaseView extends Composite<VerticalLayout> {

    public SearchCaseView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        H5 h5 = new H5();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        ComboBox comboBox = new ComboBox();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        Grid multiSelectGrid = new Grid(SamplePerson.class);
        getContent().addClassName(Gap.XSMALL);
        getContent().addClassName(Padding.SMALL);
        getContent().setWidth("100%");
        getContent().setHeight("min-content");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.getStyle().set("flex-grow", "1");
        h3.setText("CASE DETAILS:");
        h3.setWidth("max-content");
        layoutRow3.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.END);
        buttonPrimary.setText("SEARCH");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        formLayout2Col.setWidth("100%");
        textField.setLabel("SEARCH USING FIRST NAME / LAST NAME");
        textField.setWidth("min-content");
        textField2.setLabel("SEARCH USING MOBILE NUMBER");
        textField2.setWidth("min-content");
        h5.setText("OR, SEARCH USING CASE PARAMETERS:");
        h5.setWidth("max-content");
        layoutRow4.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow5.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("min-content");
        layoutRow5.getStyle().set("flex-grow", "1");
        layoutRow5.setAlignItems(Alignment.CENTER);
        layoutRow5.setJustifyContentMode(JustifyContentMode.START);
        comboBox.setLabel("SELECT CASE TYPE");
        comboBox.getStyle().set("flex-grow", "1");
        setComboBoxSampleData(comboBox);
        layoutRow6.setHeightFull();
        layoutRow4.setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("min-content");
        layoutRow6.getStyle().set("flex-grow", "1");
        layoutRow6.setAlignItems(Alignment.CENTER);
        layoutRow6.setJustifyContentMode(JustifyContentMode.START);
        textField3.setLabel("ENTER CASE ID: TYPE-ID");
        layoutRow6.setAlignSelf(FlexComponent.Alignment.CENTER, textField3);
        textField3.getStyle().set("flex-grow", "1");
        textField4.setLabel("Text field");
        textField4.getStyle().set("flex-grow", "1");
        textField5.setLabel("Text field");
        textField5.getStyle().set("flex-grow", "1");
        textField6.setLabel("Text field");
        textField6.getStyle().set("flex-grow", "1");
        layoutColumn3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        multiSelectGrid.setWidth("100%");
        multiSelectGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(multiSelectGrid);
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow);
        layoutRow.add(layoutRow2);
        layoutRow2.add(h3);
        layoutRow.add(layoutRow3);
        layoutRow3.add(buttonPrimary);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        layoutColumn2.add(h5);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(layoutRow5);
        layoutRow5.add(comboBox);
        layoutRow4.add(layoutRow6);
        layoutRow6.add(textField3);
        layoutRow4.add(textField4);
        layoutRow4.add(textField5);
        layoutRow4.add(textField6);
        getContent().add(layoutColumn3);
        layoutColumn3.add(multiSelectGrid);
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

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;
}
