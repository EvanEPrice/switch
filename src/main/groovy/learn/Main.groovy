package learn

import groovy.util.logging.Slf4j
import learn.ok.UseMap
import learn.smart.DependencyInjection
import learn.dumb.If
import learn.dumb.Switch
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@Slf4j
class Main implements CommandLineRunner{

    @Autowired
    If anIf

    @Autowired
    Switch aSwitch

    @Autowired
    DependencyInjection dependencyInjection

    @Autowired
    UseMap useMap

    static void main(String[] args){
        SpringApplication.run(Main.class, args)
    }

    @Override
    void run(String... args) throws Exception {

        for(int i=0; i<=6; i++){
            log.info(aSwitch.thing(i))
            log.info(anIf.thing(i))
            log.info(dependencyInjection.thing(i))
            log.info(useMap.thing(i))
        }



    }
}
