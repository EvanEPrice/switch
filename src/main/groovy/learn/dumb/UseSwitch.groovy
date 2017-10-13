package learn.dumb

import learn.Use
import org.springframework.stereotype.Component

@Component
class UseSwitch implements Use{


    String use(int something){

        switch(something) {
            case 0:
                return "zero I guess"
            case 1:
            case 2:
                return "1 or 2"
            case 3:
                return "this is getting dumb"
            case 5:
                return "now it's all out of order and I don't know what to do."
            default:
                return 'you dumb AF'
        }

    }


}
