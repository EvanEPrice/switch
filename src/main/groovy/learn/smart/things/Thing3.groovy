package learn.smart.things

import org.springframework.stereotype.Component

@Component
class Thing3 implements Something{
    @Override
    boolean condition(int something) {
        return something == 3
    }

    @Override
    String logic() {
        return "this is getting dumb"
    }
}
