import geb.Module

/**
 * Created by raghavan on 4/29/15.
 */
class GoogleSearchModule extends Module{

    def buttonValue

    static content = {

        field {$("input",name:"q")}

        button(to:GoogleResultsPage){
            $("input",value:buttonValue)
        }
    }
}
