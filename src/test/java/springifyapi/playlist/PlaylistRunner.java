package springifyapi.playlist;

import springifyapi.TestBase;
import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;

@CucumberOptions(features = "classpath:springifyapi/playlist", tags = "~@ignore")
public class PlaylistRunner extends TestBase {

}