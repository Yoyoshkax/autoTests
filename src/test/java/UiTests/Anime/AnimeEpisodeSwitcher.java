package UiTests.Anime;

import UiTests.BasePackage.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class AnimeEpisodeSwitcher extends BaseSeleniumPage {

    public AnimeEpisodeSwitcher(){
        driver.get("https://jut.su/bleeach/season-2/episode-37.html");
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='my-player']/button")
    private WebElement playButton;

    @FindBy(xpath = "//*[@id='my-player']/div[@title='Нажмите, если лень смотреть опенинг']")
    private WebElement buttonSkipOpening;

    @FindBy(xpath = "//*[@id='my-player']/div[@title='Перейти к следующему эпизоду']")
    private WebElement buttonNextEpidose;

    @FindBy(xpath = "//*[@id='my-player']/div/button[@title='На весь экран']")
    private WebElement fullScreen;

    @FindBy(xpath = "//*[@id='my-player']/div/div/button[@title='Выбрать качество']")
    private WebElement changeVideoQuality;

    @FindBy(xpath = "//*[@id='my-player']/div[11]/div[8]/div/ul/li[1]/span[text()='1080p']")
    private WebElement fullHdQuality;

    @FindBy(xpath = "//*[@id='my-player']")
    private WebElement player;

    public AnimePage continueWatch(){
        buttonNextEpidose.click();
        return new AnimePage();
    }


    public AnimeEpisodeSwitcher startWatching() throws InterruptedException {
        clickPlayButton();
        changeQualityToFullHd();
        fullScreen.click();
        moveForwardUntilOpeningWillAppear();
        skipOpening();
        waitUntilButtonNextEpisodeAppear();
        return this;
    }

    public AnimeEpisodeSwitcher clickPlayButton(){
        playButton.click();
        return this;
    }

    public AnimeEpisodeSwitcher changeQualityToFullHd(){
        changeVideoQuality.click();
        fullHdQuality.click();
        return this;
    }
    public AnimeEpisodeSwitcher moveForwardUntilOpeningWillAppear() throws InterruptedException {
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        do {
            Thread.sleep(200);
            actions.sendKeys(Keys.ARROW_RIGHT).perform();
        }while(!buttonSkipOpening.isDisplayed());
        return this;
    }

    public AnimeEpisodeSwitcher skipOpening(){
        buttonSkipOpening.click();
        return this;
    }

    public AnimeEpisodeSwitcher waitUntilButtonNextEpisodeAppear() throws InterruptedException {
        do {
            Thread.sleep(Duration.ofSeconds(10));
        }while(!buttonNextEpidose.isDisplayed());
        return this;
    }

    public void nextEpisode(){
        buttonNextEpidose.click();
//        return this;
    }
}
