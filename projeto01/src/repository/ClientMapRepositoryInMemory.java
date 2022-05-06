package repository;

import domain.Client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapRepositoryInMemory implements IClientsRepository{
    private Map<Long, Client> clientMap;

    public ClientMapRepositoryInMemory() {
        this.clientMap = new HashMap<>();
    }

    @Override
    public void create(Client client) {
        this.clientMap.put(client.getCpf(), client);
    }

    @Override
    public void delete(Long cpf, Client client) {
        this.clientMap.remove(cpf, client);
    }

    @Override
    public void update(Client existsClient , Client client) {
            existsClient.setName(client.getName());
            existsClient.setCpf(client.getCpf());
            existsClient.setPhoneNumber(client.getPhoneNumber());
            existsClient.setAddress(client.getAddress());
            existsClient.setNumber(client.getNumber());
            existsClient.setCity(client.getCity());
            existsClient.setState(client.getState());
    }

    @Override
    public Client search(Long cpf) {
        return this.clientMap.get(cpf);
    }

    @Override
    public Collection<Client> findAll() {
        return this.clientMap.values();
    }
}
