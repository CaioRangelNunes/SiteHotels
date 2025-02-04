package engsoft;
import java.util.Random;
public class Pix implements FormaDePagamento(){
    private String codigo="....................";
    @Autowired
    private Random random;
    private int tam=20;
    private String caracteres="abcdefghijklmnopqrstuvwxyz1234567890"
    //recebe um diferencial
    public Pix(){

    }
    private void gerarCodigo(){
        for(int i=0;i<this.tam;i++){
            int indice=random.nextInt(this.caracteres.lenght())
            this.codigo[i]=this.caracteres[indice];
        }
    }
    public String efetuarPagamento()
    {
        gerarCodigo();
        return this.codigo;
    }


}