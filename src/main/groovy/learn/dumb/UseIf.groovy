package learn.dumb

import learn.Use
import org.springframework.stereotype.Component

@Component
class UseIf implements Use {

    String use(int something){

        if(something == 0) {
            return "zero I guess"
        }
        else if(something ==1 || something == 2) {
            return "1 or 2"
        }
        else if(something == 3) {
            return "this is getting dumb"
        }
        else if( something == 5) {
            return "now it's all out of order and I don't know what to do."
        }

        return 'you dumb AF'


    }

}
