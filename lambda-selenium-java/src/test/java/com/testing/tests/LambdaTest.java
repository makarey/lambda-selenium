package com.testing.tests;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import com.testing.common.LambdaBaseTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Test.class)
public class LambdaTest extends LambdaBaseTest {

    @Test
    public void epamTest() {
        open("https://www.epam.com/");
        screenshot("epam-home-page");
        assertThat(title(), containsString("Incorrect string"));
    }

    @Test
    public void awsLambdaTest() {
        open("https://aws.amazon.com/lambda/");
        screenshot("aws-lambda-page");
        assertThat(title(), containsString("AWS Lambda"));
    }

    @Test
    public void googleTest() {
        open("http://www.google.com/");
        screenshot("google-home-page");
        assertThat(title(), containsString("Google"));
    }

    @Test
    public void youtubeTest() {
        open("https://www.youtube.com/");
        screenshot("youtube-home-page");
        assertThat(title(), containsString("YouTube"));
    }

    @Test
    public void facebookTest() {
        open("https://www.facebook.com/");
        screenshot("facebook-home-page");
        assertThat(title(), containsString("Facebook"));
    }

    @Test
    public void ebayTest() {
        open("https://www.ebay.com/");
        screenshot("ebay-home-page");
        assertThat(title(), containsString("eBay"));
    }

    @Test
    public void yahooTest() {
        open("https://www.yahoo.com/");
        screenshot("yahoo-home-page");
        assertThat(title(), containsString("Yahoo"));
    }

    @Test
    public void instagramTest() {
        open("https://www.instagram.com/");
        screenshot("instagram-home-page");
        assertThat(title(), containsString("Instagram"));
    }

    @Test
    public void twitterTest() {
        open("https://twitter.com/");
        screenshot("twitter-home-page");
        assertThat(title(), containsString("Twitter"));
    }

    @Test
    public void bingTest() {
        open("https://www.bing.com/");
        screenshot("bing-home-page");
        assertThat(title(), containsString("Bing"));
    }

    @Test
    public void wikipediaTest() {
        open("https://www.wikipedia.org/");
        screenshot("wikipedia-home-page");
        assertThat(title(), containsString("Wikipedia"));
    }

    @Test
    public void matallicaTest() {
        open("https://www.metallica.com/");
        screenshot("metallica-home-page");
        assertThat(title(), containsString("Metallica"));
    }

    @Test
    public void amazonTest() {
        open("https://www.amazon.com/");
        screenshot("amazon-home-page");
        assertThat(title(), containsString("Amazon"));
    }

    @Test
    public void liveTest() {
        open("https://outlook.live.com/");
        screenshot("live-home-page");
        assertThat(title(), containsString("Outlook"));
    }

    @Test
    public void fandomTest() {
        open("https://www.fandom.com/");
        screenshot("fandom-home-page");
        assertThat(title(), containsString("Fandom"));
    }

    @Test
    public void promTest() {
        open("https://prom.ua/");
        screenshot("prom-home-page");
        assertThat(title(), containsString("Prom"));
    }

    @Test
    public void redditTest() {
        open("http://reddit.com/");
        screenshot("reddit-home-page");
        assertThat(title(), containsString("reddit"));
    }

    @Test
    public void netflixTest() {
        open("https://www.netflix.com/");
        screenshot("netflix-home-page");
        assertThat(title(), containsString("Netflix"));
    }

    @Test
    public void yelpTest() {
        open("https://www.yelp.com/");
        screenshot("yelp-home-page");
        assertThat(title(), containsString("Yelp"));
    }

    @Test
    public void ampprojectTest() {
        open("https://ampproject.org/");
        screenshot("ampproject-home-page");
        assertThat(title(), containsString("AMP"));
    }

    @Test
    public void aliexpressTest() {
        open("https://www.aliexpress.com/");
        screenshot("aliexpress-home-page");
        assertThat(title(), containsString("AliExpress"));
    }

    @Test
    public void pinterestTest() {
        open("https://www.pinterest.com/");
        screenshot("pinterest-home-page");
        assertThat(title(), containsString("Pinterest"));
    }

    @Test
    public void olxTest() {
        open("https://www.olx.ua/");
        screenshot("pinterest-home-page");
        assertThat(title(), containsString("OLX"));
    }

    @Test
    public void privatbankTest() {
        open("https://privatbank.ua/");
        screenshot("privatbank-home-page");
        assertThat(title(), containsString("ПриватБанк"));
    }

    @Test
    public void riaTest() {
        open("https://www.ria.com/");
        screenshot("ria-home-page");
        assertThat(title(), containsString("RIA"));
    }

    @Test
    public void novaposhtaTest() {
        open("https://novaposhta.ua/");
        screenshot("novaposhta-home-page");
        assertThat(title(), containsString("Нова пошта"));
    }

    @Test
    public void viberTest() {
        open("https://www.viber.com/");
        screenshot("viber-home-page");
        assertThat(title(), containsString("Viber"));
    }

    @Test
    public void microsoftTest() {
        open("https://www.microsoft.com/");
        screenshot("microsoft-home-page");
        assertThat(title(), containsString("Microsoft"));
    }

    @Test
    public void rozetkaTest() {
        open("https://rozetka.com.ua/");
        screenshot("rozetka-home-page");
        assertThat(title(), containsString("ROZETKA"));
    }

    @Test
    public void acdcTest() {
        open("http://www.ac-dc.net/");
        screenshot("acdc-home-page");
        assertThat(title(), containsString("AC/DC"));
    }

}

