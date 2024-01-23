package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.domain.BankBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankBranchRepository  extends JpaRepository<BankBranch, Integer> {
    public BankBranch findBynameBranch(String nameBranch);

}
