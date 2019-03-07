package ejemplobuilder;

/**
 *
 * @author clamascabaleiro
 */
public class Pizza {
    private int grHarina;
    private int mlAgua;
    private int grSal;
    private int mlAceite;
    private String tipoAceite;
    private int grTomate;
    private int grQueso;
    private String tipoQueso;
    private int grPinha;
    
    public Pizza() {
    }

    public Pizza(int grHarina, int mlAgua, int grSal, int mlAceite, String tipoAceite, int grTomate, int grQueso, String tipoQueso, int grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    public void setGrHarina(int grHarina) {
        this.grHarina = grHarina;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }

    public void setGrSal(int grSal) {
        this.grSal = grSal;
    }

    public void setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public void setGrTomate(int grTomate) {
        this.grTomate = grTomate;
    }

    public void setGrQueso(int grQueso) {
        this.grQueso = grQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void setGrPinha(int grPinha) {
        this.grPinha = grPinha;
    }

    public int getGrHarina() {
        return grHarina;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public int getGrSal() {
        return grSal;
    }

    public int getMlAceite() {
        return mlAceite;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public int getGrTomate() {
        return grTomate;
    }

    public int getGrQueso() {
        return grQueso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public int getGrPinha() {
        return grPinha;
    }
    
    public void calentar(){
        
    }
    
    
    
    

}
