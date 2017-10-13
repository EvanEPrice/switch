package learn.smart

import learn.Use
import learn.smart.things.Something
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UseDependencyInjection implements Use {

    @Autowired
    List<Something> somethings

    @Override
    String use(int something) {

        for(Something somethingChecker : somethings){
            if(somethingChecker.condition(something)){
                return somethingChecker.logic()
            }
        }

        return 'you dumb AF'

    }
}
