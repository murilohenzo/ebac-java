package application;

import domain.Client;
import lib.LoggerCtx;
import repository.ClientMapRepositoryInMemory;
import repository.IClientsRepository;
import useCases.CreateClientUseCase;

import javax.swing.*;
import java.util.logging.Level;

public class App {
    private static IClientsRepository I_CLIENTS_REPOSITORY;

    public static void main(String[] args) {
        I_CLIENTS_REPOSITORY = new ClientMapRepositoryInMemory();

        String option = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusao, 4 para alteracao ou 5 para sair",
                "Menu", JOptionPane.INFORMATION_MESSAGE);

        while (!isValidOption(option)) {
            if ("".equals(option)) {
                exit();
            }
            option = JOptionPane.showInputDialog(null,
                    "Opcao invalida digite 1 para cadastro, 2 para consultar, 3 para exclusao, 4 para alteracao ou 5 para sair",
                    "Menu", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isValidOption(option)) {
            if (isExitOption(option)) {
                exit();
            } else if (isCreateOption(option)) {
                String data = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                create(data);
            }
        }

        if (isCreateOption(option)) {
            JOptionPane.showMessageDialog(null, "Opcao" + option, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void create(String data) {
        String[] splitData = data.split(",");
        CreateClientUseCase createClientUseCase = new CreateClientUseCase(I_CLIENTS_REPOSITORY);

        if (Boolean.TRUE.equals(clientCreated(splitData, createClientUseCase))) {
            LoggerCtx.createLogger(Level.INFO, CreateClientUseCase.class.getName(), "Create client", "Successful Action");
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            LoggerCtx.createLogger(Level.INFO, CreateClientUseCase.class.getName(), "Create client", "Already exists client in database");
            JOptionPane.showMessageDialog(null, "Cliente ja se encontra cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static Boolean clientCreated(String[] splitData, CreateClientUseCase createClientUseCase) {
        switch (splitData.length) {
            case 7: {
                return createClientUseCase.execute(new Client(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4], splitData[5], splitData[6]));
            }
            case 6: {
                return createClientUseCase.execute(new Client(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4], splitData[5]));
            }
            case 5: {
                return createClientUseCase.execute(new Client(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4]));
            }
            case 4: {
                return createClientUseCase.execute(new Client(splitData[0], splitData[1], splitData[2], splitData[3]));
            }
            case 3: {
                return createClientUseCase.execute(new Client(splitData[0], splitData[1], splitData[2]));
            }
            case 2: {
                return createClientUseCase.execute(new Client(splitData[0], splitData[1]));
            }
            default: {
                return false;
            }
        }
    }

    private static boolean isExitOption(String option) {
        return "5".equals(option);
    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Ate logo", "ERRO", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

    private static boolean isValidOption(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option) || "5".equals(option);
    }

    private static boolean isCreateOption(String option) {
        return "1".equals(option);
    }
}
