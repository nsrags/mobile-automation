import com.works.service.StockService

/**
 * Created by raghavan on 4/25/15.
 */
class StockServiceTest extends GroovyTestCase{


    void testSymbol(){
        assert 1000.78 == StockService.getPrice("FLPKRT")
    }
}
