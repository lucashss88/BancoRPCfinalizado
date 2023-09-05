package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {

    // private Map<String, Double> saldoContas;
    private ArrayList<Conta> contas;

    public BancoServiceServer() throws RemoteException {
        contas = new ArrayList<Conta>();
        // saldoContas = new HashMap<>();
        // saldoContas.put("1", 100.0);
        // saldoContas.put("2", 156.0);
        // saldoContas.put("3", 950.0);
    }

    @Override
    public double saldo(Integer conta) throws RemoteException {
        double saldo = 0;
        for (int i = 0; i < contas.size(); i++){           
            if (i == conta){
                saldo = contas.get(i).saldo;
            }
        }
        return saldo;
    }

    @Override
    public int quantidadeContas() throws RemoteException {
        return contas.size();
    }

    @Override
    public void adicionarConta(Integer numero, double saldo) throws RemoteException {
        Conta conta = new Conta(numero, saldo);
        contas.add(conta);
    }

}
