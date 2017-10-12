package dumb

import groovy.util.logging.Slf4j
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

    static void main(String[] args){
        SpringApplication.run(Main.class, args)
    }

    @Override
    void run(String... args) throws Exception {

        for(int i=0; i<=6; i++){
            log.info(aSwitch.thing(i))
            log.info(anIf.thing(i))
            log.info(dependencyInjection.thing(i))
        }



    }
}
