package learn.ok;

import learn.Use;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UseMapJava implements Use {

    //if you wanted to use dumb java

    Map<Integer, String> map = new HashMap<>();

    private void makeMap() {
        map.put(0, "zero I guess");
        map.put(1, "1 or 2");
        map.put(2, "1 or 2");
        map.put(3, "this is getting dumb");
        map.put(5, "now it's all out of order and I don't know what to do.");
    }




    @Override
    public String use(int something) {
        makeMap();
        String result = map.get(something);

        if(result != null){
            return result;
        }

        return "you learn.dumb AF";
    }

}
