import geb.Page

/**
 * Created by raghavan on 4/29/15.
 */
class GoogleHomePage extends Page{
    static url = "http://www.google.com"

    static at = {title == "Google"}


    static content= {

        search{module GoogleSearchModule,buttonValue: "Google Search"}
    }
}
