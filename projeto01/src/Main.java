import domain.Client;
import lib.LoggerCtx;
import repository.ClientMapRepositoryInMemory;
import repository.ClientSetRepositoryInMemory;
import useCases.*;

import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Murilo", "123456",
                "5510312312312", "Sao Paulo",
                "1333", "Sao Paulo", "Sao Paulo");

        LoggerCtx loggerCtx = new LoggerCtx();

        ClientMapRepositoryInMemory clientMapRepositoryInMemory = new ClientMapRepositoryInMemory();
        ClientSetRepositoryInMemory clientSetRepositoryInMemory = new ClientSetRepositoryInMemory();
        CreateClientUseCase createClientUseCase = new CreateClientUseCase(clientSetRepositoryInMemory);
        FindAllClientsUseCase findAllClientsUseCase = new FindAllClientsUseCase(clientSetRepositoryInMemory);
        SearchClientUseCase searchClientUseCase = new SearchClientUseCase(clientSetRepositoryInMemory);
        DeleteClientUseCase deleteClientUseCase = new DeleteClientUseCase(clientSetRepositoryInMemory);
        UpdateClientUseCase updateClientUseCase = new UpdateClientUseCase(clientSetRepositoryInMemory);

        createClientUseCase.execute(client);
        loggerCtx.createLogger(FindAllClientsUseCase.class.getName(), Level.INFO, findAllClientsUseCase.execute().toString());
        loggerCtx.createLogger(SearchClientUseCase.class.getName(), Level.INFO, searchClientUseCase.execute(Long.parseLong("123456")).toString());
        client.setName("Henzo");
        client.setCity("Suzano");
        loggerCtx.createLogger(SearchClientUseCase.class.getName(), Level.INFO, searchClientUseCase.execute(Long.parseLong("123456")).toString());
        updateClientUseCase.execute(Long.parseLong("123456"), client);
        loggerCtx.createLogger(SearchClientUseCase.class.getName(), Level.INFO, searchClientUseCase.execute(Long.parseLong("123456")).toString());
        deleteClientUseCase.execute(Long.parseLong("123456"));
        loggerCtx.createLogger(FindAllClientsUseCase.class.getName(), Level.INFO, findAllClientsUseCase.execute().toString());
    }
}