public class CifraDeCesar {

    private String mensagem;
    private int seed;
    
    public CifraDeCesar(String mensagem, int seed) {
        this.mensagem = mensagem;
        this.seed = seed;
    }

    public void criptografia(){
        char[] arrayMensagem = mensagem.toCharArray();
        for (int i = 0; i < arrayMensagem.length; i++) {
            arrayMensagem[i] = (char) (arrayMensagem[i] + seed);
        }
        System.out.println(arrayMensagem);
    }

    public String mensagemCifrada() {
        return "";
    }
    
}
