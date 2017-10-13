package learn.smart.things

import org.springframework.stereotype.Component


@Component
class Thing0 implements Something{

    @Override
    boolean condition(int something) {
        return something == 0
    }

    @Override
    String logic() {
        return "zero I guess"
    }
}
