package components;

import org.openqa.selenium.WebElement;

import webelements.components.ImplementedBy;
import webelements.components.TextFieldImpl;

@ImplementedBy(TextFieldImpl.class)
public interface TextField {
	WebElement getTextField();

	void enterText(String value);

	String getInputType();

	String getMinValue();

	String getCurrentText();

	String getPlaceholder();

	void clearField();

	public boolean isEmpty();
}
