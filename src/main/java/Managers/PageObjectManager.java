package Managers;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListPage;
import PageObjects.HomePageMS;

public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductListPage productListPage;
    private ProductDetailPage productDetailPage;
    private HomePageMS homepageMS;
    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Short Hand If...Else
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    public HomePageMS getHomePageMS() {
        return (homepageMS == null) ? homepageMS = new HomePageMS(webDriver) : homepageMS;
    }

    //General If...Else
    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public ProductListPage getProductListPage() {
        return (productListPage == null) ? productListPage = new ProductListPage(webDriver) : productListPage;
    }

    public ProductDetailPage getProductDetailPage() {
        if (productDetailPage == null) productDetailPage = new ProductDetailPage(webDriver);
        return productDetailPage;
    }
}
