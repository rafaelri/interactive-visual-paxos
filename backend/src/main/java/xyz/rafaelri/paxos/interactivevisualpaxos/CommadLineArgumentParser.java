package xyz.rafaelri.paxos.interactivevisualpaxos;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CommadLineArgumentParser implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CommadLineArgumentParser.class);
    
    public void run(String... args) throws Exception {
        List<String> arguments = Arrays.asList(args);
        if (arguments.size() < 3) {
            logger.error("Please provide the id and at least 2 peers");
            System.exit(1);
        }
        int id = Integer.parseInt(arguments.get(0));
        List<String> peers = arguments.subList(1, arguments.size());
        logger.info(String.format("Paxos id: %d",id));
        logger.info(String.format("Paxos peers: %s",peers));
    }
    
}