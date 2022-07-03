package br.com.murilo.service;

import br.com.murilo.dao.IContractDAO;
import br.com.murilo.domain.Contract;

public class ContractService implements IContractsService{

    private final IContractDAO iContractDAO;

    public ContractService(IContractDAO iContractDAO) {
        this.iContractDAO = iContractDAO;
    }

    @Override
    public String save() {
        this.iContractDAO.save();
        return null;
    }

    @Override
    public Contract find(int id) {
        this.iContractDAO.find(id);
        return null;
    }

    @Override
    public void remove(int id) {
        this.iContractDAO.remove(id);
    }

    @Override
    public Contract update(Contract contract) {
        this.iContractDAO.update(contract);
        return null;
    }
}
