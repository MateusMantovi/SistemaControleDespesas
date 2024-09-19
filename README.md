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







