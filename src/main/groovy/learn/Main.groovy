package learn

import groovy.util.logging.Slf4j
import learn.ok.UseMap
import learn.smart.UseDependencyInjection
import learn.dumb.UseIf
import learn.dumb.UseSwitch
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@Slf4j
class Main implements CommandLineRunner{

    @Autowired
    UseIf anIf

    @Autowired
    UseSwitch aSwitch

    @Autowired
    UseDependencyInjection dependencyInjection

    @Autowired
    UseMap useMap

    static void main(String[] args){
        SpringApplication.run(Main.class, args)
    }

    @Override
    void run(String... args) throws Exception {

        for(int i=0; i<=6; i++){
            log.info(aSwitch.use(i))
            log.info(anIf.use(i))
            log.info(dependencyInjection.use(i))
            log.info(useMap.use(i))
        }



    }
}
