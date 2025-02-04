package engsoft;
public class abstract Cartao implements FormaDePagamento(){
    private String numeroCartao;
    private String titular;
    public Cartão(String numeroCartao, String titular){
        this.numeroCartao=numeroCartao;
        this.titular=titular;
    }
    abstract void efetuarPagamento()
    {

    }


}