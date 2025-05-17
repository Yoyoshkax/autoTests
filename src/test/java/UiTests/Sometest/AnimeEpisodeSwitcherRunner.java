package UiTests.Sometest;

import UiTests.Anime.AnimeEpisodeSwitcher;
import UiTests.BasePackage.BaseTestForAnimeSwitcher;
import org.junit.jupiter.api.Test;

public class AnimeEpisodeSwitcherRunner extends BaseTestForAnimeSwitcher {


    @Test
    public void startWatching() throws InterruptedException {
        AnimeEpisodeSwitcher animeEpisodeSwitcher = new AnimeEpisodeSwitcher();
        animeEpisodeSwitcher
                .startWatching();
        do {
            animeEpisodeSwitcher.continueWatch().saveUrl().continueWatching();
        }while(true);
    }
}
