package com.andrade.kaio.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> login() {
        System.out.println("Digite o seu usuário:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a sua senha:");
        String senha = scanner.nextLine();

        ArrayList<String> dados = new ArrayList<>();
        dados.add(usuario);
        dados.add(senha);

        return dados;
    }
}
