package learn.ok

import learn.DoThing
import org.springframework.stereotype.Component

@Component
class UseMap implements DoThing {

    Map<Integer, String> map = [0: "zero I guess", 1:"1 or 2", 2:"1 or 2", 3:"this is getting dumb", 5:"now it's all out of order and I don't know what to do."  ]

    @Override
    String thing(int something) {
        String result = map.get(something)

        if(result != null){
            return result
        }

        return 'you learn.dumb AF'
    }
}
