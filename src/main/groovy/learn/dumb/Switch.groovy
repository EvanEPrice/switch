package learn.dumb

import org.springframework.stereotype.Component

@Component
class Switch implements DoThing{


    String thing(int something){

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
                return 'you learn.dumb AF'
        }

    }


}
