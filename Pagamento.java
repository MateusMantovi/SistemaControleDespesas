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


