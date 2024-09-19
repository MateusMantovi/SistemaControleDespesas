# SistemaControleDespesas
Sistema básico de controle de sistemas em Java


# Sistema de Controle de Despesas

## Descrição Geral
Este projeto é um sistema simples de controle de despesas desenvolvido em Java. O objetivo é fornecer uma ferramenta básica para gerenciar despesas, registrar pagamentos e gerenciar usuários, com foco em princípios de POO (Programação Orientada a Objetos).

### Funcionalidades
1. **Entrar Despesa:** Permite ao usuário registrar novas despesas.
2. **Anotar Pagamento:** Permite registrar o pagamento de uma despesa.
3. **Listar Despesas:** Exibe todas as despesas (pagas e pendentes) dentro de um período definido.
4. **Gerenciar Tipos de Despesa:** Adiciona ou lista categorias para as despesas.
5. **Gerenciar Usuários:** Permite o cadastro e autenticação de usuários.
6. **Criptografia de Senhas:** Utiliza o algoritmo SHA-256 para armazenar senhas de forma segura.

### Arquitetura do Sistema
O sistema é dividido em várias classes, cada uma responsável por uma parte específica da lógica de negócios. Abaixo está um resumo das principais classes e suas responsabilidades:

- **Main:** Inicia o programa e exibe o menu principal.
- **MenuPrincipal:** Lida com a interface do usuário e invoca as funcionalidades correspondentes.
- **Despesa:** Representa uma despesa com atributos como descrição, valor, data de vencimento e categoria.
- **Pagamento:** Registra um pagamento, associando data e valor.
- **ListaDespesas:** Gerencia uma lista de despesas e permite listar despesas pagas ou pendentes.
- **TipoDespesa:** Gerencia categorias de despesas.
- **Usuario:** Armazena o login e senha (criptografada) de um usuário.
- **GerenciarUsuarios:** Responsável por adicionar e listar usuários.
- **Criptografia:** Implementa a criptografia de senha usando o algoritmo SHA-256.

Codigo completo abaixo:
public class Main {
  public static void main(String[] args) {
      MenuPrincipal menu = new MenuPrincipal();
      menu.exibirMenu();
  }
}
import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Entrar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto no período");
            System.out.println("4. Listar Despesas Pagas no período");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Chamar método para entrar despesa
                    break;
                case 2:
                    // Chamar método para anotar pagamento
                    break;
                case 3:
                    // Chamar método para listar despesas em aberto
                    break;
                case 4:
                    // Chamar método para listar despesas pagas
                    break;
                case 5:
                    // Chamar método para gerenciar tipos de despesa
                    break;
                case 6:
                    // Chamar método para gerenciar usuários
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }
}

public class Despesa {
  private String descricao;
  private double valor;
  private String dataVencimento;
  private String categoria;

  public Despesa(String descricao, double valor, String dataVencimento, String categoria) {
      this.descricao = descricao;
      this.valor = valor;
      this.dataVencimento = dataVencimento;
      this.categoria = categoria;
  }

  // Getters e Setters
  public String getDescricao() {
      return descricao;
  }

  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }

  public double getValor() {
      return valor;
  }

  public void setValor(double valor) {
      this.valor = valor;
  }

  public String getDataVencimento() {
      return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
      this.dataVencimento = dataVencimento;
  }

  public String getCategoria() {
      return categoria;
  }

  public void setCategoria(String categoria) {
      this.categoria = categoria;
  }
}
public class Pagamento {
  private String dataPagamento;
  private double valorPagamento;

  public Pagamento(String dataPagamento, double valorPagamento) {
      this.dataPagamento = dataPagamento;
      this.valorPagamento = valorPagamento;
  }

  public String getDataPagamento() {
      return dataPagamento;
  }

  public double getValorPagamento() {
      return valorPagamento;
  }

  @Override
  public String toString() {
      return "Pagamento{" +
              "dataPagamento='" + dataPagamento + '\'' +
              ", valorPagamento=" + valorPagamento +
              '}';
  }
}
public class ListaDespesas {
  private String descricao;
  private double valor;
  private boolean paga;

  // Constructor
  public ListaDespesas(String descricao, double valor, boolean paga) {
      this.descricao = descricao;
      this.valor = valor;
      this.paga = paga;
  }

  // Getter for 'paga'
  public boolean isPaga() {
      return paga;
  }

  // Setter for 'paga'
  public void setPaga(boolean paga) {
      this.paga = paga;
  }

  @Override
  public String toString() {
      return "Despesa{" +
              "descricao='" + descricao + '\'' +
              ", valor=" + valor +
              ", paga=" + paga +
              '}';
  }
}
import java.util.ArrayList;
import java.util.List;

public class TipoDespesa {
    private List<String> tipos = new ArrayList<>();

    public void adicionarTipo(String tipo) {
        tipos.add(tipo);
    }

    public void listarTipos() {
        for (String tipo : tipos) {
            System.out.println(tipo);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class GerenciarUsuarios {
    private List<Usuario> usuarios;

    public GerenciarUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Login: " + usuario.getLogin());
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class GerenciarUsuarios {
    private List<Usuario> usuarios;

    public GerenciarUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Login: " + usuario.getLogin());
        }
    }
}

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
    public static String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}










