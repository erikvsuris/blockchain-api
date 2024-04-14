package com.ages.blockchainapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.crypto.Credentials;
import org.web3j.tx.Contract;

import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class TestConnection {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Web3j web3j = Web3j.build(new HttpService("https://rpc.sepolia.org"));

        String contractAddress = "0x<CONTRAT_ADDRESS>";

        Credentials credentials = Credentials.create("0x<PRIVATE_KEY>");

        AuthLink contract = new AuthLink(contractAddress, web3j, credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT);


        long start = System.nanoTime();
        System.out.println("\nResult: " + contract.getNFT(BigInteger.valueOf(1)).sendAsync().get());
        long end = System.nanoTime();

        System.out.printf("\nTime: %f s\n", (double)(end - start) / 1000000000);

        System.exit(0);
    }
}