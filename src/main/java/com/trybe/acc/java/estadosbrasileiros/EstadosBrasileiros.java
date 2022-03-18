package com.trybe.acc.java.estadosbrasileiros;

import java.util.Random;

public class EstadosBrasileiros {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    // Sorteia uma UF.
    String[] siglas = { "CE", "SC", "AM" };
    int pos = new Random().nextInt(siglas.length);

    // Mostra o nome do estado.
    mostraNomeEstado(siglas[pos]);
  }

  static void mostraNomeEstado(String uf) {
    if (uf == "CE") {
      System.out.println("CEARA");
    } else if (uf == "SC") {
      System.out.println("SANTA CATARINA");
    } else if (uf == "AM") {
      System.out.println("AMAZONAS");
    } else {
      System.out.println("Estado não encontrado");
    }

  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(String nomeEstado) {
    System.out.println(nomeEstado);
  }
}
