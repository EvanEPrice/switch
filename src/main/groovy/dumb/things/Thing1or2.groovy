package dumb.things

import org.springframework.stereotype.Component

@Component
class Thing1or2 implements Something {

    @Override
    boolean condition(int something) {
        return something == 1 || something == 2
    }

    @Override
    String logic() {
        return "1 or 2"
    }
}
