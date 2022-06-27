package br.com.maddytec.cliente.service;

import br.com.maddytec.cliente.entity.Cliente;
import br.com.maddytec.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }
    
    public Optional<Cliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public void salvar(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }

}
