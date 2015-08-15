package dom.turno;

public class Prueba {
	
	// package todoapp.integtests.tests;
	//
	// import javax.inject.Inject;
	//
	// import org.junit.Before;
	// import org.junit.Test;
	//
	// import org.apache.isis.applib.fixturescripts.FixtureScripts;
	// import org.apache.isis.applib.services.wrapper.InvalidException;
	//
	// import static org.assertj.core.api.Assertions.assertThat;
	// import static org.hamcrest.CoreMatchers.containsString;
	// import todoapp.dom.module.categories.Category;
	// import todoapp.dom.module.categories.Subcategory;
	// import todoapp.dom.module.categories.UpdateCategoryContributions;
	// import todoapp.dom.module.todoitem.ToDoItem;
	// import todoapp.dom.module.todoitem.ToDoItems;
	// import todoapp.fixture.scenarios.RecreateToDoItemsForCurrentUser;
	//
	// public abstract class UpdateCategoryContributionsIntegTest extends
	// AbstractToDoIntegTest {
	//
	// RecreateToDoItemsForCurrentUser fixtureScript;
	//
	// @Before
	// public void setUpData() throws Exception {
	// fixtureScript = new RecreateToDoItemsForCurrentUser();
	// fixtureScripts.runFixtureScript(fixtureScript, null);
	// }
	//
	// @Inject
	// FixtureScripts fixtureScripts;
	// @Inject
	// ToDoItems toDoItems;
	// @Inject
	// UpdateCategoryContributions updateCategoryContributions;
	//
	// UpdateCategoryContributions updateCategoryContributionsWrapped;
	//
	// ToDoItem toDoItem;
	//
	// @Before
	// public void setUp() throws Exception {
	//
	// toDoItem = wrap(fixtureScript.getToDoItems().get(0));
	// assertThat(toDoItem).isNotNull();
	//
	// updateCategoryContributionsWrapped = wrap(updateCategoryContributions);
	// }
	//
	// public static class Actions {
	// public static class UpdateCategory extends
	// UpdateCategoryContributionsIntegTest {
	//
	// @Test
	// public void happyCase() throws Exception {
	//
	// // when
	// updateCategoryContributionsWrapped.updateCategory(toDoItem,
	// Category.PROFESSIONAL, Subcategory.CONSULTING);
	//
	// // then
	// assertThat(toDoItem.getCategory()).isEqualTo(
	// Category.PROFESSIONAL);
	// assertThat(toDoItem.getSubcategory()).isEqualTo(
	// Subcategory.CONSULTING);
	//
	// // when
	// updateCategoryContributionsWrapped.updateCategory(toDoItem,
	// Category.DOMESTIC, Subcategory.CHORES);
	//
	// // then
	// assertThat(toDoItem.getCategory()).isEqualTo(Category.DOMESTIC);
	// assertThat(toDoItem.getSubcategory()).isEqualTo(
	// Subcategory.CHORES);
	// }
	//
	// @Test
	// public void categoryCannotBeNull() throws Exception {
	//
	// // when, then
	// expectedExceptions.expect(InvalidException.class);
	// expectedExceptions.expectMessage("'Category' is mandatory");
	// updateCategoryContributionsWrapped.updateCategory(toDoItem,
	// null, Subcategory.CHORES);
	// }
	//
	// @Test
	// public void subcategoryCanBeNull() throws Exception {
	//
	// // when, then
	// updateCategoryContributionsWrapped.updateCategory(toDoItem,
	// Category.PROFESSIONAL, null);
	// }
	//
	// @Test
	// public void subcategoryMustBelongToCategory() throws Exception {
	//
	// // when, then
	// expectedExceptions
	// .expectMessage(containsString("Invalid subcategory"));
	// updateCategoryContributionsWrapped.updateCategory(toDoItem,
	// Category.PROFESSIONAL, Subcategory.CHORES);
	// }
	// }
	//
	// }
	//
	// }

}