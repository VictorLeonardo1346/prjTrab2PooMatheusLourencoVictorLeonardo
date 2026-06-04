
package fatec.poo.model;

public class LocacaoVeiculo {
    private int codigo;
    private String nomeCliente;
    private String tipoCliente;
    private String placaCarro;
    private double taxaLocacao;
    private int kmRodados;
    private double valorLocacao;

    public LocacaoVeiculo(int codigo, String nomeCliente) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public void setTaxaLocacao(double taxaLocacao) {
        this.taxaLocacao = taxaLocacao;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public double getTaxaLocacao() {
        return taxaLocacao;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }
    
    public double calcValorPagar(double valorKm){
        double kmCobrado;
        
        if(tipoCliente == "Premium"){
            kmCobrado = kmRodados * 0.9; // aplicando o desconto de 10% 
        }else{
            kmCobrado = kmRodados; // Valor sem desconto
        }
        
        valorLocacao = kmCobrado * valorKm; // Calcula o valor da locação
        
        valorLocacao += valorLocacao * (taxaLocacao / 100); // Aplica a taxa de 
                                                 // locação sobre o valor final
        
        return valorLocacao;
    }
}
