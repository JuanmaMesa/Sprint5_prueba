package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.services.impl;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.repository.BankBranchRepository;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankBranchImpl implements BankBranchService {

    @Autowired
    private BankBranchRepository repository;
    @Override
    public List<BankBranch> getAllBranch() {
        return repository.findAll();
    }

    @Override
    public BankBranch getOneBranch(Integer id) {
        return null;
    }

    @Override
    public void addBankBranch(BankBranch bankBranch) {

    }

    @Override
    public void updateBranch(BankBranch bankBranch) {

    }

    @Override
    public void deleteBranch(Integer id) {

    }

    @Override
    public BankBranch findByName(String nameBranch) {
        return null;
    }
}
