package learn.smart.things

import org.springframework.stereotype.Component

@Component
class Thing5 implements Something{
    @Override
    boolean condition(int something) {
        return something == 5
    }

    @Override
    String logic() {
        return "now it's all out of order and I don't know what to do."
    }
}
