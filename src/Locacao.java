import javax.xml.crypto.Data;

public class Locacao {

    private double valorLocacao;
    private double valorMulto;
    private Funcionario funcionario;
    private Usuario usuario;
    private Livro livro;
    private Livro liroLocado;
    private Data dataLocacao;
    private Data dataDevolucao;

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulto() {
        return valorMulto;
    }

    public void setValorMulto(double valorMulto) {
        this.valorMulto = valorMulto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLiroLocado() {
        return liroLocado;
    }

    public void setLiroLocado(Livro liroLocado) {
        this.liroLocado = liroLocado;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}