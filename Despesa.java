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