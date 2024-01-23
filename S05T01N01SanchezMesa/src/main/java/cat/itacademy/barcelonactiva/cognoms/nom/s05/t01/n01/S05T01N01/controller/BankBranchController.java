package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.controller;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.S05T01N01.model.services.BankBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankBranchController {

    @Autowired
    private BankBranchService service;

    @GetMapping({"api/v1","/"})
    public String listBankBranch(Model model){
        model.addAttribute("branches", service.getAllBranch());
        return "branches";
    }


// TODO proyecto web 


}
