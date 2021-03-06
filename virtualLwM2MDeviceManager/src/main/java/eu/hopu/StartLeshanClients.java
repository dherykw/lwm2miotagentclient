package eu.hopu;

import org.eclipse.leshan.client.californium.LeshanClient;

import java.util.List;

public class StartLeshanClients {

    private List<LeshanClient> leshanClients;

    public StartLeshanClients(List<LeshanClient> leshanClients) {
        this.leshanClients = leshanClients;
    }


    public void execute() {
        for (LeshanClient client : leshanClients)
            client.start();
    }
}
