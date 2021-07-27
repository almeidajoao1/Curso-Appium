package pacoteAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTeste {

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\4all\\eclipse-workspace\\CursoAppium\\src\\test\\resources\\CTAppium_1_2.apk");

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<MobileElement> elementosEcontrados = driver.findElements(By.className("android.widget.TextView"));

		elementosEcontrados.get(1).click();

		MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
		campoNome.sendKeys("Wagner");

		String text = campoNome.getText();
		Assert.assertEquals("Wagner", text);

		driver.quit();
	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\4all\\eclipse-workspace\\CursoAppium\\src\\test\\resources\\CTAppium_1_2.apk");

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<MobileElement> elementosEcontrados = driver.findElements(By.className("android.widget.TextView"));

		elementosEcontrados.get(1).click();

		MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
		campoNome.sendKeys("Wagner");

		String text = campoNome.getText();
		Assert.assertEquals("Wagner", text);

		driver.quit();
	}

}