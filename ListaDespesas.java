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
