package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoServiceIF extends Remote {

    double saldo(Integer conta) throws RemoteException;
    int quantidadeContas() throws RemoteException;
    void adicionarConta(Integer numero, double saldo) throws RemoteException;
}
