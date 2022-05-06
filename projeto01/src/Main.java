import domain.Client;
import repository.ClientMapRepositoryInMemory;
import useCases.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Murilo", "123456", "5510312312312", "Sao Paulo", "1333", "Sao Paulo", "Sao Paulo");

        ClientMapRepositoryInMemory clientMapRepositoryInMemory = new ClientMapRepositoryInMemory();
        CreateClientUseCase createClientUseCase = new CreateClientUseCase(clientMapRepositoryInMemory);
        FindAllClientsUseCase findAllClientsUseCase = new FindAllClientsUseCase(clientMapRepositoryInMemory);
        SearchClientUseCase searchClientUseCase = new SearchClientUseCase(clientMapRepositoryInMemory);
        DeleteClientUseCase deleteClientUseCase = new DeleteClientUseCase(clientMapRepositoryInMemory);
        UpdateClientUseCase updateClientUseCase = new UpdateClientUseCase(clientMapRepositoryInMemory);

        createClientUseCase.execute(client);
        System.out.println(findAllClientsUseCase.execute());
        System.out.println(searchClientUseCase.execute(Long.parseLong("123456")));
        client.setName("Henzo");
        client.setCity("Suzano");
        updateClientUseCase.execute(Long.parseLong("123456"), client);
        System.out.println(searchClientUseCase.execute(Long.parseLong("123456")));
        deleteClientUseCase.execute(Long.parseLong("123456"));
        System.out.println(findAllClientsUseCase.execute());
    }
}