package repository;

import domain.Client;

import java.util.*;
import java.util.stream.Collectors;

public class ClientSetRepositoryInMemory implements IClientsRepository{
    private final HashSet<Client> clientSet;

    public ClientSetRepositoryInMemory() {
        this.clientSet = new HashSet<>();
    }

    @Override
    public void create(Client client) {
        this.clientSet.add(client);
    }

    @Override
    public void delete(Long cpf) {
        Client existClient = this.clientSet.stream().filter(c -> Objects.equals(c.getCpf(), cpf)).findAny().orElse(null);
        this.clientSet.remove(existClient);
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
        return this.clientSet.stream().filter(c -> Objects.equals(c.getCpf(), cpf)).findAny().orElse(null);
    }

    @Override
    public Collection<Client> findAll() {
        return this.clientSet;
    }
}
