package dev.himalay.ccms.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.auth.AccessAnnotationChecker;
import com.vaadin.flow.theme.lumo.LumoUtility;
import dev.himalay.ccms.data.User;
import dev.himalay.ccms.security.AuthenticatedUser;
import dev.himalay.ccms.views.addcasetype.AddCaseTypeView;
import dev.himalay.ccms.views.addcourttype.AddCourtTypeView;
import dev.himalay.ccms.views.adddepttype.AddDepttypeView;
import dev.himalay.ccms.views.addnewcase.AddNewCaseView;
import dev.himalay.ccms.views.addnewuser.AddNewUserView;
import dev.himalay.ccms.views.addtask.AddTaskView;
import dev.himalay.ccms.views.addtasktype.AddTaskTypeView;
import dev.himalay.ccms.views.casedetails.CaseDetailsView;
import dev.himalay.ccms.views.cases.CasesView;
import dev.himalay.ccms.views.chat.ChatView;
import dev.himalay.ccms.views.reminder.ReminderView;
import dev.himalay.ccms.views.searchcase.SearchCaseView;
import dev.himalay.ccms.views.tasks.TasksView;
import dev.himalay.ccms.views.users.UsersView;
import dev.himalay.ccms.views.welcome.WelcomeView;
import java.io.ByteArrayInputStream;
import java.util.Optional;
import org.vaadin.lineawesome.LineAwesomeIcon;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    private H2 viewTitle;

    private AuthenticatedUser authenticatedUser;
    private AccessAnnotationChecker accessChecker;

    public MainLayout(AuthenticatedUser authenticatedUser, AccessAnnotationChecker accessChecker) {
        this.authenticatedUser = authenticatedUser;
        this.accessChecker = accessChecker;

        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");

        viewTitle = new H2();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        H1 appName = new H1("ccms uk");
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        Header header = new Header(appName);

        Scroller scroller = new Scroller(createNavigation());

        addToDrawer(header, scroller, createFooter());
    }

    private SideNav createNavigation() {
        SideNav nav = new SideNav();

        if (accessChecker.hasAccess(WelcomeView.class)) {
            nav.addItem(new SideNavItem("Welcome", WelcomeView.class, LineAwesomeIcon.HOME_SOLID.create()));

        }
        if (accessChecker.hasAccess(CasesView.class)) {
            nav.addItem(new SideNavItem("Cases", CasesView.class, LineAwesomeIcon.BALANCE_SCALE_SOLID.create()));

        }
        if (accessChecker.hasAccess(CaseDetailsView.class)) {
            nav.addItem(new SideNavItem(" Case Details", CaseDetailsView.class,
                    LineAwesomeIcon.PENCIL_RULER_SOLID.create()));

        }
        if (accessChecker.hasAccess(AddNewCaseView.class)) {
            nav.addItem(
                    new SideNavItem("Add New Case", AddNewCaseView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create()));

        }
        if (accessChecker.hasAccess(AddNewUserView.class)) {
            nav.addItem(
                    new SideNavItem("Add New User", AddNewUserView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create()));

        }
        if (accessChecker.hasAccess(SearchCaseView.class)) {
            nav.addItem(
                    new SideNavItem("Search Case", SearchCaseView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create()));

        }
        if (accessChecker.hasAccess(UsersView.class)) {
            nav.addItem(new SideNavItem("Users", UsersView.class, LineAwesomeIcon.FILTER_SOLID.create()));

        }
        if (accessChecker.hasAccess(TasksView.class)) {
            nav.addItem(new SideNavItem("Tasks", TasksView.class, LineAwesomeIcon.FILTER_SOLID.create()));

        }
        if (accessChecker.hasAccess(AddTaskView.class)) {
            nav.addItem(new SideNavItem("Add Task", AddTaskView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create()));

        }
        if (accessChecker.hasAccess(ChatView.class)) {
            nav.addItem(new SideNavItem("Chat", ChatView.class, LineAwesomeIcon.COMMENTS.create()));

        }
        if (accessChecker.hasAccess(AddTaskTypeView.class)) {
            nav.addItem(
                    new SideNavItem("Add Task Type", AddTaskTypeView.class, LineAwesomeIcon.COLUMNS_SOLID.create()));

        }
        if (accessChecker.hasAccess(AddDepttypeView.class)) {
            nav.addItem(
                    new SideNavItem("Add Dept type", AddDepttypeView.class, LineAwesomeIcon.COLUMNS_SOLID.create()));

        }
        if (accessChecker.hasAccess(AddCaseTypeView.class)) {
            nav.addItem(
                    new SideNavItem("Add Case Type", AddCaseTypeView.class, LineAwesomeIcon.COLUMNS_SOLID.create()));

        }
        if (accessChecker.hasAccess(AddCourtTypeView.class)) {
            nav.addItem(
                    new SideNavItem("Add Court Type", AddCourtTypeView.class, LineAwesomeIcon.COLUMNS_SOLID.create()));

        }
        if (accessChecker.hasAccess(ReminderView.class)) {
            nav.addItem(new SideNavItem("Reminder", ReminderView.class, LineAwesomeIcon.TH_SOLID.create()));

        }

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

        Optional<User> maybeUser = authenticatedUser.get();
        if (maybeUser.isPresent()) {
            User user = maybeUser.get();

            Avatar avatar = new Avatar(user.getName());
            StreamResource resource = new StreamResource("profile-pic",
                    () -> new ByteArrayInputStream(user.getProfilePicture()));
            avatar.setImageResource(resource);
            avatar.setThemeName("xsmall");
            avatar.getElement().setAttribute("tabindex", "-1");

            MenuBar userMenu = new MenuBar();
            userMenu.setThemeName("tertiary-inline contrast");

            MenuItem userName = userMenu.addItem("");
            Div div = new Div();
            div.add(avatar);
            div.add(user.getName());
            div.add(new Icon("lumo", "dropdown"));
            div.getElement().getStyle().set("display", "flex");
            div.getElement().getStyle().set("align-items", "center");
            div.getElement().getStyle().set("gap", "var(--lumo-space-s)");
            userName.add(div);
            userName.getSubMenu().addItem("Sign out", e -> {
                authenticatedUser.logout();
            });

            layout.add(userMenu);
        } else {
            Anchor loginLink = new Anchor("login", "Sign in");
            layout.add(loginLink);
        }

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}
