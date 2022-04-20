package locators_web;

import org.openqa.selenium.By;

public interface UserHomePageLocator {
    By USER_PROFILE_AVATAR = By.className("user-profile-dropdown--dropdown-button-avatar--Cbd6V");
    By MY_LEARNING_TEXT = By.cssSelector("a#u185-popper-trigger--10 > .udlite-text-sm");
    By INPUT_SEARCHBAR = By.id("#u316-search-form-autocomplete--3");
    By SEARCH_BUTTON = By.cssSelector("button[type=\"submit\"]");

}
