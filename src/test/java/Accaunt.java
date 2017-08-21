/**
 * Created by tester on 17.08.2017.
 */
public class Accaunt {



    // Регион где находяться регистрационные поля
    public static String bodyXpath = "//form[@name=\"customer_form\"]";

    // XPath для Tax ID
    public static String taxIDXpath = bodyXpath + "//input[@name=\"tax_id\"]";

    public String taxID;

    // XPath для Company
    public static String сompanyXpath = bodyXpath + "//input[@name=\"company\"]";

    public String company;

    // XPath для First Name
    public static String firstNameXpath = bodyXpath + "//input[@name=\"firstname\"]";

    public String firstName;

    // XPath для Last Name
    public static String lastNameXpath = bodyXpath + "//input[@name=\"lastname\"]";

    public String lastName;

    // XPath для Address 1
    public static String address1Xpath = bodyXpath + "//input[@name=\"address1\"]";

    public String address1;

    // XPath для Address 2
    public static String address2Xpath = bodyXpath + "//input[@name=\"address2\"]";

    public String address2;

    // XPath для Postcode
    public static String postcodeXpath = bodyXpath + "//input[@name=\"postcode\"]";

    public String postcode;

    // XPath для City
    public static String cityXpath = bodyXpath + "//input[@name=\"city\"]";

    public String city;

    // XPath для Country
    public static String countryXpath = bodyXpath + "//span[@class=\"select2-selection__arrow\"]";

    // XPath для United States
    public static String unitedStatesXpath = "//option[text()=\"United States\"]";

    public String country;

    // XPath для Zone
    public static String zoneXpath = bodyXpath + "//select[@name=\"zone_code\"]";

    // XPath для определения активности Zone
    public static String zoneActiveXpath = bodyXpath + "//select[@name=\"zone_code\" and @class=\"\"]";

    // XPath для Alaska
    public static String alaskaXpath = zoneXpath + "/option[text()=\"Alaska\"]";

    public String zone;

    // XPath для Email
    public static String emailXpath = bodyXpath + "//input[@name=\"email\"]";

    public String email;

    // XPath для Phone
    public static String phoneXpath = bodyXpath + "//input[@name=\"phone\"]";

    public String phone;

    // XPath для Subscribe
    public static String subscribeXpath = bodyXpath + "//label[contains(text(),\"ubscribe\")]";

    public boolean subscribe;

    // XPath для Desired Password
    public static String desiredPasswordXpath = bodyXpath + "//input[@name=\"password\"]";

    // XPath для Confirm Password
    public static String confirmPasswordXpath = bodyXpath + "//input[@name=\"confirmed_password\"]";

    public String password;

    // XPath для Create Account
    public static String bCreateAccountXpath = bodyXpath + "//button[@name=\"create_account\"]";



}
