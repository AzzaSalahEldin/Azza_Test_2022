package components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class TextFieldImpl implements TextField, WebElement {
	private final WebElement element;

	public TextFieldImpl(final WebElement element) {
//		super(element);

		this.element = element;

	}

	@Override
	public WebElement getTextField() {
		return this.element;
	}

	@Override
	public String getInputType() {
		return getTextField().getAttribute("type");
	}

	@Override
	public String getMinValue() {
		return getTextField().getAttribute("min");
	}

	@Override
	public String getCurrentText() {
		return getTextField().getAttribute("value");
	}

	@Override
	public String getPlaceholder() {
		return getTextField().getAttribute("placeholder");
	}

	@Override
	public void clearField() {
		getTextField().click();
		getTextField().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
	}

	@Override
	public void enterText(String value) {
//		getTextField().click();
//		clearField();
		getTextField().sendKeys(value);
//			wait.until(ExpectedConditions.elementToBeClickable(getTextField())).sendKeys(value);
//			if (!getCurrentText().equals(value)) {
//				clearField();
//				CompoundActions ca = new CompoundActions(DriverManager.getDriverInstance());
//				ca.clickAndType(getTextField(), value);
//				wait.until(ExpectedConditions.attributeToBe(getTextField(), "value", value));
//			}
	}

	@Override
	public boolean isEmpty() {
		boolean empty = true;
		try {
			getTextField().findElement(By.xpath("./@value"));
			empty = false;
		} catch (NoSuchElementException e) {
			empty = true;
		}
		return empty;
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendKeys(CharSequence... keysToSend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCssValue(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

}
