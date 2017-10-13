package learn.smart

import learn.DoThing
import learn.smart.things.Something
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DependencyInjection  implements DoThing {

    @Autowired
    List<Something> somethings

    @Override
    String thing(int something) {

        for(Something somethingChecker : somethings){
            if(somethingChecker.condition(something)){
                return somethingChecker.logic()
            }
        }

        return 'you learn.dumb AF'

    }
}
