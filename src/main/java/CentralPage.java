import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CentralPage {
    private WebDriver driver;

    public CentralPage(WebDriver driver) {
        this.driver = driver;
    }

    private By ticketSearchPage = By.xpath("//a[contains(text(),'Расписание, наличие мест, покупка билетов')]");
    private By companyPage = By.xpath("//td[contains(@class,'brdr5 headNav_current')]//a[contains(text(),'О компании')]");
    private By pressCenterPage = By.xpath("//a[contains(text(),'Пресс-центр')]");
    private By investorsPage = By.xpath("//a[contains(text(),'Инвесторам')]");
    private By tenderPage = By.xpath("//a[contains(text(),'Тендеры')]");
    private By contactsPage = By.xpath("//a[contains(text(),'Контакты')]");
    private By Page = By.xpath("//a[contains(text(),'Вход')]");

    public void clickPage () {
        driver.findElement(ticketSearchPage).click();

    }
}
