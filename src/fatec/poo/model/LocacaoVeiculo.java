
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
    
        if(tipoCliente.equals("Premium")){
            kmCobrado = kmRodados * 0.9; 
        }else{
            kmCobrado = kmRodados; 
        }
        
        valorLocacao = kmCobrado * valorKm; 
        
        valorLocacao += valorLocacao * (taxaLocacao / 100);

        return valorLocacao;
    }
}
