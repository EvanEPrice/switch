package learn.ok

import learn.Use
import org.springframework.stereotype.Component

@Component
class UseMap implements Use {

    Map<Integer, String> map = [0: "zero I guess", 1:"1 or 2", 2:"1 or 2", 3:"this is getting dumb", 5:"now it's all out of order and I don't know what to do."  ]

    Map<Integer, String> map = new HashMap<>()

    void makeMap() {
        map.put(0, "zero I guess")
        map.put(1, "1 or 2")
        map.put(2, "1 or 2")
        map.put(3, "this is getting dumb")
        map.put(5, "now it's all out of order and I don't know what to do.")
    }




    @Override
    String use(int something) {
        makeMap()
        String result = map.get(something)

        if(result != null){
            return result
        }

        return 'you learn.dumb AF'
    }
}
