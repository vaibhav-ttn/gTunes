package gtunes

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(StoreController)
class StoreControllerSpec extends Specification {
    void testSomething() {
     controller.index()
     assert 'Welcome to the gTunes store!'==reponse.text
    }
}
